package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {
	TimeTable t = new TimeTable();
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
	Appt appt2 = new Appt(startHour+1,
			startMinute+1,
			startDay+1,
			startMonth+1,
			startYear+1,
			description,
			title);
	Appt appt3 = new Appt(startHour-1,
			startMinute-1,
			startDay-1,
			startMonth-1,
			startYear-1,
			description,
			title);
	Appt invalidAppt = new Appt(startHour+50,
			startMinute,
			startDay,
			startMonth,
			startYear,
			description,
			title);
	LinkedList<Appt> lla = new LinkedList<Appt>();

	 @Test(expected = IllegalArgumentException.class)
	  public void test01()  throws Throwable  {
		 GregorianCalendar gregCal = new GregorianCalendar();
	 	lla.add(appt);
	 	lla.add(appt2);
	 	LinkedList<CalDay> l = t.getApptRange(lla,gregCal,gregCal);
	 	//No asserts here. It should throw an error, though.

	 	//Line 99 is impossible to access in the current code. It's also redundant.

	 }

	@Test
	public void test02()  throws Throwable  {
		GregorianCalendar gregCal = new GregorianCalendar();
		GregorianCalendar gregCal2 = new GregorianCalendar(2018, 1, 1, 5, 10);
		gregCal2.getTime();
		lla.add(appt);
		lla.add(appt2);

		LinkedList<CalDay> l = t.getApptRange(lla,gregCal,gregCal2);

		assertNotNull(l);

	}

	@Test
	public void test03()  throws Throwable  {
		lla.add(appt);
		lla.add(appt2);

		lla = t.deleteAppt(lla,appt);

		assertNotNull(lla);

	}
	@Test
	public void test04()  throws Throwable  {
		lla.add(appt);
		lla.add(appt2);

		lla = t.deleteAppt(lla,invalidAppt);

		assertNull(lla);

	}

	@Test
	public void test05()  throws Throwable  {
	 	LinkedList<Appt> n = null;

		n = t.deleteAppt(n,appt);

		assertNull(n);

	}
	@Test
	public void test06()  throws Throwable  {
		lla.add(appt);
		lla.add(appt2);

		lla = t.deleteAppt(lla,appt3);

		assertNull(lla);

	}

}
