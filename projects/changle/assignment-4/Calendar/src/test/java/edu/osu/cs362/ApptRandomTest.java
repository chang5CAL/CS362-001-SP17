package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	ValuesGenerator v;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests Appt Class.
     *//* Temporarily disabled for time
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=13;
				 int startMinute=30;
				 int startDay=10;
				 int startMonth=4;
				 int startYear=2017;
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
	 
	 
		 System.out.println("Done testing...");
	 }*/

	 @Test
	public void setDescriptionTest01() throws Throwable{
		 long randomSeed = System.currentTimeMillis();
		 Random random = new Random(randomSeed);
		 int l = v.getRandomIntBetween(random,0,1000);
		 String s = new String();
		 for(int i=0;i<l;i++){
		 	s += v.getCharacter(random);
		 }
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 appt.setDescription(s);
		 assertEquals(s,appt.getDescription());

	 }

	@Test
	//This one isn't random because "null" is an edge case that the random generator would never hit.
	public void setDescriptionTest02() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,0);
		String s = null;
		for(int i=0;i<l;i++){
			s += v.getCharacter(random);
		}
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		appt.setDescription(s);
		assertEquals("",appt.getDescription());

	}

	@Test
	public void isValidTest01() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,23);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartHour(l);

		assertTrue(appt.getValid());

	}
	@Test
	public void isValidTest02() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,24,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartHour(l);

		assertTrue(!appt.getValid());

	}

	@Test
	public void isValidTest03() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,-1);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartHour(l);

		assertTrue(!appt.getValid());

	}
	@Test
	public void isValidTest04() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartHour(l);

		if (l<0 || l>23) { assertTrue(!appt.getValid()); }
		else { assertTrue(appt.getValid()); }

	}

	@Test
	public void isValidTest05() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,0,59);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMinute(l);

		assertTrue(appt.getValid());

	}
	@Test
	public void isValidTest06() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,60,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMinute(l);

		assertTrue(!appt.getValid());

	}

	@Test
	public void isValidTest07() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,-1);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMinute(l);

		assertTrue(!appt.getValid());

	}
	@Test
	public void isValidTest08() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMinute(l);

		if (l<0 || l>59) { assertTrue(!appt.getValid()); }
		else { assertTrue(appt.getValid()); }

	}


	@Test
	public void isValidTest09() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,1,31);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartDay(l);

		assertTrue(appt.getValid());

	}
	@Test
	public void isValidTest10() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,32,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartDay(l);

		assertTrue(!appt.getValid());

	}
	@Test
	public void isValidTest17() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,0);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartDay(l);

		assertTrue(!appt.getValid());

	}

	@Test
	public void isValidTest11() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,-1);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMinute(l);

		assertTrue(!appt.getValid());

	}
	@Test
	public void isValidTest12() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMinute(l);

		if (l<0 || l>59) { assertTrue(!appt.getValid()); }
		else { assertTrue(appt.getValid()); }

	}
	@Test
	public void isValidTest13() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,1,12);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMonth(l);

		assertTrue(appt.getValid());

	}
	@Test
	public void isValidTest14() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,13,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMonth(l);

		assertTrue(!appt.getValid());

	}

	@Test
	public void isValidTest15() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,0);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMonth(l);

		assertTrue(!appt.getValid());

	}
	@Test
	public void isValidTest16() throws Throwable{
		long randomSeed = System.currentTimeMillis();
		Random random = new Random(randomSeed);
		int l = v.getRandomIntBetween(random,-100,100);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartMonth(l);

		if (l<1 || l>12) { assertTrue(!appt.getValid()); }
		else { assertTrue(appt.getValid()); }

	}
}
