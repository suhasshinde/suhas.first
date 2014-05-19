package test;

import java.io.UnsupportedEncodingException;

public class Hexify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hexify hex = new Hexify();
			//String input = "F0D654E1B6C3D84F24324CC7FBC4F687";
			String input =  "87";
			String result = unhexlify(input);
			
			//System.out.println("expected o/p : ðÖTá¶ÃØO$2LÇûÄö");
			System.out.println("resulted o/p : "+result);
			//System.out.println("\u2021");
		
	}
	
	 public static String unhexlify(String txtInHex) {

		  char[] charArr = txtInHex.toCharArray();
		  String output = "";

		  String hexValueAsString = "";
		  for (int i = 0; i < charArr.length; i++) {
		   char ch = charArr[i];

		   if (i % 2 == 0) {
		    // These are odd items considering item index starting from 0
		    hexValueAsString = "";
		    hexValueAsString += ch;
		   }
		   else {
		    // These are even items considering item index starting from 0
		    hexValueAsString += ch;
		    int intValue = Integer.parseInt(hexValueAsString, 16);
		    //long longvalue = Long.parseLong(hexValueAsString, 16);
		    
		     
		     byte [] b = intToByteArray(intValue);
		   
		     String  []charset = {"US-ASCII","ISO-8859-1","UTF-8","UTF-16BE","UTF-16LE","UTF-16"};
				
				for (int j=0;j<charset.length;j++)
				{
				String res;
				try {
					res = new String (b,charset[j]);
					System.out.println("charsetname: "+charset[j]+"\t"+res);
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
		     
		     for(byte bn:b)
		     { 
		     System.out.print(bn);
		     }
		     System.out.println("   int value:"+intValue);
		     
		    output += (char) intValue;
		   }
		  } // End For

		  return output;

		 }
		 
	 
	 public static byte[] intToByteArray(int value) {
		 byte[] b = new byte[4];
		 for (int i = 0; i < 4; i++) {
		 int offset = (b.length - 1 - i) * 8;
		 b[i] = (byte) ((value >>> offset) & 0xFF);
		 }
		 return b;
		 }
	 
	 // String encoded_key = AkamaiToken.unhexlify(token_config.getKey());
		//	 key=F0D654E1B6C3D84F24324CC7FBC4F687(input)
	 	//	 encoded_key=ðÖTá¶ÃØO$2LÇûÄö (Expected output as we get in ruby)
		// encoded_key=ðÖTá¶ÃØO$2LÇûÄö? (Output we are getiing from java impl)

}
