package edu.osu.cs362;


import org.junit.Test;


import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	ValuesGenerator v;
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
	 }


	@Test
	public void setDescriptionTest01() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,1000);

		int startDay=v.getRandomIntBetween(random,1,31);
		int startMonth=v.getRandomIntBetween(random,1,12);
		int startYear=v.getRandomIntBetween(random,0,10000);

		GregorianCalendar g = new GregorianCalendar(startYear,startMonth,startDay);

		CalDay c = new CalDay(g);

		for(int i=0;i<l;i++){
			int startHour=v.getRandomIntBetween(random,0,23);
			int startMinute=v.getRandomIntBetween(random,0,59);
			String title=v.getString(random);
			String description=v.getString(random);
			Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);
			c.addAppt(appt);
		}
		assertEquals(l,c.getAppts().size());
	}

	@Test
	public void setDescriptionTest02() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,1000);

		int startDay=v.getRandomIntBetween(random,1,31);
		int startMonth=v.getRandomIntBetween(random,1,12);
		int startYear=v.getRandomIntBetween(random,0,10000);

		GregorianCalendar g = new GregorianCalendar(startYear,startMonth,startDay);

		CalDay c = new CalDay(g);

		for(int i=0;i<l;i++){
			int startHour=v.getRandomIntBetween(random,-1000,-1);
			int startMinute=v.getRandomIntBetween(random,-1000,-1);
			String title=v.getString(random);
			String description=v.getString(random);
			Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);
			c.addAppt(appt);
		}
		assertEquals(0,c.getAppts().size());
	}
	@Test
	public void setDescriptionTest03() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,1000);

		int startDay=v.getRandomIntBetween(random,1,31);
		int startMonth=v.getRandomIntBetween(random,1,12);
		int startYear=v.getRandomIntBetween(random,0,10000);

		GregorianCalendar g = new GregorianCalendar(startYear,startMonth,startDay);

		CalDay c = new CalDay(g);

		for(int i=0;i<l;i++){
			int startHour=v.getRandomIntBetween(random,24,1000);
			int startMinute=v.getRandomIntBetween(random,60,1000);
			String title=v.getString(random);
			String description=v.getString(random);
			Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);
			c.addAppt(appt);
		}
		assertEquals(0,c.getAppts().size());
	}
}
