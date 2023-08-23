package kiemtrathucpham;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
public class ThucPham {
	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nSX, hSX;
	
	public ThucPham() {
		
	}
	
	public ThucPham(int maHang, String tenHang, double donGia, Date nSX, Date hSX) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.nSX = nSX;
		this.hSX = hSX;
	}

	//--------------Begin getter and setter---------------
	
	public int getMaHang() {
		return maHang;
	}

	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public Date getnSX() {
		return nSX;
	}

	public void setnSX(Date nSX) {
		this.nSX = nSX;
	}

	public Date gethSX() {
		return hSX;
	}

	public void sethSX(Date hSX) {
		this.hSX = hSX;
	}
	//--------------Begin getter and setter---------------
	
	@Override
	public String toString() {
		//Su dung phương thức Locale để biến đổi theo tiền tệ việt nam
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String str = numberFormat.format(donGia);
		// sử dụng phương thức SimpleDateFormat để biến đổi ngày tháng năm theo dạng "dd/MM/yyyy"
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String str1 = simpleDateFormat.format(nSX);
		String str2 = simpleDateFormat.format(hSX);
		return "Thong tin ve thuc pham \n"
				+ "Ma hang: " + maHang
				+ "\nTen Hang: " + tenHang
				+"\n Don gia: " + str
				+ "\n Ngay san xuat: " + str1
				+ "\n Han su dung: " + str2;
	}
	
	//Khởi tạo phương thức để nhập năm tháng ngày sản xuất
	public void setNSX(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		this.nSX = calendar.getTime();
	}
	
	// khoi tao phuong thuc de nhap han su dung
	public void setHSD(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		this.hSX = calendar.getTime();
	}
	
	// khoi tao phuong thuc kiem tra ten hang
	public boolean kiemTraTenHang() {
		if (this.tenHang == "" || this.tenHang.isEmpty()) {
			System.out.println("Ten hang khong duoc de trong: ");
			return false;
		}else {
			return true;
		}
	}
	
	//Ham kiem tra ngay het han khong duoc nho hon ngay san xuat
	public boolean kiemTraNgay() {
		if (this.getnSX().compareTo(this.gethSX()) < 0) {
			return true;
		}else {
			System.out.println("Ngay het han khong duoc nho hon ngay san xuat: ");
			return false;
		}
	}
	
	//Ham kiem tra han su dung
	public void kiemTraHanSuDung() {
		Date toDay = new Date();
		toDay.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String str = simpleDateFormat.format(toDay);
		if (this.gethSX().compareTo(toDay) < 0) {
			System.out.println("Hom nay la ngay: " + str + "Hang hoa het han: ");
		}else {
			System.out.println("Hom nay la ngay: " + str + "Hang hoa con han: ");
		}
	}
	
	
}
