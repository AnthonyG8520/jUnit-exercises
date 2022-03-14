import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class jUnitTests {

        @Test
        public void testIfNameAnthony(){
            String expected = "Anthony";
            String actual = "Anthony";
            assertEquals(expected, actual);
        }

        @Test
        public void testIfChangeIsCorrect(){
            double price = 10.0;
            double discount = 4.5;

            assertEquals(5.5, price - discount, 0);
            assertNotEquals(4.2, price - discount,.5);
        }

        @Test
        public void testIfArraysEqual(){
            int[] numbers = {1, 2, 3};
            int[] otherNumbers = new int[3];
            otherNumbers[0] = 1;
            otherNumbers[1] = 2;
            otherNumbers[2] = 3;
            assertArrayEquals(numbers,otherNumbers);
        }

        @Test
        public void testIfArrayListSame(){
            List<String> languages = new ArrayList<>();
            List<String> moreLanguages = new ArrayList<>();
            assertNotSame(languages,moreLanguages);
        }

        @Test
        public void testIfContains(){
            String language = "PHP";
            assertTrue(language.contains("H")); // use assertTrue for this statement
            assertFalse(language.contains("J")); // use assertFalse for this statement
        }


}
