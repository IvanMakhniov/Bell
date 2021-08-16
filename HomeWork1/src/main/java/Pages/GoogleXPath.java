package Pages;

public enum GoogleXPath {
    GOOGLE_FILED("//*[@class = 'gLFyf gsfi']"),
    GOOGLE_SEARCH_BUTTON("//*[@value = 'Поиск в Google']"),
    SITE_NAME("//*[@class='yuRUbf']//*[@class='LC20lb DKV0Md']"),
    LINK_NAME("//*[@class='yuRUbf']//*[@class='TbwUpd NJjxre']");

    private final String xPath;
    GoogleXPath(String xPath) {
        this.xPath=xPath;
    }
    public String getXPath(){
        return xPath;
    }
}
