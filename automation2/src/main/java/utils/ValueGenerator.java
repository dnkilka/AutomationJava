package utils;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.text.WordUtils;

public class ValueGenerator {
	
	public static String getRandomString(int stringLength) 
	{
        String allChars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < stringLength) 
        {
            int index = (int) (rnd.nextFloat() * allChars.length()); //0.999*26
            randomString.append(allChars.charAt(index));
        }
        return randomString.toString();
	}
	
    public static String getRandomName(int stringLength)
    {
    	String randomString = getRandomString(stringLength);
    	return WordUtils.capitalize(randomString);
    }
        
	 public static String getRandomEmail(String domain)
	 {
		 return getRandomString(10)+domain;
	 }
     
     public static String getRandomPhoneNumber() 
     {
    	StringBuilder randomString = new StringBuilder(); 
    	Random random = new Random();
    	while (randomString.length()<6) 
    	{
        	int rnd = random.nextInt(10);
        	randomString.append(rnd);
    	}
   		return "7738" + randomString.toString();
     }
     
     public static String getUniquePhoneNumber(String firstFourDigits) 
     {
    	  long date = new Date().getTime();
    	  String dateString = String.valueOf(date);
    	  String phoneNumber = firstFourDigits + dateString.substring(dateString.length() - 6);

    	  return phoneNumber;
     }

 }