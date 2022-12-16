package com.example.myapplication;


import android.util.Log;

public class Cat {
    int age;
    String name;
    String breed;
    String color;


    public Cat(){

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public void talk(){
        Log.i("talk()", "Meow! My name is " + name + ", and I'm " + age + " yaers old. My breed " + breed + ", my color is " + color);
    }

}
