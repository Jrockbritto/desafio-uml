package apps.browser;

public class Browser implements BrowserFunctions {

  @Override
  public void showPage(String url) {
    System.out.println("Displaying " + url);
  }

  @Override
  public void newTab(String url) {
    System.out.println("Switching to new tab " + url);
  }

  @Override
  public void refreshPage() {
    System.out.println("Refreshing current page");
  }
}
