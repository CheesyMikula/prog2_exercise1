package at.ac.fhcampuswien;

public class App {

    public static boolean checkPassword(String string){

        if(string.length() < 8 || string.length() > 25){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
