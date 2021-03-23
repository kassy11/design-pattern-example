package problem.init;

import builder.Director;
import builder.TextBuilder;

public class Main {
    public static void main(String[] args){
        builder.TextBuilder textBuilder = new TextBuilder();
        builder.Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }
}
