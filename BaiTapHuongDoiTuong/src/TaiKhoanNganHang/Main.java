package TaiKhoanNganHang;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static void nhapTK(Account tk) {
		System.out.println("Nhap so tai khoan: ");
		tk.setSoTK(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap ten tai khoan: ");
		tk.setTenTK(sc.nextLine());
		tk.setSoTienTrongTK(50);
	}
	
	public static void main(String[] args) {
		Account a[] = null;
		int soLuong = 0;
		long nhapSoTK, getSoTK;
		boolean flag = true;
		do {
			System.out.println("Ban vui long chon: ");
			System.out.println("1. Nhap thong tin cua cac khach hang \n"
					+ "2. Xuat danh sach thong tin cua cac khach hang \n"
					+ "3. Nap tien\n"
					+ "4. Rut tien\n"
					+ "5. Dao han\n"
					+ "6. Chuyen khoan\n"
					+ "So khac de thoat");
			int choose = sc.nextInt();
			switch(choose) {
				case 1:
					System.out.println("Nhap so luong khach hang ban muon nhap:");
					soLuong = sc.nextInt();
					a = new Account[soLuong];
					for (int i = 0; i < soLuong; i++) {
						System.out.println("Khach hang so: " + (i + 1));
						a[i] = new Account();
						nhapTK(a[i]);
					}
					break;
				case 2: 
					System.out.printf("%-10s %-20s %20s\n", "So Tk", "Ten TK", "so tien trong TK");
					for (int i = 0; i < a.length; i++) {
						a[i].inTK();
					}
					break;
				case 3: 
					System.out.println("Nhap so tai khoan can tap tien: ");
					nhapSoTK = sc.nextLong();
					for (int i = 0; i < a.length; i++) {
						getSoTK = a[i].getSoTK();
						if (nhapSoTK == getSoTK) {
							System.out.println("Ban chon tai khoan" + nhapSoTK);
							a[i].napTien();
						}else {
							System.out.println("So TK cua ban khong nam trong ngan hang. Vui long kiem tra lai!!!");
						}
					}
					break;
				case 4: 
					System.out.println("Nhap so tai khoan can tap tien: ");
					nhapSoTK = sc.nextLong();
					for (int i = 0; i < a.length; i++) {
						getSoTK = a[i].getSoTK();
						if (nhapSoTK == getSoTK) {
							System.out.println("Ban chon tai khoan" + nhapSoTK);
							a[i].rutTien();
						}
					}
					break;
				case 5:
					System.out.println("Nhap so tai khoan can dao han: ");
					nhapSoTK = sc.nextLong();
					for (int i = 0; i < a.length; i++) {
						getSoTK = a[i].getSoTK();
						if (nhapSoTK == getSoTK) {
							System.out.println("Tai khoan dao han" + nhapSoTK);
							a[i].daoHan();
						}else {
							System.out.println("Khong dung so tai khoan. Vui long kiem tra lai!!!");
						}
					}
					break;
				case 6:
					System.out.println("Nhap so tai khoan ban muon chuyen tien: ");
					nhapSoTK = sc.nextLong();
					System.out.println("Nhap so tai khoan nhan tien: ");
					long soTKNhan = sc.nextLong();
					for (int i = 0; i < a.length; i++) {
						getSoTK = a[i].getSoTK();
						if (nhapSoTK == getSoTK) {
							double soTienTrongTaiKhoan = a[i].getSoTienTrongTK();
							for (int j = 0; j < a.length; j++) {
								long getSoTaiKhoan2 = a[j].getSoTK();
								if (soTKNhan == getSoTaiKhoan2) {
									double nhan = a[j].getSoTienTrongTK();
									System.out.println("Nhap so tien can chuyen: ");
									double tienChuyen = sc.nextDouble();
									if (tienChuyen <= soTienTrongTaiKhoan) {
										soTienTrongTaiKhoan -= tienChuyen;
										nhan = nhan + tienChuyen;
										a[i].setSoTienTrongTK(soTienTrongTaiKhoan);
										a[j].setSoTienTrongTK(nhan);
										System.out.println("Tai khoan so" + nhapSoTK + "Vua chuyen: $" + tienChuyen);
										System.out.println("Tai khoan so" + getSoTaiKhoan2 + "Vua nhan: $" + tienChuyen);
									}else {
										System.out.println("So tien chuyen khong hop le: ");
									}
								}else {
									System.out.println("So tai khoan khong hop le: ");
								}
							}
						}else {
							System.out.println("");
						}
					}
					break;
				default:
					System.out.println("Bye!!!");
					flag = false;
					break;
			}
		}while(flag);
	}
}
