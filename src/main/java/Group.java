import java.util.ArrayList;
import java.util.List;

public class Group implements Average{
    private int nrGrupa;
    private Section sectie;
    private List<Student> studentList = new ArrayList<>();

    public Group(){}

    public Group(int nrGrupa, Section sectie, List<Student> studentList) {
        this.nrGrupa = nrGrupa;
        this.sectie = sectie;
        this.studentList = studentList;
    }

    public void addStudent(Student s){
        studentList.add(s);
    }

    public void removeStudent(Student s){
        studentList.remove(s);
    }

    @Override
    public float calculMedie() {
        float medie = 0.0f;
        int k = 0;
        for(Student s: studentList){
            medie += s.calculMedie();
            k++;
        }
        return medie/k;
    }
}
