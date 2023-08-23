package kiemtrathucpham;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ThucPham thucPham = new ThucPham();
		System.out.println("Nhap ma hang: ");
		thucPham.setMaHang(scanner.nextInt());
		scanner.nextLine();
		do {
			System.out.println("Nhap ten hang: ");
			thucPham.setTenHang(scanner.nextLine());
		}while(!thucPham.kiemTraTenHang());
		System.out.println("Nhap don gia: ");
		thucPham.setDonGia(scanner.nextDouble());
		
		do {
			System.out.println("Nhap ngay thang nam ngay san xuat: ");
			thucPham.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			System.out.println("nhập năm,tháng,ngày hết hạn : ");
			thucPham.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}while(!thucPham.kiemTraNgay());
		System.out.println(thucPham);
		thucPham.kiemTraHanSuDung();
		scanner.close();
	}
}
