package chapter03;

public class StringEqualsEx {

	public static void main(String[] args) {
		String str1 = "�ڹ�";
		String str2 = "�ڹ�";
		String str3 = new String("�ڹ�");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));

	}

}
