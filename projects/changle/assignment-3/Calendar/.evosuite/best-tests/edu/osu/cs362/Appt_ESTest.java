/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 09:15:04 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(1423, 1423, 1423, 11, 11, "yCUnE9;03$", "yCUnE9;03$");
      appt0.setStartDay(11);
      appt0.setStartHour(0);
      appt0.setStartMinute(0);
      appt0.toString();
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(12, 5, 12, 11, 12, "0Z|y9v&2)T68kN", "0Z|y9v&2)T68kN");
      boolean boolean0 = appt0.getValid();
      assertEquals(12, appt0.getStartYear());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(12, appt0.getStartDay());
      assertTrue(boolean0);
      assertEquals(5, appt0.getStartMinute());
      assertEquals("0Z|y9v&2)T68kN", appt0.getTitle());
      assertEquals("0Z|y9v&2)T68kN", appt0.getDescription());
      assertEquals(12, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt((-2223), 186, 186, (-2223), (-2223), "FbP_\"4PM2taj<NA[=", "FbP_\"4PM2taj<NA[=");
      String string0 = appt0.getTitle();
      assertEquals(186, appt0.getStartDay());
      assertEquals(186, appt0.getStartMinute());
      assertEquals(-2223, appt0.getStartYear());
      assertEquals(-2223, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals("FbP_\"4PM2taj<NA[=", string0);
      assertEquals(-2223, appt0.getStartMonth());
      assertEquals("FbP_\"4PM2taj<NA[=", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt((-595), (-595), 210, 210, (-595), "5eFno2v-", ":~6xxBPrBv6g'Mg");
      assertEquals(-595, appt0.getStartYear());
      
      appt0.setStartYear(210);
      int int0 = appt0.getStartYear();
      assertEquals(210, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt((-1229), 0, 0, 11, (-1229), (String) null, "");
      int int0 = appt0.getStartYear();
      assertEquals(-1229, appt0.getStartHour());
      assertEquals((-1229), int0);
      assertEquals(0, appt0.getStartMinute());
      assertEquals(11, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt((-1680), (-1680), 0, 0, 0, "", "");
      int int0 = appt0.getStartMonth();
      assertEquals(0, appt0.getStartDay());
      assertEquals(-1680, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(-1680, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-3556), (-1), 1256, (-1), (-1), "c*YhrYYIOA>Msi", "c*YhrYYIOA>Msi");
      int int0 = appt0.getStartMonth();
      assertEquals(1256, appt0.getStartDay());
      assertEquals("c*YhrYYIOA>Msi", appt0.getDescription());
      assertEquals(-1, appt0.getStartYear());
      assertEquals(-3556, appt0.getStartHour());
      assertEquals(-1, appt0.getStartMinute());
      assertEquals("c*YhrYYIOA>Msi", appt0.getTitle());
      assertEquals((-1), int0);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(953, 953, (-350), 953, (-350), "", "");
      appt0.setStartMinute(0);
      int int0 = appt0.getStartMinute();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(5085, (-3410), 5085, (-3410), 1950, ":", ":");
      int int0 = appt0.getStartMinute();
      assertFalse(appt0.getValid());
      assertEquals(1950, appt0.getStartYear());
      assertEquals(-3410, appt0.getStartMonth());
      assertEquals(":", appt0.getTitle());
      assertEquals((-3410), int0);
      assertEquals(5085, appt0.getStartHour());
      assertEquals(5085, appt0.getStartDay());
      assertEquals(":", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 1700, "", "Minute");
      int int0 = appt0.getStartHour();
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(1700, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals("Minute", appt0.getDescription());
      assertEquals("", appt0.getTitle());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(24, 24, 24, (-2403), 0, "", "");
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartYear());
      assertEquals(-2403, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(24, appt0.getStartDay());
      assertEquals(24, appt0.getStartMinute());
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, (-1118), 31, 59, ")XpMySyf9D,*~J5h", ")XpMySyf9D,*~J5h");
      int int0 = appt0.getStartDay();
      assertEquals((-1118), int0);
      assertEquals(59, appt0.getStartYear());
      assertEquals(12, appt0.getStartHour());
      assertEquals(")XpMySyf9D,*~J5h", appt0.getTitle());
      assertEquals(12, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(31, appt0.getStartMonth());
      assertEquals(")XpMySyf9D,*~J5h", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(14, 14, 14, 14, 14, "", "");
      appt0.getDescription();
      assertEquals(14, appt0.getStartHour());
      assertEquals(14, appt0.getStartYear());
      assertEquals(14, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(14, appt0.getStartDay());
      assertEquals(14, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt((-1680), (-1680), 0, 0, 0, "", "");
      appt0.setDescription("");
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-1680, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(-1680, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt((-1229), 0, 0, 11, (-1229), (String) null, "");
      appt0.setDescription((String) null);
      assertEquals(-1229, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-1229, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-1007), (-1007), (-1007), 0, 0, "#B)Q\"fpH\f", "");
      appt0.setTitle(", ");
      assertEquals(", ", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 4386, 0, 23, "", "");
      appt0.setTitle((String) null);
      assertEquals(23, appt0.getStartMinute());
      assertEquals(4386, appt0.getStartDay());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(23, appt0.getStartHour());
      assertEquals(23, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-1229), 0, 0, 11, (-1229), (String) null, "");
      String string0 = appt0.getTitle();
      assertEquals(11, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-1229, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertNotNull(string0);
      assertEquals(-1229, appt0.getStartHour());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, (-99), 0, ":|yoAh^spP:!c4u", ":|yoAh^spP:!c4u");
      int int0 = appt0.getStartDay();
      assertEquals(":|yoAh^spP:!c4u", appt0.getTitle());
      assertEquals(-99, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(":|yoAh^spP:!c4u", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-1680), (-1680), 0, 0, 0, "", "");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-1680, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(-1680, appt0.getStartHour());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-595), (-595), 210, 210, (-595), "5eFno2v-", ":~6xxBPrBv6g'Mg");
      int int0 = appt0.getStartHour();
      assertEquals((-595), int0);
      assertEquals(-595, appt0.getStartYear());
      assertEquals(":~6xxBPrBv6g'Mg", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(210, appt0.getStartDay());
      assertEquals("5eFno2v-", appt0.getTitle());
      assertEquals(210, appt0.getStartMonth());
      assertEquals(-595, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-1007), (-1007), (-1007), 0, 0, "#B)Q\"fpH\f", "");
      int int0 = appt0.getStartYear();
      assertEquals(-1007, appt0.getStartHour());
      assertEquals("", appt0.getDescription());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-1007, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals("#B)Q\"fpH\f", appt0.getTitle());
      assertEquals(-1007, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(953, 953, (-350), 953, (-350), "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(953, appt0.getStartHour());
      assertEquals(-350, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(953, int0);
      assertEquals(-350, appt0.getStartDay());
      assertEquals(953, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(12, 1056, 0, 1056, 12, "", "");
      String string0 = appt0.getDescription();
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(1056, appt0.getStartMinute());
      assertEquals(12, appt0.getStartHour());
      assertEquals(12, appt0.getStartYear());
      assertEquals("", appt0.getTitle());
      assertEquals("", string0);
      assertEquals(1056, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(953, 953, (-350), 953, (-350), "", "");
      int int0 = appt0.getStartMonth();
      assertEquals(-350, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(953, int0);
      assertEquals(-350, appt0.getStartDay());
      assertEquals(953, appt0.getStartHour());
      assertEquals(953, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(12, 5, 12, 11, 12, "0Z|y9v&2)T68kN", "0Z|y9v&2)T68kN");
      String string0 = appt0.toString();
      assertEquals("\t11/12/12 at 12:5pm ,0Z|y9v&2)T68kN, 0Z|y9v&2)T68kN\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, (-1118), 31, 59, ")XpMySyf9D,*~J5h", ")XpMySyf9D,*~J5h");
      String string0 = appt0.toString();
      assertEquals(")XpMySyf9D,*~J5h", appt0.getTitle());
      assertEquals(59, appt0.getStartYear());
      assertEquals(12, appt0.getStartHour());
      assertEquals(12, appt0.getStartMinute());
      assertEquals(31, appt0.getStartMonth());
      assertEquals(")XpMySyf9D,*~J5h", appt0.getDescription());
      assertEquals(-1118, appt0.getStartDay());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, (-1118), 31, 59, ")XpMySyf9D,*~J5h", ")XpMySyf9D,*~J5h");
      appt0.setStartDay(31);
      appt0.setStartMonth(12);
      assertTrue(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(0, 59, 11, (-2514), 0, "yNW~", "");
      int int0 = appt0.getStartDay();
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(11, int0);
      assertEquals("yNW~", appt0.getTitle());
      assertEquals("", appt0.getDescription());
      assertEquals(59, appt0.getStartMinute());
      assertEquals(-2514, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt((-1007), (-1007), (-1007), 0, 0, "#B)Q\"fpH\f", "");
      assertEquals(-1007, appt0.getStartHour());
      
      appt0.setStartHour(0);
      assertEquals(-1007, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, " at ", " at ");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t11/11/11 at 11:11am , at ,  at \n", string0);
  }
}
