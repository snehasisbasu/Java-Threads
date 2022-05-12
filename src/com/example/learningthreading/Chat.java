package com.example.learningthreading;

import java.util.Scanner;

public class Chat{

    public static boolean chatBreak(boolean msg){
        if (!msg){
            return false;
        }
        return true;
    }

    public static synchronized void main(String[] args) throws InterruptedException{
        Person UserOne = new Person("UserOne");
        Person UserTwo = new Person("UserTwo");
        boolean continueChat = true;
        while (continueChat){
            Scanner sc = new Scanner(System.in);
            UserOne.start();
            String OneMsg = sc.nextLine();
            if (OneMsg.equals('Q') || OneMsg.equals('q')){
                break;
            }
            UserOne.setUserMsg(OneMsg);
//            UserOne.wait();
            System.out.println(UserOne.getUserMsg());
            UserTwo.start();
            String TwoMsg = sc.nextLine();
            if (TwoMsg.equals('Q') || TwoMsg.equals('q')){
                break;
            }
            UserTwo.setUserMsg(TwoMsg);
//            UserTwo.wait();
            System.out.println(TwoMsg);

        }
    }
}
