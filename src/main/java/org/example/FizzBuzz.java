package org.example;

public class FizzBuzz {
    public String convert(int number){
        if (is_multiple_of_5(number) && is_multiple_of_3(number)){
            return "FizzBuzz";
        } else if (is_multiple_of_5(number)) {
            return "Buzz";
        } else if(is_multiple_of_3(number)){
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }

    public boolean is_multiple_of_3(int input){
        if(input % 3 == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean is_multiple_of_5(int input){
        if(input % 5 == 0){
            return true;
        } else {
            return false;
        }
    }

}
