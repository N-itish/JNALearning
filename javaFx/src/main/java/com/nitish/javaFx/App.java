package com.nitish.javaFx;

public class App 
{
    public static void main( String[] args )
    {
    	JNAInterface jnaLib = JNAInterface.INSTANCE;
        jnaLib.printf("Hello World");
    }
}
