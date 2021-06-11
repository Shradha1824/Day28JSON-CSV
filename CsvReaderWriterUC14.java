package Csvproject.ReadWrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CsvReaderWriterUC14 {
	
  public static void main(String[] args) {
	  
	  String path = "C:\\Users\\SHRADHA\\Desktop\\input.csv";
	  String line = " ";
	  
	  try 
	  {
		BufferedReader bReader = new BufferedReader(new FileReader(path));
		
		while((line = bReader.readLine()) != null) {
			System.out.println(line);
		//	String[] value = line.split(", ");
		//	System.out.println("FirstName: " + value[0]);
			}
		
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	  
	 try 
	  {
		CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\SHRADHA\\Desktop\\output.csv"));
		List<String[]> list = new ArrayList<String[]>();
	      	String line1[] = {"FirstName", "LastName", "City", "State"};
	      	String line2[] = {"Kriti", "Joshi", "Banglore", "Karnatak"};
	      	list.add(line1);
	      	list.add(line2);
	      
	      	writer.writeAll(list);
	      	writer.close();
	      		System.out.println("Details Enter In AddressBook");
	      
	  } catch (IOException e) {
		// TODO Auto-generated catch block
		  	e.printStackTrace();
	  }
  	}
}
