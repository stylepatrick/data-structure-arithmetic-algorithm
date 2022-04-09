public class WordIndex {

    private WordList wordList;

    WordIndex() {
        wordList = new WordList();
    }

    public void addPageToWordIndex(String page) {
        Integer index = Integer.valueOf(page.substring(0, page.indexOf(" ")));
        page = page.substring(page.indexOf(" ") + 1);
        while (page.length() > 0) {
            if (page.indexOf(" ") > 0) {
                String word = page.substring(0, page.indexOf(" "));
                addWordToQueue(word, index);
            } else {
                addWordToQueue(page, index);
                page = "";
            }
            page = page.substring(page.indexOf(" ") + 1);
        }
    }

    public void print() {
        wordList.printWordIndex();
    }

    private void addWordToQueue(String word, Integer index) {
        Word wordFromQueue = wordList.wordExist(word);
        if (wordFromQueue != null) {
            wordFromQueue.addIndex(index);
        } else {
            Word newWord = new Word(word);
            newWord.addIndex(index);
            wordList.addWord(newWord);
        }
    }

}
