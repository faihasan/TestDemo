package TestClass;

import TestDemo1.*;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ValidationTest {
	  String sentence;
	  String[] word;
	  biggestWord bigWord;

  @Test (priority = 0, enabled = true)   //Test 1 with manual input
  public void biggestWord(){
	  
	  bigWord = new biggestWord();
	  sentence = "The cow jumped over the moon";
	  
	  word = bigWord.bWord(sentence);
	  
	  System.out.println("The Biggest Word is: "+word[0]);
	  System.out.println("Word length is: "+word[1]);
	  	  
  }
  
 @Test (priority = 1, enabled = true) //Test 2 with Dynamic input from Excel file
	 public void unitTesting1(){
	 try {
	 File src = new File("./TestCase.xlsx");
		FileInputStream fis;
		
			fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		String testSentence = sh1.getRow(1).getCell(0).getStringCellValue();
		
		bigWord = new biggestWord();
		word = bigWord.bWord(testSentence);
		
		String expectedResult01 = sh1.getRow(1).getCell(1).getStringCellValue();
		String actualResult01 = word[0];
		

		
		if(actualResult01.equals(expectedResult01)){

			System.out.println(actualResult01+ "\n"+ "Test Passed");
			
		}
		else{

			System.out.println(actualResult01+ "\n"+ "Test Failed");
		}
		
		wb.close();

	
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }
 
 @Test (priority = 2, enabled = true) //Test 3 Dynamic input from excel file
 public void unitTesting2(){
	 try {
	 File src = new File("./TestCase.xlsx");
		FileInputStream fis;
		
			fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		String testSentence = sh1.getRow(2).getCell(0).getStringCellValue();
		
		bigWord = new biggestWord();
		word = bigWord.bWord(testSentence);
		
		String expectedResult01 = sh1.getRow(2).getCell(1).getStringCellValue();
		String actualResult01 = word[0];
		

		
		if(actualResult01.equals(expectedResult01)){

			System.out.println(actualResult01+ "\n"+ "Test Passed");
			
		}
		else{

			System.out.println(actualResult01+ "\n"+ "Test Failed");
		}
		
		wb.close();

	
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }
 }
  
  

  