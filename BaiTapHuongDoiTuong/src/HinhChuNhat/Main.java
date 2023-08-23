package HinhChuNhat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Khoi tao 1 object hcn thuoc class hinh cn đẻ sử dụng
		HinhChuNhat hcn = new HinhChuNhat();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu dai hinh chu nhat: ");
		hcn.setDai(scanner.nextDouble());
		System.out.println("Nhap chieu rong hinh chu nhat: ");
		hcn.setRong(scanner.nextDouble());
		
		System.out.println("Chu vi hinh chu nhat: " + hcn.tinhChuVi());
		System.out.println("Dien tich hinh chu nhat: " + hcn.tinhDienTich());
		
		
		scanner.close();
	}
}
