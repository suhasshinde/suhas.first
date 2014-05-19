package test;

public class RemoveIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to git");
		String str = "acb(12345)";
		int cnt = str.indexOf("(");
		String str1 = str.substring(cnt+1, (str.length()-1));
		System.out.println("final string"+str1);

	}

}
