public class Main {
    public static void main(String[] args) {
        WordCount test = new WordCount();
        String text = "Hello World this is a test";

        int countWords = test.countWords(text);
        int countSymbols = test.countSymbol(text, true);
        int countSymbolsNoSpace = test.countSymbol(text, false);

        System.out.println(countWords);
        System.out.println(countSymbols);
        System.out.println(countSymbolsNoSpace);
    }
}
