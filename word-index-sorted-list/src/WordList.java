public class WordList {

    Word head;

    public void addWord(Word word) {
        Word h = head;
        Word prev = null;
        if (h == null) {
            head = word;
        } else {
            while (h != null && word.compareTo(h) > 0) {
                prev = h;
                h = h.next;
            }
            if (h == head) {
                word.next = head;
                head = word;
            } else {
                prev.next = word;
                word.next = h;
            }
        }
    }

    public Word wordExist(String word) {
        Word h = head;
        if (h != null) {
            while (h != null && !h.text.equals(word)) {
                h = h.next;
            }
            return h;
        }
        return null;
    }

    public void printWordIndex() {
        Word h = head;
        if (h != null) {
            while (h != null) {
                System.out.println(h.print());
                h = h.next;
            }
        }
    }
}
