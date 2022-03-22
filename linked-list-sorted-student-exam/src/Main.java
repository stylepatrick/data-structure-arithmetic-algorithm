public class Main {

    public static void main(String args[]) {

        String[] students = new String[6];
        students[0] = "1 - Patrick, Programming 5";
        students[1] = "1 - Patrick, Java 1";
        students[2] = "1 - Patrick, English 2";
        students[3] = "2 - Michael, Programming 3";
        students[4] = "2 - Miachel, Java 1";
        students[5] = "1 - Patrick, Math 3";

        StudentList studentList = new StudentList();

        for (String student : students) {
            int studentId = Integer.parseInt(student.substring(0, student.indexOf(" ")));
            String studentName = student.substring(student.indexOf("-") + 1, student.indexOf(","));
            String examName = student.substring(student.indexOf(",") + 2, student.lastIndexOf(" "));
            int examRating = Integer.parseInt(student.substring(student.lastIndexOf(" ") + 1));
            Student studentFromList = studentList.exist(studentId);
            if (studentFromList == null) {
                ExamList examList = new ExamList();
                examList.push(examName, examRating);
                studentList.push(studentId, studentName, examList);
            } else {
                studentFromList.examList.push(examName, examRating);}
        }

        studentList.printStudents();

        System.out.println("----------");
        studentList.exist(1).examList.delete("Math");
        studentList.printStudents();

        System.out.println("----------");
        studentList.delete(1);
        studentList.printStudents();

    }
}
