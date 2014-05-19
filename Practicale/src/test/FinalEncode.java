package test;

public class FinalEncode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "F0D654E1B6C3D84F24324CC7FBC4F687";
		//String input =  "87";
		String result = unhexlify(input);
		
		System.out.println("expected o/p : ðÖTá¶ÃØO$2LÇûÄö‡");
		System.out.println("resulted o/p : "+result);
//System.out.println("=>"+"\u20AC");
	}
	public static String unhexlify(String txtInHex) {
	
		//As we are getting issue to display Ascii characters from the range 128 to 255 with UTF-8 character set so we used custmized array of the this extended ascii character.
		String [] extendedASCIICodes  = {"\u20AC","\u0081","\u201A","\u0192","\u201E","\u2026","\u2020","\u2021","\u02C6","\u2030","\u0160","\u2039","\u0152","\u008D","\u017D","\u008F","\u0090","\u2018","\u2019","\u201C","\u201D","\u2022","\u2013","\u2014","\u02DC","\u2122","\u0161","\u203A","\u0153","\u009D","\u017E","\u0178","\u00A0","\u00A1","\u00A2","\u00A3","\u00A4","\u00A5","\u00A6","\u00A7","\u00A8","\u00A9","\u00AA","\u00AB","\u00AC","\u00AD","\u00AE","\u00AF","\u00B0","\u00B1","\u00B2","\u00B3","\u00B4","\u00B5","\u00B6","\u00B7","\u00B8","\u00B9","\u00BA","\u00BB","\u00BC","\u00BD","\u00BE","\u00BF","\u00C0","\u00C1","\u00C2","\u00C3","\u00C4","\u00C5","\u00C6","\u00C7","\u00C8","\u00C9","\u00CA","\u00CB","\u00CC","\u00CD","\u00CE","\u00CF","\u00D0","\u00D1","\u00D2","\u00D3","\u00D4","\u00D5","\u00D6","\u00D7","\u00D8","\u00D9","\u00DA","\u00DB","\u00DC","\u00DD","\u00DE","\u00DF","\u00E0","\u00E1","\u00E2","\u00E3","\u00E4","\u00E5","\u00E6","\u00E7","\u00E8","\u00E9","\u00EA","\u00EB","\u00EC","\u00ED","\u00EE","\u00EF","\u00F0","\u00F1","\u00F2","\u00F3","\u00F4","\u00F5","\u00F6","\u00F7","\u00F8","\u00F9","\u00FA","\u00FB","\u00FC","\u00FD","\u00FE","\u00FF"};
		System.out.println("Welcome to git");
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
		    if(intValue > 127)
		    {
		    	output += extendedASCIICodes[intValue - 128];
		    	continue;
		    }
		    output += (char) intValue;
		   }
	}
		  return output;
}
}
