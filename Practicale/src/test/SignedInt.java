package test;

public class SignedInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte signedByte = -121;
		int unsignedByte = signedByte & (0xff);

		System.out.println("Signed: " + signedByte + " Unsigned: " + unsignedByte);

	}

}
