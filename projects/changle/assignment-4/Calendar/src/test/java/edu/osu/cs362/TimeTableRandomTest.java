package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

	ValuesGenerator v;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 
		 
	 }

	@Test
	public void timeTableTest01() throws Throwable{
	 	TimeTable t = new TimeTable();
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,1000);

		int startDay=v.getRandomIntBetween(random,1,31);
		int startMonth=v.getRandomIntBetween(random,1,12);
		int startYear=v.getRandomIntBetween(random,0,10000);
		int startHour=v.getRandomIntBetween(random,0,23);
		int startMinute=v.getRandomIntBetween(random,0,59);

		GregorianCalendar g = new GregorianCalendar(startYear,startMonth,startDay);

		CalDay c = new CalDay(g);


		String title=v.getString(random);
		String description=v.getString(random);
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		Appt a = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		LinkedList<Appt> ll = new LinkedList();
		ll.add(appt);
        t.deleteAppt(ll,a);
        assertEquals(1,ll.size());
        a = appt;
		t.deleteAppt(ll,a);
		assertEquals(0,ll.size());

	}
	@Test
	public void timeTableTest02() throws Throwable{
		TimeTable t = new TimeTable();
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,1000);

		int startDay=v.getRandomIntBetween(random,1,31);
		int startMonth=v.getRandomIntBetween(random,1,12);
		int startYear=v.getRandomIntBetween(random,0,10000);
		int startHour=v.getRandomIntBetween(random,0,23);
		int startMinute=v.getRandomIntBetween(random,0,59);

		GregorianCalendar g = new GregorianCalendar(startYear,startMonth,startDay);

		CalDay c = null;


		String title=v.getString(random);
		String description=v.getString(random);
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		LinkedList<Appt> ll = null;

		assertNull(t.deleteAppt(ll,appt));
		ll = new LinkedList<Appt>();
		Appt n = null;
		ll.add(appt);
		assertNull(t.deleteAppt(ll,n));

	}

	
}
