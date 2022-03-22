public class Exam {

    String name;
    int rating;
    Exam next;

    Exam(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    String createString() {
        return "    " + this.name + " - " + this.rating;
    }
}
