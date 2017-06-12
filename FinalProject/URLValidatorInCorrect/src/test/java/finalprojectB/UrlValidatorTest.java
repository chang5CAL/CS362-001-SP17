/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }


    public void testManualTest()
    {
        UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
        System.out.println(urlVal.isValid("http://www.amazon.com"));

        //simple URLs
        assertTrue(urlVal.isValid("http://www.google.com"));
        assertTrue(urlVal.isValid("http://www.google.com/test/web.pfd"));
        assertTrue(urlVal.isValid("https://www.yahoo.com"));

        //URL ports
        // assertTrue(urlVal.isValid("http://www.google.com:00000" )); //Fails
        //assertTrue(urlVal.isValid("http://www.google.com:12345" )); //Fails
        assertTrue(urlVal.isValid("http://www.google.com:1" ));

        //URL queries
        //assertTrue(urlVal.isValid("http://www.google.com/path123?action=view")); //Fails
        //assertTrue(urlVal.isValid("http://www.google.com/path123#search=stuff")); //Fails

        //intentionally bad URLS
        //assertFalse(urlVal.isValid("http://www.google.com/path.path/")); //Fails
        assertFalse(urlVal.isValid("hptts:/www.google.com"));
        assertFalse(urlVal.isValid("localHost:C:Myfolders/AS5.docx"));
        assertFalse(urlVal.isValid(null));

    }


    public void testYourFirstPartition()
    {
        UrlValidator urlVal = new UrlValidator(); //default constructor

        //Test Schemes
        assertTrue(urlVal.isValid("http://google.com")); // runs and produces the correct result

        //Test Authority
        assertTrue(urlVal.isValid("http://google.com")); // runs and produces the correct result

        //Test Port
        // assertTrue(urlVal.isValid("https://google.com:11111")); // test fails, bug in port check found

        //Test Path
        assertTrue(urlVal.isValid("https://google.com/path")); // runs and produces the correct result

        //Test query
        // assertTrue(urlVal.isValid("https://google.com/path?action=view")); // test fails, bug in query check found
    }

    public void testYourSecondPartition(){
        UrlValidator urlVal = new UrlValidator(); //default constructor

        //Test Schemes
        assertFalse(urlVal.isValid("flip://google.com")); // runs and produces the correct result

        //Test Authority
        assertFalse(urlVal.isValid("http://google.aaa")); // runs and produces the correct result

        //Test Port
        assertFalse(urlVal.isValid("https://google.com:9990A")); // runs and produces the correct result

        //Test path
        assertFalse(urlVal.isValid("https://google.com/../")); // runs and produces the correct result

        //test query
        assertFalse(urlVal.isValid("https://google.com/path?../")); // runs and produces the correct result


    }
   
   
   public void testIsValid()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   for(int i = 0;i<validURL.length;i++)
	   {
		   assertTrue(urlVal.isValid(validURL[i]));
	   }
       for(int i = 0;i<invalidURL.length;i++)
       {
           assertFalse(urlVal.isValid(invalidURL[i]));
       }
   }

   String[] validURL = {/*"google.com/",/*"google.com",*/"https://www.google.com/#q=testsonetwothree",
           "https://google.com/:11111",/*"https://www.google.com/?test=test&hi=test2",*/
           "https://www.obviousfakeurlthatisdefinitelywrongfignaodfgnjrfgnsofdnbdougfbndogfhbiundrgdskgfsp0iodkfp240182jinsdf.com/",
           "https://123.com"/*,"0.0.0.0"*/};
   //Things to note: "google.com" SHOULD be fine, but it's not. www.google.com is also broken, and also should be fine.
   //Also does not like queries, as previously discovered.
   //It does not like numbers as URLs. Nor does it like direct IPs.
   String[] invalidURL = {"","erogkr://gmdfkgmspo.doiklgmwre0pghr","C:\\",/*"ftp://google.com",*/
           "localhost"/*,"http://google.com/#/realfile"*/,"www.google.com:5a","www.google.com:-5","http://www.google.com/....",
            "https://.abc","https://.abc.com"};

   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
