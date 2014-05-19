package test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

public class testhex {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		/*byte[] bytes = hexStringToByteArray("F6");
		System.out.println(Arrays.toString(bytes));*/
		
		byte[] bytes = {(byte) '\u2021'};
		String  []charset = {"US-ASCII","ISO-8859-1","UTF-8","UTF-16BE","UTF-16LE","UTF-16"};
		
		for (int i=0;i<charset.length;i++)
		{
		String res = new String (bytes,charset[i]);
		System.out.println("charsetname: "+charset[i]+"\t"+res);
		}
	}
	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}

}
