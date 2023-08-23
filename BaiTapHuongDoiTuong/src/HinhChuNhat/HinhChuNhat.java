package HinhChuNhat;

public class HinhChuNhat {
	double dai, rong;
	
	//KHởi tạo phương thức constructor khong có tham số
	public HinhChuNhat() {
		
	}
	
	//Khởi tạo phương thức constructor có tham số
	public HinhChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong; 
	}
	
	//---------------begin getter and setter---------------------

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}
	
	//---------------end getter and setter---------------------
	
	//Ham tinh dien tich
	double tinhDienTich() {
		return dai * rong;
	}
	
	//Ham tinh chu vi
	double tinhChuVi() {
		return (dai + rong) * 2;
	}
	
}
