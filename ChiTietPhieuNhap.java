package init;
import java.util.Scanner;
public class ChiTietPhieuNhap extends PhieuNhap {
	public int masp;
	public String tensp;
	public int soluong;
	public String hansd;
	
	public void nhap_masp() {
		System.out.println("mã sản phẩm: ");			
		Scanner scanner=new Scanner(System.in);
		masp=scanner.nextInt();
		
	}
	public void nhap_tensp() {
		System.out.println("tên sản phẩm: ");			
		Scanner scanner=new Scanner(System.in);
		tensp=scanner.nextLine();
	}
	public void nhap_soluong() {
		System.out.println("số lượng: ");			
		Scanner scanner=new Scanner(System.in);
		soluong=scanner.nextInt();
	}
	public void nhap_hansd() {
		System.out.println("hạn sử dụng: ");			
		Scanner scanner=new Scanner(System.in);
		hansd=scanner.nextLine();
	}
	public void xuatthongtin() {
		System.out.println(" mã sản phẩm: "+ masp );
		System.out.println("ten sản phẩm: "+ tensp);
		System.out.println("số lượng:  "+ soluong);
		System.out.println("hạn sử dụng : "+ hansd);
}
}
