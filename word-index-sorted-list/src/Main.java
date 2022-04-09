public class Main {

    public static void main(String[] args) {

        WordIndex wordIndex = new WordIndex();

        String lastPage = "23 New Bruneck";
        String secondPage = "21 Sun Element Index";
        String firstPage = "20 Moon Sun And";
        String thirdPage = "22 And Index Moon";

        wordIndex.addPageToWordIndex(lastPage);
        wordIndex.addPageToWordIndex(secondPage);
        wordIndex.addPageToWordIndex(firstPage);
        wordIndex.addPageToWordIndex(thirdPage);

        wordIndex.print();
    }


}
