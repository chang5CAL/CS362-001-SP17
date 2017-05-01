package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {
	int startHour=13;
	int startMinute=30;
	int startDay=10;
	int startMonth=4;
	int startYear=2017;
	String title="Birthday Party";
	String description="This is my birthday party.";
	Appt appt = new Appt(startHour,
			startMinute ,
			startDay ,
			startMonth ,
			startYear ,
			title,
			description);


	 @Test
	  public void test01()  throws Throwable  {
         //Creates an empty CalDay.
         CalDay cal = new CalDay();
         String output = cal.toString();
         assertNull(cal.iterator());
		 assertEquals(false,cal.isValid());
		 assertEquals(cal.toString(),output);

	 }
	@Test
	public void test02()  throws Throwable  {
		//Creates a CalDay that imports.
		GregorianCalendar gregCal = new GregorianCalendar();

		CalDay cal = new CalDay(gregCal);
		Iterator<CalDay> iterator;

		cal.addAppt(appt);
		Appt appt2 = new Appt(10,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                "NewTitle",
                "NewDesc");
		cal.addAppt(appt2);
		String output = cal.toString();

		assertNotNull(cal.iterator());
		assertEquals(2,cal.getSizeAppts());
		assertEquals(true,cal.isValid());
		assertEquals(cal.toString(),output);

	}
    @Test
    public void test03()  throws Throwable  {
        //Creates a CalDay that imports.
        GregorianCalendar gregCal = new GregorianCalendar();

        CalDay cal = new CalDay(gregCal);

        Appt appt2 = new Appt(10,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                "NewTitle",
                "NewDesc");
        cal.addAppt(appt2);
        cal.addAppt(appt);
        String output = cal.toString();

        assertEquals(2,cal.getSizeAppts());
        assertEquals(true,cal.isValid());
        assertEquals(cal.toString(),output);

    }
    @Test
    public void test04()  throws Throwable  {
        //Creates a CalDay that imports.
        GregorianCalendar gregCal = new GregorianCalendar();

        CalDay cal = new CalDay(gregCal);

        Appt appt2 = new Appt(24,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                "NewTitle",
                "NewDesc");
        cal.addAppt(appt2);
        cal.addAppt(appt);
        String output = cal.toString();

        assertNotNull(cal.iterator());
        assertEquals(1,cal.getSizeAppts());
        assertEquals(true,cal.isValid());
        assertEquals(cal.toString(),output);

    }

}
