package hesap;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		Account k1=new Account("Ahmet", 500);
		Account k2=new Account("Mehmet",1200);
		System.out.println("Kullanıcılar : ");
		System.out.print("1. Kullanıcı : "+k1.getName()+"   ");
		System.out.println("Bakiye : "+ k1.getBakiye());
		System.out.print("2. Kullanıcı : "+k2.getName()+"   ");
		System.out.println("Bakiye : "+ k2.getBakiye());
		System.out.println("Ne kadar para yüklemek istiyorsunuz?");
		int para=i.nextInt();
		k1.depositManey(para);
		System.out.println("Kullanıcılar : ");
		System.out.print("1. Kullanıcı : "+k1.getName()+"   ");
		System.out.println("Bakiye : "+ k1.getBakiye());
		System.out.print("2. Kullanıcı : "+k2.getName()+"   ");
		System.out.println("Bakiye : "+ k2.getBakiye());
	}

}
