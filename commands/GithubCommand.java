package net.yukkuritaku.discordbot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

public final class GithubCommand extends Command {

    public GithubCommand(){
        this.name = "github";
        this.help = "ゆっくりたくのGithubを貼るだけ";
    }

    @Override
    protected final void execute(CommandEvent event) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("ゆっくりたくのGithub\n(Yukkuritaku Discord Botのソース)", "https://github.com/Yukkuritaku/Yukkuritaku-Discord-Bot");
        event.reply(embedBuilder.build());
    }
}
