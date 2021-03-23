package problem.makeinterface;

import builder.Director;
import builder.TextBuilder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            builder.TextBuilder textBuilder = new TextBuilder();
            builder.Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }
    }
    public static void usage(){
        System.out.println("Usage: java Main plain   プレーンテキストで文書作成");
        System.out.println("Usage: java Main html   HTMLで文書作成");
    }
}
