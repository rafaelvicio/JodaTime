package com.rafaelvicio.java;

import java.time.LocalDate;

import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DateTime today = new DateTime();
        System.out.println(today);

        DateTime tomorrow = today.plusDays(2);
        System.out.println(tomorrow);

        DateTime dayOfMonth = tomorrow.withDayOfMonth(6);
        System.out.println(dayOfMonth);

        DateTime now = new DateTime()
        System.out.println(now.toString("dd-MM-yyyy"));

        DateTime a = new DateTime(2017, 12, 20, 1, 0);
        DateTime b = new DateTime(2017, 12, 20, 4, 0);

        Period p = new Period(a, b);
        System.out.println(p.getHours());

        
    }
}
