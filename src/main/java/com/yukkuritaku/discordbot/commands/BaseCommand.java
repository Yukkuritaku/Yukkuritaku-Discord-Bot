package com.yukkuritaku.discordbot.commands;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.Interaction;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.awt.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Random;

/**
 * コマンドのベース
 */
public abstract class BaseCommand extends ListenerAdapter {

    protected static final Random RANDOM = new Random();
    private final Color color;
    private final String commandName;
    private final String commandDescription;
    private final String[] aliases;
    private final List<Pair<String, String>> returnPrefix;

    public BaseCommand(@Nonnull Color color,
                       @Nonnull String commandName,
                       @Nonnull String commandDescription,
                       @Nonnull String[] aliases,
                       @Nonnull List<Pair<String, String>> returnPrefix) {
        this.color = color;
        this.commandName = commandName;
        this.commandDescription = commandDescription;
        this.aliases = aliases;
        this.returnPrefix = returnPrefix;
    }

    @Override
    public abstract void onMessageReceived(@NotNull MessageReceivedEvent event);

    @Override
    public abstract void onSlashCommand(@NotNull SlashCommandEvent event);

    public final void checkUrl(Interaction interaction, String url){
        try {
            URL httpCheck = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) httpCheck.openConnection();
            connection.connect();
            int code = connection.getResponseCode();
            if (code == HttpURLConnection.HTTP_NOT_FOUND) {
                interaction.replyFormat("Http 404 不明なURL指定です。指定されたurl: %s", url).queue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public abstract String getUrl();

    /**
     * このスタンプコマンドの色を返します。
     *
     * @return このスタンプコマンドの色
     */
    public final Color getColor() {
        return color;
    }

    /**
     * スタンプのコマンド名を返します。
     *
     * @return スタンプのコマンド名
     */
    public final String getCommandName() {
        return this.commandName;
    }

    /**
     * このコマンドの詳細を返します。
     *
     * @return このコマンドの詳細
     */
    public final String getCommandDescription() {
        return commandDescription;
    }

    /**
     * このコマンドのエイリアスを返します。
     *
     * @return このコマンドのエイリアス
     */
    public final String[] getAliases() {
        return this.aliases;
    }

    /**
     * コマンドのプレフィックスを返します。<p>
     * {@link com.yukkuritaku.discordbot.commands.stamp.StampCommand StampCommand}の場合、プレフィックスはSekai Viewer(https://sekai.best/)のリソースを通して取得されます。<p>
     * スタンプを取得するurlはこんな感じ -> https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp[ここ]_rip/stamp[ここ]/stamp[ここ].png<p>
     * [ここ]にはIdを入れる必要があります！ 例えば... 0001<p>
     * *stamp0001でもstampの部分は置き換えられます。*
     *
     * @return コマンドのプレフィックス
     */
    public final List<Pair<String, String>> getReturnPrefix() {
        return this.returnPrefix;
    }
}
