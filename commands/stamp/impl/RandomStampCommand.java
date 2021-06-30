package net.yukkuritaku.discordbot.commands.stamp.impl;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;
import java.util.List;
import java.util.Random;

public final class RandomStampCommand extends Command {

    private static final int Num = 10;

    public RandomStampCommand(){
        this.name = "randomstamp";
        this.help = "プロセカ全てのスタンプから1個選ばれるやつでございまし";
        this.aliases = new String[] {"rngst", "rs"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        try {
            final List<RandomStamps> Values = List.of(RandomStamps.values());
            final int Size = Values.size();
            final Random rng = new Random();
            final RandomStamps randomStamps = Values.get(rng.nextInt(Size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + randomStamps + "_rip/" + randomStamps + "/" + randomStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + randomStamps + "_rip/" + randomStamps + "/" + randomStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.astolfo(1, 1, 0.4f, 1.0f, 1));
            ReplyUtils.logInfo(event, "表示されなかったら教えてください");
            System.out.println("https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + randomStamps + "_rip/" + randomStamps + "/" + randomStamps + ".png");
            event.reply(embedBuilder.build());
        }
        catch (Exception exception){
            ReplyUtils.logException(event, exception.toString());
            exception.printStackTrace();
        }
    }

    public enum RandomStamps{
        //TODO 流石に429個もメモしてらんない
        //
        stamp0431,

        stamp0430,

        stamp0429,

        stamp0428,

        stamp0427,

        stamp0426,

        stamp0425,

        stamp0424,

        stamp0423,

        stamp0422,

        stamp0421,

        stamp0420,

        stamp0419,

        stamp0418,

        stamp0417,

        stamp0416,

        stamp0415,

        stamp0414,

        stamp0413,

        stamp0412,

        stamp0411,

        stamp0410,

        stamp0409,

        stamp0408,

        stamp0407,

        stamp0406,

        stamp0405,

        stamp0404,

        stamp0403,

        stamp0402,

        stamp0401,

        //TODO 400以下
        stamp0400,

        stamp0399,

        stamp0398,

        stamp0397,

        stamp0396,

        stamp0395,

        stamp0394,

        stamp0393,

        stamp0392,

        stamp0391,

        stamp0390,

        stamp0389,

        stamp0388,

        stamp0387,

        stamp0386,

        stamp0385,

        stamp0384,

        stamp0383,

        stamp0382,

        stamp0381,

        stamp0380,

        stamp0379,

        stamp0378,

        stamp0377,

        stamp0376,

        stamp0375,

        stamp0374,

        stamp0373,

        stamp0372,

        stamp0371,

        stamp0370,

        stamp0369,

        stamp0368,

        stamp0367,

        stamp0366,

        stamp0365,

        stamp0364,

        stamp0363,

        stamp0362,

        stamp0361,

        stamp0360,

        stamp0359,

        stamp0358,

        stamp0357,

        stamp0356,

        stamp0355,

        stamp0354,

        stamp0353,

        stamp0352,

        stamp0351,

        stamp0350,

        stamp0349,

        stamp0348,

        stamp0347,

        stamp0346,

        stamp0345,

        stamp0344,

        stamp0343,

        stamp0342,

        stamp0341,

        stamp0340,

        stamp0339,

        stamp0338,

        stamp0337,

        stamp0336,

        stamp0335,

        stamp0334,

        stamp0333,

        //TODO Not Exist
        //stamp0332,

        //TODO Not Exist
        //stamp0331,

        //TODO Not Exist
        //stamp0330,

        stamp0329,

        //TODO Not Exist
        //stamp0328,

        stamp0327,

        //TODO Not Exist
        //stamp0326,

        //TODO Not Exist
        //stamp0325,

        //TODO Not Exist
        //stamp0324,

        stamp0323,

        //TODO Not Exist
        //stamp0322,

        //TODO Not Exist
        //stamp0321,

        //TODO Not Exist
        //stamp0320,

        stamp0319,

        //TODO Not Exist
        //stamp0318,

        //TODO Not Exist
        //stamp0317,

        //TODO Not Exist
        //stamp0316,

        stamp0315,

        //TODO Not Exist
        //stamp0314,

        //TODO Not Exist
        //stamp0313,

        stamp0312,

        stamp0311,

        stamp0310,

        stamp0309,

        //TODO Not Exist
        //stamp0308,

        //TODO Not Exist
        //stamp0307,

        //TODO Not Exist
        //stamp0306,

        stamp0305,

        stamp0304,

        stamp0303,

        stamp0302,

        //TODO Not Exist
        //stamp0301,

        //TODO 300以下

        //TODO Not Exist
        //stamp0300,

        //TODO Not Exist
        //stamp0299,

        //TODO Not Exist
        //stamp0298,

        stamp0297,

        stamp0296,

        stamp0295,

        stamp0294,

        stamp0293,

        stamp0292,

        stamp0291,

        stamp0290,

        stamp0289,

        stamp0288,

        stamp0287,

        stamp0286,

        stamp0285,

        stamp0284,

        stamp0283,

        stamp0282,

        stamp0281,

        stamp0280,

        stamp0279,

        stamp0278,

        stamp0277,

        stamp0276,

        stamp0275,

        stamp0274,

        stamp0273,

        stamp0272,

        stamp0271,

        stamp0270,

        stamp0269,

        stamp0268,

        stamp0267,

        stamp0266,

        stamp0265,

        stamp0264,

        stamp0263,

        stamp0262,

        stamp0261,

        stamp0260,

        stamp0259,

        stamp0258,

        stamp0257,

        stamp0256,

        stamp0255,

        stamp0254,

        stamp0253,

        stamp0252,

        stamp0251,

        stamp0250,

        stamp0249,

        stamp0248,

        stamp0247,

        stamp0246,

        stamp0245,

        stamp0244,

        stamp0243,

        stamp0242,

        stamp0241,

        stamp0240,

        stamp0239,

        stamp0238,

        stamp0237,

        stamp0236,

        stamp0235,

        stamp0234,

        stamp0233,

        stamp0232,

        stamp0231,

        stamp0230,

        stamp0229,

        stamp0228,

        stamp0227,

        stamp0226,

        stamp0225,

        stamp0224,

        stamp0223,

        stamp0222,

        stamp0221,

        stamp0220,

        stamp0219,

        stamp0218,

        stamp0217,

        stamp0216,

        stamp0215,

        stamp0214,

        stamp0213,

        stamp0212,

        stamp0211,

        stamp0210,

        stamp0209,

        stamp0208,

        stamp0207,

        stamp0206,

        stamp0205,

        stamp0204,

        stamp0203,

        stamp0202,

        stamp0201,

        //TODO 200以下
        stamp0200,

        stamp0199,

        stamp0198,

        stamp0197,

        stamp0196,

        stamp0195,

        stamp0194,

        stamp0193,

        stamp0192,

        stamp0191,

        stamp0190,

        stamp0189,

        stamp0188,

        stamp0187,

        stamp0186,

        stamp0185,

        stamp0184,

        stamp0183,

        stamp0182,

        stamp0181,

        stamp0180,

        stamp0179,

        stamp0178,

        stamp0177,

        stamp0176,

        stamp0175,

        stamp0174,

        stamp0173,

        stamp0172,

        stamp0171,

        stamp0170,

        stamp0169,

        stamp0168,

        stamp0167,

        stamp0166,

        stamp0165,

        stamp0164,

        stamp0163,

        stamp0162,

        stamp0161,

        stamp0160,

        stamp0159,

        stamp0158,

        stamp0157,

        stamp0156,

        stamp0155,

        stamp0154,

        stamp0153,

        stamp0152,

        stamp0151,

        stamp0150,

        stamp0149,

        stamp0148,

        stamp0147,

        stamp0146,

        stamp0145,

        stamp0144,

        stamp0143,

        stamp0142,

        stamp0141,

        stamp0140,

        stamp0139,

        stamp0138,

        stamp0137,

        stamp0136,

        stamp0135,

        stamp0134,

        stamp0133,

        stamp0132,

        stamp0131,

        stamp0130,

        stamp0129,

        stamp0128,

        stamp0127,

        stamp0126,

        stamp0125,

        stamp0124,

        stamp0123,

        stamp0122,

        stamp0121,

        stamp0120,

        stamp0119,

        stamp0118,

        stamp0117,

        stamp0116,

        stamp0115,

        stamp0114,

        stamp0113,

        stamp0112,

        stamp0111,

        stamp0110,

        stamp0109,

        stamp0108,

        stamp0107,

        stamp0106,

        stamp0105,

        stamp0104,

        stamp0103,

        stamp0102,

        stamp0101,

        //TODO 100以下わんだほーい！
        stamp0100,

        stamp0099,

        stamp0098,

        stamp0097,

        stamp0096,

        stamp0095,

        stamp0094,

        stamp0093,

        stamp0092,

        stamp0091,

        stamp0090,

        stamp0089,

        stamp0088,

        stamp0087,

        stamp0086,

        stamp0085,

        stamp0084,

        stamp0083,

        stamp0082,

        stamp0081,

        stamp0080,

        stamp0079,

        stamp0078,

        stamp0077,

        stamp0076,

        stamp0075,

        stamp0074,

        stamp0073,

        stamp0072,

        stamp0071,

        stamp0070,

        //おりおんざのしたでー せっ！（以下略
        stamp0069,

        stamp0068,

        stamp0067,

        stamp0066,

        stamp0065,

        stamp0064,

        stamp0063,

        stamp0062,

        stamp0061,

        stamp0060,

        stamp0059,

        stamp0058,

        stamp0057,

        stamp0056,

        stamp0055,

        stamp0054,

        stamp0053,

        stamp0052,

        stamp0051,

        stamp0050,

        stamp0049,

        stamp0048,

        stamp0047,

        stamp0046,

        stamp0045,

        stamp0044,

        stamp0043,

        stamp0042,

        stamp0041,

        stamp0040,

        //TODO Not Exist
        //stamp0039,

        stamp0038,

        stamp0037,

        //TODO Not Exist
        //stamp0036,

        //TODO Not Exist
        //stamp0035,

        stamp0034,

        //TODO Not Exist
        //stamp0033,

        stamp0032,

        stamp0031,

        stamp0030,

        stamp0029,

        stamp0028,

        stamp0027,

        stamp0026,

        stamp0025,

        stamp0024,

        stamp0023,

        stamp0022,

        stamp0021,

        stamp0020,

        stamp0019,

        stamp0018,

        stamp0017,

        stamp0016,

        stamp0015,

        stamp0014,

        stamp0013,

        stamp0012,

        stamp0011,

        stamp0010,

        stamp0009,

        stamp0008,

        stamp0007,

        stamp0006,

        stamp0005,

        stamp0004,

        stamp0003,

        stamp0002,

        stamp0001,
    }
}