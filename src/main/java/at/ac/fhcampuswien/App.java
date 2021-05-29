package at.ac.fhcampuswien;

import java.util.Locale;

public class App {

    public static boolean checkPassword(String password){
        int numbersCount = 0;
        int spCharactersCount = 0;

        if(password.length() < 8 || password.length() > 25){
            return false;
        }
        else if(password.equals(password.toUpperCase()) || password.equals(password.toLowerCase())) {
            return false;
        }
        for(int i = 0; i < password.length(); i++){

            char ch = password.charAt(i);
            if(ch >= '0' && ch <= '9'){
                numbersCount++;
            }
            else if(ch == '(' || ch == ')' || ch == '#' || ch == '$' || ch == '?' || ch == '!' || ch == '%' || ch == '/' || ch == '@'){
                spCharactersCount++;
            }

            if(numbersCount > 1){
                if(password.charAt(i-1)+1 == password.charAt(i) && password.charAt(i)+1 == password.charAt(i+1)){
                    return false;
                }
                else if(password.charAt(i-1) == password.charAt(i) && password.charAt(i) == password.charAt(i+1) && password.charAt(i) == password.charAt(i+2)){
                    return false;
                }
            }

        }
        if(numbersCount == 0){
            return false;
        }
        else if(spCharactersCount == 0){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

    }
}
