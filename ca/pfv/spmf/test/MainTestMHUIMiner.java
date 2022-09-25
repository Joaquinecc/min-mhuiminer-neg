package ca.pfv.spmf.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import ca.pfv.spmf.algorithms.frequentpatterns.minmhuiminerNeg.MinmHUIMinerNeg;


/**
 * Example of how to use the mHUIMiner algorithm 
 * from the source code.
 * @author Philippe Fournier-Viger, 2017
 */
public class MainTestMHUIMiner {

	public static void main(String [] arg) throws IOException{
		
		String input = fileToPath("DB_Utility.txt");
		String output = ".//output.txt";

		int min_utility = 30;  // 
		
		// Applying the HUIMiner algorithm
		MinmHUIMinerNeg algo = new MinmHUIMinerNeg();
		algo.runAlgorithm(input,min_utility,output);
		algo.printStats();

	}

	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestMHUIMiner.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
