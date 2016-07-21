package com.company;

public class Main {

    public static void main(String[] args) {
        String hello = new String();
	            hello = "hello world";
	           System.out.println(hello);
thermostat temp1, temp2;
temp1 = new thermostat();
        temp2 = new thermostat();
        System.out.println("Включаю термостат");
        temp1.surface_on();
        System.out.println("Выключаю термостат");
        temp2.surface_off();
double b = temp2.temp_out;
        System.out.println(b);


    }
}
