package com.example.learningthreading;

public class Person extends Thread{
    String Username, UserMsg;
    public Person(String name){
        this.Username = name;
    }

    public void setUserMsg(String userMsg) {
        this.UserMsg = userMsg;
//        notify();
    }

    public String getUsername() {
        return Username;
    }

    public String getUserMsg() {
        return UserMsg;
    }
}
