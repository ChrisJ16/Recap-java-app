public class MainClass {

    public static void main(String[] args) {
        Student s1 = new Student("Ionel", 20);
        Student s2 = new Student("Alina", 21);
        Student s3 = new Student("Mircea", 22);
        Student s4 = new Student("Victoria", 20);
        Student s5 = new Student("Andreea", 21);
        Professor p1 = new Professor("Victor", 44);

        Group g1 = new Group();
        g1.addStudent(s1);
        g1.addStudent(s2);
        g1.addStudent(s3);
        g1.addStudent(s4);
        g1.addStudent(s5);

        Course c1 = new Course("PL", 4);
        Course c2 = new Course("LFT", 3);
        Course c3 = new Course("RC", 3);
        Course c4 = new Course("PI", 4);
        Course c5 = new Course("PS", 4);
        Course c6 = new Course("SI", 4);
        Course c7 = new Course("Practica1", 4);
        Course c8 = new Course("Practica2", 4);

        s1.addCourse(c1, 10);
        s1.addCourse(c2, 10);
        s1.addCourse(c3, 10);
        s1.addCourse(c4, 10);
        s1.addCourse(c5, 9);
        s1.addCourse(c6, 6);
        s1.addCourse(c7, 5);
        s1.addCourse(c8, 4);

        s2.addCourse(c1, 6);
        s2.addCourse(c2, 8);
        s2.addCourse(c3, 3);
        s2.addCourse(c4, 7);
        s2.addCourse(c5, 9);
        s2.addCourse(c6, 6);
        s2.addCourse(c7, 5);
        s2.addCourse(c8, 4);

        s3.addCourse(c1, 6);
        s3.addCourse(c2, 8);
        s3.addCourse(c3, 5);
        s3.addCourse(c4, 10);
        s3.addCourse(c5, 9);
        s3.addCourse(c6, 8);
        s3.addCourse(c7, 6);
        s3.addCourse(c8, 8);

        s4.addCourse(c1, 8);
        s4.addCourse(c2, 7);
        s4.addCourse(c3, 6);
        s4.addCourse(c4, 5);
        s4.addCourse(c5, 6);
        s4.addCourse(c6, 4);
        s4.addCourse(c7, 6);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println("Medie grupa = " + g1.calculMedie());

    }
}