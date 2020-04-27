package core;

import java.io.*;
import java.util.*;
import org.testng.annotations.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeNumberCheckerTest {
	
	 String csvFile = "./primes_10.csv";        
	 // mvn site -Dtestcases="./primes_10.csv"
//	 	String csvFile = System.getProperty("testcases");
	
	@DataProvider(name = "Prime Numbers")
	public Iterator<String[]> data() throws IOException {
		String cvsLine = "";
		String[] a = null;
		ArrayList<String[]> al = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
	
		while ((cvsLine = br.readLine()) != null) {
			a = cvsLine.split(",");
			al.add(a);
		}
		
		br.close();
		return al.iterator();
	}

	@Test(timeOut = 1000, dataProvider = "Prime Numbers")
	public void test(String a, String b, String c) {
	assertThat(PrimeNumberChecker.validate(Integer.parseInt(b)), equalTo(Boolean.parseBoolean(c)));
	}
	
	@Test
	public void test2() {
	assertThat("abcd", equalTo("abce"));
	}
}