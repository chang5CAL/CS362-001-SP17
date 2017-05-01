package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
    //Made these global so I don't have to recall them.
	int startHour=13;
	int startMinute=30;
	int startDay=10;
	int startMonth=4;
	int startYear=2017;
	String title="Birthday Party";
	String description="This is my birthday party.";
	 @Test
	  public void test01()  throws Throwable  {
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 String output = appt.toString();
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 assertEquals(appt.toString(), output);
	 }


	@Test
	public void test02()  throws Throwable  {
	     //Tests a failure on the isValid method
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		//Tests the switch answers and the null results of the string inputs.
		appt.setStartDay(1);
		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartMonth(0);
		appt.setStartYear(1);
		appt.setTitle(null);
		appt.setDescription(null);
		// assertions
		assertTrue(!appt.getValid());
		assertEquals(0, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(0, appt.getStartMonth());
		assertEquals(1, appt.getStartYear());
		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());
		assertEquals(null,appt.toString());
	}

    @Test
    public void test03()  throws Throwable  {
	     //This is the minimum test.
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        //Tests the switch answers and the null results of the string inputs.
        appt.setStartDay(1);
        appt.setStartHour(0);
        appt.setStartMinute(0);
        appt.setStartMonth(1);
        appt.setStartYear(1);
        appt.setTitle(null);
        appt.setDescription(null);
        String output = appt.toString();
        // assertions
        //This should fail on the last if.
        assertTrue(appt.getValid());
        assertEquals(0, appt.getStartHour());
        assertEquals(0, appt.getStartMinute());
        assertEquals(1, appt.getStartDay());
        assertEquals(1, appt.getStartMonth());
        assertEquals(1, appt.getStartYear());
        assertEquals("", appt.getTitle());
        assertEquals("", appt.getDescription());
        assertEquals(appt.toString(),output);
    }

    //04 to 06 are failures at different level of the isValid method.
	@Test
	public void test04()  throws Throwable  {
		//Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        //Tests the switch answers and the null results of the string inputs.
        appt.setStartDay(0);
        appt.setStartHour(23);
        appt.setStartMinute(59);
        appt.setStartMonth(12);
        appt.setStartYear(10000);
        appt.setTitle(null);
        appt.setDescription(null);
        // assertions
        assertTrue(!appt.getValid());
        assertEquals(23, appt.getStartHour());
        assertEquals(59, appt.getStartMinute());
        assertEquals(0, appt.getStartDay());
        assertEquals(12, appt.getStartMonth());
        assertEquals(10000, appt.getStartYear());
        assertEquals("", appt.getTitle());
        assertEquals("", appt.getDescription());
        assertEquals(null,appt.toString());
	}

    @Test
    public void test05()  throws Throwable  {
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        //Tests the switch answers and the null results of the string inputs.
        appt.setStartDay(31);
        appt.setStartHour(23);
        appt.setStartMinute(-1);
        appt.setStartMonth(12);
        appt.setStartYear(10000);
        appt.setTitle(null);
        appt.setDescription(null);
        // assertions
        assertTrue(!appt.getValid());
        assertEquals(23, appt.getStartHour());
        assertEquals(-1, appt.getStartMinute());
        assertEquals(31, appt.getStartDay());
        assertEquals(12, appt.getStartMonth());
        assertEquals(10000, appt.getStartYear());
        assertEquals("", appt.getTitle());
        assertEquals("", appt.getDescription());
        assertEquals(null,appt.toString());
    }
    @Test
    public void test06()  throws Throwable  {
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        //Tests the switch answers and the null results of the string inputs.
        appt.setStartDay(0);
        appt.setStartHour(-23);
        appt.setStartMinute(59);
        appt.setStartMonth(12);
        appt.setStartYear(10000);
        appt.setTitle(null);
        appt.setDescription(null);
        // assertions
        assertTrue(!appt.getValid());
        assertEquals(-23, appt.getStartHour());
        assertEquals(59, appt.getStartMinute());
        assertEquals(0, appt.getStartDay());
        assertEquals(12, appt.getStartMonth());
        assertEquals(10000, appt.getStartYear());
        assertEquals("", appt.getTitle());
        assertEquals("", appt.getDescription());
        assertEquals(null,appt.toString());
    }

    @Test
    public void test07()  throws Throwable  {
	     //This test is the lower than minimum test.
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        //Tests the switch answers and the null results of the string inputs.
        appt.setStartDay(-10);
        appt.setStartHour(-23);
        appt.setStartMinute(-59);
        appt.setStartMonth(-12);
        appt.setStartYear(-10000);
        appt.setTitle(null);
        appt.setDescription(null);
        // assertions
        assertTrue(!appt.getValid());
        assertEquals(-23, appt.getStartHour());
        assertEquals(-59, appt.getStartMinute());
        assertEquals(-10, appt.getStartDay());
        assertEquals(-12, appt.getStartMonth());
        assertEquals(-10000, appt.getStartYear());
        assertEquals("", appt.getTitle());
        assertEquals("", appt.getDescription());
        assertEquals(null,appt.toString());
    }

    @Test
    public void test08()  throws Throwable  {
        //This test is the maximum test.
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        //Tests the switch answers and the null results of the string inputs.
        appt.setStartDay(31);
        appt.setStartHour(23);
        appt.setStartMinute(59);
        appt.setStartMonth(12);
        appt.setStartYear(10000);
        appt.setTitle("Max");
        appt.setDescription("Maximum");
        // assertions
        assertTrue(appt.getValid());
        assertEquals(23, appt.getStartHour());
        assertEquals(59, appt.getStartMinute());
        assertEquals(31, appt.getStartDay());
        assertEquals(12, appt.getStartMonth());
        assertEquals(10000, appt.getStartYear());
        assertEquals("Max", appt.getTitle());
        assertEquals("Maximum", appt.getDescription());
    }
    @Test
    public void test09()  throws Throwable  {
        //This test is the exceeds maximum test.
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        //Tests the switch answers and the null results of the string inputs.
        appt.setStartDay(32);
        appt.setStartHour(24);
        appt.setStartMinute(60);
        appt.setStartMonth(13);
        appt.setStartYear(10000);
        appt.setTitle("Max");
        appt.setDescription("Maximum");
        // assertions
        assertTrue(!appt.getValid());
        assertEquals(24, appt.getStartHour());
        assertEquals(60, appt.getStartMinute());
        assertEquals(32, appt.getStartDay());
        assertEquals(13, appt.getStartMonth());
        assertEquals(10000, appt.getStartYear());
        assertEquals("Max", appt.getTitle());
        assertEquals("Maximum", appt.getDescription());
    }
	
}
