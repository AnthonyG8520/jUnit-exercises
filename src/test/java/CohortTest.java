import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort Sirius = new Cohort();
    Student ant = new Student(1,"Anthony");
    Student tony = new Student(2,"Tony");

    @Before
    public void init(){
        ant.addGrade(100);
        tony.addGrade(50);
        Sirius.addStudent(ant);
        Sirius.addStudent(tony);
    }

    @Test
    public void canAddStudent(){
        assertSame("Anthony", Sirius.getStudents().get(0).getName());
    }

    @Test
    public void canGetStudents(){
        assertEquals(1, Sirius.getStudents().get(0).getId());
        assertEquals(2, Sirius.getStudents().get(1).getId());
    }

    @Test
    public void canGetCohortAvg(){
        assertEquals(75.0, Sirius.getCohortAverage(),0);
    }



}
