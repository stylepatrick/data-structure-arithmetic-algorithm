public class ExamList {

    Exam head;

    void push(String name, int rating) {
        Exam h = head;
        Exam p = new Exam(name, rating);
        Exam prev = null;
        if (h == null) {
            head = p;
        } else {
            while (h != null && rating > h.rating) {
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

    void delete(String name) {
        Exam h = head;
        Exam prev = null;
        if (h != null) {
            while (h != null && !name.equals(h.name)) {
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

    String createString() {
        Exam h = head;
        StringBuilder examList = new StringBuilder();
        if (head != null) {
            while (h != null) {
                examList.append("\n").append("  ").append(h.name).append(" - ").append(h.rating);
                h = h.next;
            }
        }
        return examList.toString();
    }

}
