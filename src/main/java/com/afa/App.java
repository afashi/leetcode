package com.afa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List list = new ArrayList();
        list.add(0,6);
        list.add(1,5);
        list.add(2,3);
        list.add(3,4);
        list.sort(Comparator.<Integer>naturalOrder());
        System.out.println( list);
    }
}
