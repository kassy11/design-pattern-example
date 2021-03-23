package problem.init;

public class TextBuilder extends Builder{

    private StringBuffer buf = new StringBuffer();
    @Override
    public void buildTitle(String title) {
        buf.append("------------\n");
        buf.append("[" + title + "] \n");
        buf.append("\n");
    }

    @Override
    public void buildString(String str) {
        buf.append(' ' + str + '\n');
        buf.append("\n");
    }

    @Override
    public void buildItems(String[] items) {
        for (int i = 0; i<items.length; i++) {
            buf.append(" " + items[i] + "\n");
        }
        buf.append("\n");
    }

    @Override
    public void buildDone() {
        buf.append("+++++++++++++++++++++\n");
    }
    public String getResult(){
        return buf.toString();
    }
}
