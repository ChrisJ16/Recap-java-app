import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Student extends User implements Average{
    private static final int MAX_CREDITS = 30;
    HashMap<Course, Integer> carnet = new HashMap(); //Curs si nota

    public Student(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public int getStudentCredits(){
        AtomicInteger credits = new AtomicInteger();
        carnet.forEach((k,v) ->
                credits.addAndGet(k.getCredits()));
        return credits.get();
    }

    public void addCourse(Course course, int grade){
        if(getStudentCredits() >= MAX_CREDITS)
            System.out.println("Numarul de credite este maxim");
        else
        {
            carnet.put(course, grade);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "Nume=" + super.getName() + " " +
                "nr. total de credite=" + this.getStudentCredits() + " " +
                "medie=" + this.calculMedie() +
                '}';
    }

    @Override
    public float calculMedie() {
        AtomicInteger credits = new AtomicInteger();
        carnet.forEach((k,v) ->
                credits.addAndGet(k.getCredits() * v));
        return credits.get()/MAX_CREDITS;
    }
}
