public class Main {
    public static void main(String[] args) {
        String url = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        SimpleUrl parsedUrl = SimpleUrl.parseUrl(url);

        System.out.println(parsedUrl);
    }
}
