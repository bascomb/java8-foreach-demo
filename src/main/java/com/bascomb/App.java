package com.bascomb;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        execute();
    }

    private static void execute() {
        List<String> list = new ArrayList<String>();
        list.add("Bascomb");
        list.add("Justin");

        list.forEach(s ->  System.out.println(s));
    }
}
