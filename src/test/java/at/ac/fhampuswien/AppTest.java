package at.ac.fhampuswien;

import at.ac.fhcampuswien.App;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @BeforeAll
    static void init(){}

    @BeforeEach
    void setup(){}

    @Description("Testing password length")
    @Test
    public void pwLength1(){

        String string = "Abcdefghi58!";
        assertTrue(App.checkPassword(string));
    }
    @Test
    public void pwLength2(){

        String string = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(App.checkPassword(string));
    }
    @Test
    public void pwLength3(){

        String string = "abcde";
        assertFalse(App.checkPassword(string));
    }

    @Description("Testing Uppercase and Lowercase")
    @Test
    public void UpperLowerCase(){

        String string = "Abcdefghi58!";
        assertTrue(App.checkPassword(string));
    }
    @Test
    public void allUppercase(){

        String string = "ABCDEFGHIJ58!";
        assertFalse(App.checkPassword(string));
    }
    @Test
    public void allLowercase(){

        String string = "abcdefghij58!";
        assertFalse(App.checkPassword(string));
    }

    @Description("Testing numbers")
    @Test
    public void Numbers1(){

        String string = "Abcdefghi58!";
        assertTrue(App.checkPassword(string));
    }
    @Test
    public void Numbers2(){

        String string = "Abcdefghij!";
        assertFalse(App.checkPassword(string));
    }






}
