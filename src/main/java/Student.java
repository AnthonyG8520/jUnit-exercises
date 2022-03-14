import java.util.ArrayList;

public class Student {
    ArrayList<Integer> grades;
    private long id;
    private String name;

    public Student(int id, String name) {
        grades = new ArrayList<>();
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(Integer x){
        this.grades.add(x);
    }

    public double getGradeAverage(){
        double average = 0;

        for(Integer grade : this.grades){
            average += grade;
        }
        return average / this.grades.size();
    }

}
