public class WordList {

    private List list;

    WordList(String text) {
        list = new List();
        splitText(text);
    }

    private void splitText(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            Word w = new Word(word);
            if (!list.isWordPresent(w)) {
                list.addWord(w);
            }
        }
    }

    public void print() {
        list.print();
    }

}
