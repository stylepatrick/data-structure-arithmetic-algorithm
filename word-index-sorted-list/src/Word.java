public class Word implements Comparable<Word> {

    String text;
    Integer[] sites;
    Integer length;
    Word next;

    Word(String text) {
        this.text = text;
        this.length = 0;
        this.sites = new Integer[10];
    }

    public void addIndex(Integer index) {
        if (length < this.sites.length) {
            sites[length] = index;
            length++;
        }
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text).append(" ");
        for (int i = 0; i < sites.length && sites[i] != null; i ++) {
            stringBuilder.append(sites[i]).append(",");
        }
        return stringBuilder.delete(stringBuilder.lastIndexOf(","), stringBuilder.length()).toString();
    }

    @Override
    public int compareTo(Word o) {
        return text.compareTo(o.text);
    }
}
