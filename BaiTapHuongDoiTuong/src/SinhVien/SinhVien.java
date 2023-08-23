package SinhVien;

public class SinhVien {
	private String maSinhVien;
	private String tenSinhVien;
	private float diemLiThuyet, diemThucHanh;
	
	public SinhVien() {
		
	}
	
	public SinhVien(String maSV, String tenSV, float diemLT, float diemTH) {
		this.maSinhVien = maSV;
		this.tenSinhVien = tenSV;
		this.diemLiThuyet = diemLT;
		this.diemThucHanh = diemTH;
	}
	
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	
	public String getMaSinhVien() {
		return maSinhVien;
	}
	
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	
	public float getDiemLyThuyet() {
		return diemLiThuyet;
	}
	
	public void setDiemLyThuyet(float diemLiThuyet) {
		this.diemLiThuyet = diemLiThuyet;
	}
	
	public float getDiemThucHanh() {
		return diemThucHanh;
	}
	
	public void setDiemThucHanh(float diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}
	
	public double tinhDiemTrungBinh() {
		return (diemLiThuyet + diemThucHanh) / 2;
	}
	
	@Override
	public String toString() {
		return maSinhVien+ " - " + tenSinhVien + "diem trung binh" + tinhDiemTrungBinh();
	}
	
	/**
	 * %6d: Đây là định dạng cho một số nguyên (d đại diện cho "decimal" - hệ thập phân). 
	 * Trong trường hợp này, số nguyên sẽ được in ra có chiều rộng tối thiểu là 6 ký tự. 
	 * Nếu số nguyên có ít hơn 6 chữ số, các ký tự trống (spaces) sẽ được thêm vào bên 
	 * trái để đảm bảo tổng số ký tự là 6.
	 * 
	 * 
	 * %-18s: Đây là định dạng cho một chuỗi (s). Dấu - ở đầu thể hiện là căn lề trái, 
	 * tức là chuỗi sẽ được in ra bên trái, và chiều rộng tối thiểu của chuỗi là 18 ký tự. 
	 * Tương tự như trên, nếu chuỗi ngắn hơn 18 ký tự, các ký tự trống sẽ được thêm vào bên 
	 * phải để đảm bảo tổng số ký tự là 18.
	 * 
	 * 
	 * %10.2f: Đây là định dạng cho một số thực (f). Trong trường hợp này, số thực sẽ được
	 *  in ra với tổng cộng 10 ký tự, bao gồm cả phần nguyên, phần thập phân và các ký tự liền nhau.
	 *   Số sau dấu phẩy thập phân (2) cho biết sẽ có đúng 2 chữ số sau dấu phẩy thập phân trong kết quả in ra.
	 */
	
	//hoặc có thể tạo một phương thức khác dùng để hiển thị kết quả
    public void inSV() {
        System.out.printf("%10s %-18s %10.2f %12.2f %12.2f \n", maSinhVien, tenSinhVien, diemLiThuyet, diemThucHanh, tinhDiemTrungBinh());
    }
}
