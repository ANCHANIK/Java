package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		byte bNum = 125;
		int iNum = bNum;
		
		int iNum2 = 255;
		byte bNum2 = (byte)iNum2;
		
		System.out.println(iNum);
		System.out.println(bNum2);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		System.out.println(inum);
		
		
		
		
		double dNum2 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum2 + (int)fNum;
		int iNum0 = (int)(dNum2 + fNum);
		System.out.println(iNum1);
		System.out.println(iNum0);
		
		
		
	}

}
