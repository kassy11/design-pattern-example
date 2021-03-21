package adapter.delegate;

// Bannerを委譲してPrintインタフェースを実装する
public class PrintBanner extends Print{
    private Banner banner;
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }
    @Override
    public void printWeek() {
        banner.showWithParen();
    }
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
