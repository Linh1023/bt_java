package tuan3.vd.bttruong;
import java.util.Scanner;

public abstract class  nvT {
	static Scanner sc =new Scanner(System.in);

	private String ma;
	private String ten;
	

	public nvT (){}
    public nvT(String ma,String ten){
        this.ma=ma;
        this.ten=ten;
    }

	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}


    public abstract float luong();
    public abstract String danhhieu();
    public String danhgia(){
		if(danhhieu()=="chien si thi dua")
        return "nang luc tot";
		if(danhhieu()=="lao dong tien tien")
        return "co nang luc";
		return " ";
    }
	public void nhap(){
		System.out.print("Nhap ma nhan vien: ");
		ma=sc.nextLine();
		System.out.print("Nhap ten nhan vien: ");
		ten=sc.nextLine();
	}
	public String toString(){
		return String.format("%5s|%7s|",ma,ten);
	}
	public void xuat(){
		System.out.println(toString());
	}
}
