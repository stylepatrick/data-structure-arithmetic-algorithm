public class StudentList {

    Student head;

    void push(int id, String name, ExamList examList) {
        Student h = head;
        Student p = new Student(id, name, examList);
        Student prev = null;
        if (h == null) {
            head = p;
        } else {
            while (h != null && id > h.id) {
                prev = h;
                h = h.next;
            }
            if (h == head) {
                p.next = head;
                head = p;
            } else {
                prev.next = p;
                p.next = h;
            }
        }
    }

    void delete(int id) {
        Student h = head;
        Student prev = null;
        if (h != null) {
            while (h != null && h.id != id) {
                prev = h;
                h = h.next;
            }
            if (h != null) {
                if (h == head) {
                    head = head.next;
                } else {
                    prev.next = h.next;
                }
            }
        }
    }

    Student exist(int id) {
        Student h = head;
        if (h != null) {
            while (h != null && id != h.id) {
                h = h.next;
            }
            return h;
        }
        return null;
    }

    void printStudents() {
        Student h = head;
        if (h != null) {
            StringBuilder student = new StringBuilder();
            while (h != null){
                student.append(h.createString()).append(h.examList.createString()).append("\n");
                System.out.println(student);
                h = h.next;
                student = new StringBuilder();
            }
        }
    }
}
