package init;

public class mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhaCungCap ncc=new NhaCungCap(); 
			ncc.nhap_manhacungcap();
			ncc.nhap_ten();
			ncc.nhap_diachi();
			ncc.in_manhacungcap();
			ncc.in_ten();
			ncc.in_diachi();
			
		PhieuNhap pn=new PhieuNhap();
			pn.nhap_maphieu();
			pn.nhap_ngay();
			pn.nhap_ten();
			pn.in_maphieu();
			pn.in_ngay();
			pn.in_ten();
			
		ChiTietPhieuNhap ct=new ChiTietPhieuNhap();
			ct.nhap_tensp();
			ct.nhap_hansd();
			ct.nhap_masp();
			ct.nhap_soluong();
			ct.xuatthongtin();
		
	}

}
