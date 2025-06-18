package SuperKeyword;

public class Teacher {
    String name = "Mrs. Kapoor";

    void tech() {
        System.out.println("Teaching general subjects.");
    }

    public static class SubjectTeacher extends Teacher {
        String name = "Mr. Sharma";

        void tech() {
            super.tech();
            System.out.println("Teaching Mathematics.");
        }

        void showname() {
            System.out.println("Parent name: " + super.name);
            System.out.println("Child name: " + name);
        }

        public static void main(String[] args) {
            SubjectTeacher teacher = new SubjectTeacher();
            teacher.tech();
            teacher.showname();
        }
    }
}