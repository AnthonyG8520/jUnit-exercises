import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student ant = new Student(1,"Anthony");
    Student tony = new Student(2, "Tony");


    @Before
    public void init(){
        ant.addGrade(100);
        ant.addGrade(50);
        tony.addGrade(100);
        tony.addGrade(50);
        tony.addGrade(20);

    }



    @Test
    public void studentCanBeCreated(){
        assertEquals("Anthony", ant.getName());
        assertEquals(1, ant.getId());
    }

    @Test
    public void canAddGrade(){
        assertSame(100, ant.grades.get(0));
        assertSame(20, tony.grades.get(2));
    }

    @Test
    public void canGetAverage (){
        assertEquals(75.0, ant.getGradeAverage(),0);
    }

}
