package ThongTinXe;
import java.util.Scanner;
public class Main {
	//tạo phương thức nhập thông tin cho xe
	static Scanner sc = new Scanner(System.in);
      static void nhapXe(Vehicle xe){
            System.out.print("Nhập mã xe: ");
            xe.setMaXe(sc.nextInt());sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhập dung tích xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhập trị giá xe: ");
            xe.setTriGia(sc.nextDouble());sc.nextLine();
            System.out.print("Mô tả: ");
            xe.setMoTa(sc.nextLine());
            //sc.close();
        }
	
	public static void main(String[] args) {
		boolean flag = true;
		int n = 0;
		Vehicle []v = null;
		//Su dung switch case de tao menu cho chuong trinh
		do {
			System.out.println("Ban chon lam gi: ");
			System.out.println("1.Tạo các đối tượng xe và nhập thông tin \n"+
                    "2.Xuất bảng kê khai tiền thuế của các xe.\n"+
                    "Nhập số khác để thoát");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				 System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
				 n = sc.nextInt();
				 //Khai bao mang v[] de chua so luong xe
				 v = new Vehicle[n];
				 for (int i = 0; i < n; i++) {
					 System.out.println("Xe thu " + (i + 1));
					 v[i] = new Vehicle();
					 nhapXe(v[i]);
				 }
				break;
			case 2: 
				System.out.printf("%5s %5s %5s %10s %10s %8s \n","Mã xe","Chủ xe","Dung tích","Trị giá","mô tả","Thuế");
				for (int i = 0; i < n; i++) {
					v[i].inThue();
				}
				break;
			default: 
				System.out.println("Bye");
				flag = false;
				break;
			}
		}while(flag);
		
		
	}
}
