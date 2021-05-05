package init;
import java.util.Scanner;
public class NhaCungCap {
	int manhacungcap;
	String ten;
	String diachi;
	public void nhap_manhacungcap(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã nhà cung cấp: ");
    	manhacungcap = scanner.nextInt();
	}
	public void nhap_ten(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("tên nhà cung cấp: ");
    	ten = scanner.nextLine();
	}
	public void nhap_diachi(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập địa chỉ: ");
    	diachi = scanner.nextLine();
}
	public void in_manhacungcap(){
		 System.out.println("mã nhà cung cấp: "+manhacungcap);
	}
	public void in_ten(){
		 System.out.println("Tên nhà cung cấp: "+ten);
	}
	public void in_diachi(){
		 System.out.println("địa chỉ:"+diachi);
}}