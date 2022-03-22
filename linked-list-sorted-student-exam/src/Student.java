public class Student {

    int id;
    String name;
    ExamList examList;

    Student next;

    Student(int id, String name, ExamList examList) {
        this.id = id;
        this.name = name;
        this.examList = examList;
    }

    String createString() {
        return this.id + " - " + this.name;
    }

}
