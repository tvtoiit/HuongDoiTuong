package TaiKhoanNganHang;
import java.util.Scanner;
import java.text.NumberFormat;

public class Account {
	//Khai bao thuoc tinh
	private long soTK;
	private String tenTK;
	private double soTienTrongTK;
	
	public Account() {
		
	}
	
	public Account(long soTK, String tenTK, double soTienTrongTK) {
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienTrongTK = soTienTrongTK;
	}
	// -----------Begin getter and setter --------------
	public long getSoTK() {
		return soTK;
	}

	public void setSoTK(long soTK) {
		this.soTK = soTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public double getSoTienTrongTK() {
		return soTienTrongTK;
	}

	public void setSoTienTrongTK(double soTienTrongTK) {
		this.soTienTrongTK = soTienTrongTK;
	}
	// -----------End getter and setter --------------
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
		//Định dạng tiền tệ
		String str1 = currencyEN.format(soTK);
		return soTK + "-" + tenTK + "-" + str1;
	}
	Scanner scanner = new Scanner(System.in);
	//Khoi tao phương thuc nap tien
	public double napTien() {
		double nap;
		System.out.println("Nhap so tien ban can nap: ");
		nap = scanner.nextDouble();
		//So tien nap vao lon hon 0 thi hop le
		if (nap >= 0) {
			soTienTrongTK = nap + soTienTrongTK;
			NumberFormat currentcyEN = NumberFormat.getCurrencyInstance();
			String str1 = currentcyEN.format(nap);
			System.out.println("Ban vua nap" + str1 + "Vao tai khoan");
		}else {// So tien nop vao be hon 0 thi khong hop le
			System.out.println("So tien nap vao khong hop le: ");
		}
		return nap;
	}
	//Khoi tao phuong thuc rut tien
	public double rutTien() {
		double phi = 5;
		double rut;
		System.out.println("Nhap so tien ban can rut: ");
		rut = scanner.nextDouble();
		//Neu so tien rut be hon hoac bang so tien trong tai khoan + phi
		if (rut <= (soTienTrongTK - phi)) {
			soTienTrongTK = soTienTrongTK - (rut + phi);
			NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
			String str1 = currencyEN.format(rut);
			System.out.println("ban vua rut" + str1 + "Được trừ vào trong tài khoản. Phi la $5");
		}else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
			System.out.println("Số tiền muốn rút không hợp lệ!");
			return rutTien();
		}
		return rut;
	}
	
	//Khoi tao phuong thuc dao han
	public double daoHan() {
		double laiXuat = 0.035;
		soTienTrongTK = soTienTrongTK + soTienTrongTK * laiXuat;
		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
		String str1 = currencyEN.format(soTienTrongTK);
		System.out.println("Ban vua duoc " + str1 + "Dao han 1 thang ");
		return soTienTrongTK;
	}
	
	void inTK() {
		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
		String str1 = currencyEN.format(soTienTrongTK);
		System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
	}
	
}
