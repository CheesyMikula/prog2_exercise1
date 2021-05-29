package at.ac.fhcampuswien;

import java.util.Locale;

public class App {

    public static boolean checkPassword(String string){

        if(string.length() < 8 || string.length() > 25){
            return false;
        }
        else if(string.equals(string.toUpperCase()) || string.equals(string.toLowerCase())){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
