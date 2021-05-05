package init;

import java.util.Scanner;

public class PhieuNhap {
	public int maphieu;
	public String ngay;
	public String ten;
	void nhap_maphieu(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã phiếu nhập: ");
    	maphieu= scanner.nextInt();
	}
	void nhap_ngay(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ngày nhập: ");
		ngay= scanner.nextLine();
    	}
	
	void nhap_ten(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên nhân viên: ");
    	ten = scanner.nextLine();
}
	void in_maphieu(){
		 System.out.println("mã phiếu nhập: "+maphieu);
	}
	void in_ten(){
		 System.out.println("Tên nhân viên: "+ten);
	}
	void in_ngay(){
		 System.out.println("địa chỉ:"+ngay);
}}


