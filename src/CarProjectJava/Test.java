package CarProjectJava;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.user.CarObject;

public class Test {

	public static void main(String[] args) {
		final String path = "C:\\Software\\ServletProject\\carFolder\\";
		//create car object to reference in the carArray
		CarObject car = new CarObject();
		
		File dir = new File(path);
		// Create an array to load each file we find on to
		File[] carArray = dir.listFiles();
		int i=0;
		// test to see if it's pulling
		for (i=0; i<carArray.length; i++)
		{
		car = new CarObject();
		//w00t it's pulling the files
		//parse the array
		try {	
		//reading the 'path' folder, getting the array
		Scanner scanner = new Scanner(new File(path+carArray[i].getName()));
		//go line by line while there is any left
		while(scanner.hasNextLine()) {
		String line = scanner.nextLine();
		//time to parse the lines
		//parse line by line
		String[] parsedLine = line.split(",");
		String name = parsedLine[0];
		car.setName(name);
		car.setModel(parsedLine[1]);
		car.setYear(parsedLine[2]);
		car.setPrice(parsedLine[3]);
		car.setDescription(parsedLine[4]);
		car.setVin(parsedLine[5]);
		System.out.println(car);
		
		}
		}catch(FileNotFoundException e) {
			System.out.println("Invalid file name"+e.getMessage());
			
		
		}
		}
		//System.out.println(car);
}
//main method's
}
