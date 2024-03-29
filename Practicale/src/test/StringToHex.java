package test;

import java.nio.charset.Charset;

public class StringToHex{
	 
	  public String convertStringToHex(String str){
	 
		  char[] chars = str.toCharArray();
	 
		  StringBuffer hex = new StringBuffer();
		  for(int i = 0; i < chars.length; i++){
		    hex.append(Integer.toHexString((int)chars[i]));
		  }
	 
		  return hex.toString();
	  }
	 
	  public String convertHexToString(String hex){
	 
		  StringBuilder sb = new StringBuilder();
		  StringBuilder temp = new StringBuilder();
	 
		  //49204c6f7665204a617661 split into two characters 49, 20, 4c...
		  for( int i=0; i<hex.length()-1; i+=2 ){
	 
		      //grab the hex in pairs
		      String output = hex.substring(i, (i + 2));
		      //convert hex to decimal
		      int decimal = Integer.parseInt(output, 16);
		      //convert the decimal to character
		      sb.append((char)decimal);
	 
		      temp.append(decimal);
		  }
		//  System.out.println("Decimal : " + temp.toString());
	 
		  return sb.toString();
	  }
	 
	  public static void main(String[] args) {
	 
		 //System.setProperty("file.encoding", "ISO 8859-1");
		 // Charset.forName("ISO-8859-1");
		  StringToHex strToHex = new StringToHex();
		  System.out.println("\n***** Convert ASCII to Hex *****");
		  String str = "F0D654E1B6C3D84F24324CC7FBC4F687";  
		  System.out.println("Original input : " + str);
	 
		  String hex = strToHex.convertStringToHex(str);
	 
		  System.out.println("Hex : " + hex);
	 
		  System.out.println("\n***** Convert Hex to ASCII *****");
		  System.out.println("Hex : " + "\u2021");
		  System.out.println("ASCII : " + strToHex.convertHexToString(hex));
		  System.out.println("Default Charset=" + Charset.defaultCharset());
		 String prop =  System.getProperty("file.encoding");
		 System.out.println(prop);
	  }
	}
