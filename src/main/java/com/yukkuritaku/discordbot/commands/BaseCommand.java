package com.yukkuritaku.discordbot.commands;

import com.yukkuritaku.discordbot.DiscordBot;
import net.dv8tion.jda.api.events.interaction.GenericInteractionCreateEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.callbacks.IReplyCallback;
import net.dv8tion.jda.internal.utils.tuple.Pair;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
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
    @Nullable
    private final String[] aliases;
    private final List<Pair<String, String>> returnPrefix;

    public BaseCommand(@Nonnull Color color,
                       @Nonnull String commandName,
                       @Nonnull String commandDescription,
                       @Nullable String[] aliases,
                       @Nonnull List<Pair<String, String>> returnPrefix) {
        this.color = color;
        this.commandName = commandName;
        this.commandDescription = commandDescription;
        this.aliases = aliases;
        this.returnPrefix = returnPrefix;
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] splitRaw = event.getMessage().getContentRaw().split("\\s+");
        if (splitRaw[0].equalsIgnoreCase(DiscordBot.PREFIX + getCommandName()) || (
                getAliases() != null && getAliases().length != 0 && Arrays.stream(this.getAliases())
                        .anyMatch(s -> splitRaw[0].equalsIgnoreCase(DiscordBot.PREFIX + s))
        )) {
            onMessageCommandReceived(event);
        }
    }

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if (!event.getName().equals(this.getCommandName())) {
            return;
        }
        onSlashCommandReceived(event);
    }

    protected abstract void onMessageCommandReceived(@NotNull MessageReceivedEvent event);

    protected abstract void onSlashCommandReceived(@NotNull SlashCommandInteractionEvent event);

    public final void checkUrl(IReplyCallback interaction, String url) {
        try (CloseableHttpResponse response = HttpClients.createDefault().execute(new HttpGet(url))) {
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_NOT_FOUND) {
                interaction.reply("[Error]: Website error: 404 Not Found").queue();
            }
        } catch (IOException e) {
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
    @Nullable
    public final String[] getAliases() {
        return this.aliases;
    }

    /**
     * コマンドのプレフィックスを返します。<p>
     * {@link com.yukkuritaku.discordbot.commands.stamp.StampCommand StampCommand}の場合、プレフィックスはSekai Viewer(<a href="https://sekai.best/">https://sekai.best/</a>)のリソースを通して取得されます。<p>
     * スタンプを取得するurlはこんな感じ -> <a href="https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp">https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/stamp</a>[ここ]_rip/stamp[ここ]/stamp[ここ].png<p>
     * [ここ]にはIdを入れる必要があります！ 例えば... 0001<p>
     * *stamp0001でもstampの部分は置き換えられます。*
     *
     * @return コマンドのプレフィックス
     */
    public final List<Pair<String, String>> getReturnPrefix() {
        return this.returnPrefix;
    }
}
