public class WordCount {
    public WordCount() {

    }

    public int countWords(String s) {
        int count = 0;

        if (!(s == null || s.isEmpty())) {
            String w[] = s.split( "\\s+");
            count = w.length;
        }
        return count;
    }

    public int countSymbol(String s, boolean countSpaces) {
        int count = 0;

        if(!(s == null || s.isEmpty())) {
            if (countSpaces) {
                count = s.length();
            } else {
                count = s.replace(" ", "").length();
            }
        }
        return count;
    }
}
