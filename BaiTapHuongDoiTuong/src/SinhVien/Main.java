package SinhVien;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//--------------Sinh Vien 1 -------------
		SinhVien sv1 = new SinhVien();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten sinh vien");
		sv1.setTenSinhVien(scanner.nextLine());
		System.out.println("Nhap ma sinh vien");
		sv1.setMaSinhVien(scanner.nextLine());
		System.out.println("Nhap diem li thuyet");
		sv1.setDiemLyThuyet(scanner.nextFloat());
		scanner.nextLine();
		System.out.println("Nhap diem thuc hanh: ");
		sv1.setDiemThucHanh(scanner.nextFloat());
		scanner.nextLine();
		
		//--------------Sinh Vien 2 -------------
		SinhVien sv2 = new SinhVien();
		System.out.println("Nhap ten sinh vien");
		sv2.setTenSinhVien(scanner.nextLine());
		System.out.println("Nhap ma sinh vien");
		sv2.setMaSinhVien(scanner.nextLine());
		System.out.println("Nhap diem li thuyet");
		sv2.setDiemLyThuyet(scanner.nextFloat());
		/**
		 * Khi sử dụng scanner.nextFloat() để đọc 1 giá trị float bộ đệm của Scanner
		 * vẫn còn chứa giá trị xuống dòng 
		 * Tiếp theo sử dụng scanner.nextLine() để đọc dòng mới, nó chỉ đọc những dòng 
		 * còn lại của dòng trước đó và sau đó nhập dữ liệu mới 
		 */
		scanner.nextLine();
		System.out.println("Nhap diem thuc hanh: ");
		sv2.setDiemThucHanh(scanner.nextFloat());
		scanner.nextLine();
		
		//--------------Sinh Vien 3 -------------
		SinhVien sv3 = new SinhVien();
		System.out.println("Nhap ten sinh vien");
		sv3.setTenSinhVien(scanner.nextLine());
		System.out.println("Nhap ma sinh vien");
		sv3.setMaSinhVien(scanner.nextLine());
		System.out.println("Nhap diem li thuyet");
		sv3.setDiemLyThuyet(scanner.nextFloat());
		scanner.nextLine();
		System.out.println("Nhap diem thuc hanh: ");
		sv3.setDiemThucHanh(scanner.nextFloat());
		scanner.nextLine();
		
		scanner.close();
		
		//in theo format
		System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
		sv1.inSV();
		sv2.inSV();
		sv3.inSV();
	}
}		
