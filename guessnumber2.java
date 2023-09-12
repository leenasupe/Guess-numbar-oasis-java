package com.company;

import java.util.Random;
import java.util.Scanner;

class guess1{
    int inputnumber;
    int randomnumber;
    boolean flag=false;
    int count=10;
    guess1()
    {
        Random rand=new Random();
        randomnumber=rand.nextInt(100);
    }
     void input_num()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        inputnumber=sc.nextInt();

    }
    void guessed_1()
    {
        if(inputnumber==randomnumber)
        {
            count--;
            flag=true;
            System.out.println("Congrats ! You guessed it right in "+(10-count)+" attempts ");
            System.out.println("Your score is "+ (100-count*10)+" Out of 100 ");
        }
        else if(inputnumber>randomnumber){
            count--;
            System.out.println("Your guessed number is greater than the generated number  You have "+count+ " attempts left ");

        }
        else {
            count--;
            System.out.println("Your guessed number is less than the generated number You have "+ count+ " attempts left ");
        }
    }

}
public class guessnumber2 {
    public static void main(String[] args) {
        guess1 g = new guess1();
        System.out.println("You have 10 attemps to guess a number ");
        while (g.flag != true && g.count > 0) {
            g.input_num();
            g.guessed_1();
        }
        if (g.flag == false) {
            System.out.println("Number generated was " + g.randomnumber + " You failed to guess in given attempts please try again ");
        }
    }
}








































