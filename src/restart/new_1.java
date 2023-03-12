package restart;
import java.util.*;

public class new_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 1;// n=null
//		while (n > 0) {
//
//			System.out.print("Nhập số nguyên : ");
//			Scanner sc = new Scanner(System.in);
//			n = sc.nextInt();
//			if (n > 0)
//				System.out.println("Dây là số dương");
//			else
//				System.out.println("day là so am");
//		}

//		int n;
//		System.out.print("Nhập vào n: ");
//		n = new Scanner(System.in).nextInt();
//		switch(n) {
//		case 0: 
//		}
//		int n = 100;
//		while (n > 20 || n < 2) {
//			System.out.print("Nhập vào n: ");
//			n = new Scanner(System.in).nextInt();
//		}
//		int temp = 1, tempPrevious = 1, result = 0;
//		for(int i = 2; i<=n; i++) {
//			result = temp+tempPrevious;
//			tempPrevious = temp;
//			temp = result;
//
//		}
//		System.out.println(result);

//		int[] a = new int[10];
//		int n;
//		System.out.println("Nhập vào số phần tử của mảng");
//		n = new Scanner(System.in).nextInt();
//		System.out.println("Nhập mảng");
//		for(int i = 0; i < n; i++) {
//			System.out.println("Nhập phần tử thứ "+ (i+1) + ": ");
//			a[i] = new Scanner(System.in).nextInt();
//		}
//		int min = a[0];
//		for(int i = 1; i < n; i++) {
//			if(min > a[i]) min = a[i];
//		}
//		System.out.println(min);
// }
		
//		
//		 double db = 1.22222222222d; 
//		 DecimalFormat df = new DecimalFormat("#.####");
//		 System.out.println(df.format(db));
//		 
//		
//		while (true) {
//			System.out.println("Nhập chuỗi: ");
//			int n = 0;
//			String s = new Scanner(System.in).next();
//			for (int i = 0; i < s.length(); i++) {
//				if (s.charAt(i) == 'a')
//					n++;
//			}
//			System.out.println();
//		}
//	}
//}

//		// đảo ngược chuỗi 
//		System.out.println("nhap chuoi ho ten");
//
//		String name = new Scanner(System.in).nextLine();
//		
//		String temp[] = name.split(" ");
//		String reverse = "";
//		for (int i = temp.length -1 ; i >= 0; i--) {
//			reverse += temp[i] + " ";
//		}
//		System.out.println(reverse.trim());
//	}
//}

		System.out.println("nhap chuoi : ");
		String name = new Scanner(System.in).nextLine();
		String reverse = "";
		for ( int i = name.length() - 1; i >= 0; i-- ) {
			reverse += name.charAt(i);
		}
		System.out.println("chuoi dao nguoc: " + reverse);
		
	}

}
