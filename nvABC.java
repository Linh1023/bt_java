package tuan3.vd.bttruong;

public abstract class nvABC extends nvT{
    private int namsinh;
    private String gioitinh;
    private int hesoluong;
    private int namvaolam;
    static int luongcb=1490;
    static int namhientai=2023;


    public int getNamsinh() {
        return this.namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getGioitinh() {
        return this.gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public float getHesoluong() {
        return this.hesoluong;
    }

    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }

    public int getNamvaolam() {
        return this.namvaolam;
    }

    public void setNamvaolam(int namvaolam) {
        this.namvaolam = namvaolam;
    }

    // public float phucapthamnien(){
    //     if(namvaolam>=5)
    //     return (namvaolam*luongcb/100);
    //     return luongcb;
    // }
    public abstract char xeploai();
    public  String danhhieu(){
        if(xeploai()=='A')
        return "chien si thi dua";
        if(xeploai()=='B')
        return "lao dong tien tien";
        return "0";
    }
    public abstract float luong();

    @Override
    public void nhap(){
        super.nhap();
		System.out.print("Nhap nam sinh nhan vien: ");
		namsinh=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap gioi tinh nhan vien: ");
		gioitinh=sc.nextLine();
		System.out.print("Nhap he so luong nhan vien: ");
		hesoluong=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap nam vao lam nhan vien: ");
		namvaolam=Integer.parseInt(sc.nextLine());
    }

	@Override
	public String toString(){
		return String.format(super.toString()+"%7d|%8s|%8d|%5d|",namsinh,gioitinh,hesoluong,namvaolam);
	}
}

