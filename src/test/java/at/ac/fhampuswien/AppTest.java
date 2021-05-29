package at.ac.fhampuswien;

import at.ac.fhcampuswien.App;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @BeforeAll
    static void init(){}

    @BeforeEach
    void setup(){}

    @Description("Testing password length")
    @Test
    public void pwLength(){

        String string = "abcdefghijk";
        assertTrue(App.checkPassword(string));
    }


}
