package donguyennhathan.com.model;

public abstract class NhanVien {
	private int ma;
	private String ten;
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public abstract void tinhLuong(int ngayCong);
}
