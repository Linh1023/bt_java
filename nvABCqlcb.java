package tuan3.vd.bttruong;

public class nvABCqlcb extends nvABC{

    private String chucvu;
    private int hschucvu;

    public int getHschucvu() {
        return this.hschucvu;
    }

    public void setHschucvu(int hschucvu) {
        this.hschucvu = hschucvu;
    }

    public String getChucvu() {
        return this.chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    public nvABCqlcb(){}

    public nvABCqlcb(String ma,String ten,int namsinh,String gioitinh,int hesoluong,int namvaolam,String chucvu,int hschucvu){
        setMa(ma);
        setTen(ten);
        setGioitinh(gioitinh);
        setHesoluong(hesoluong);
        setNamsinh(namsinh);
        setNamvaolam(namvaolam);
        this.hschucvu=hschucvu;
        this.chucvu=chucvu;
    }

    @Override
    public float luong() {
        return getHesoluong()*luongcb+(hschucvu*1100);
    }

    @Override
    public char xeploai() { 
        return 'A';
    }

    @Override
    public void nhap(){
        super.nhap();
		System.out.print("Nhap chuc vu:");
		chucvu=sc.nextLine();
		System.out.print("Nhap he so chuc vu:");
		hschucvu=Integer.parseInt(sc.nextLine());
    }

	@Override
	public String toString(){
        return String.format(super.toString()+"%10d|%10d|%10d|%7d|%20s|%8d|%9d|%7c|%15s|%7f",0,0,0,0,chucvu,hschucvu,0,xeploai(),danhgia(),luong());

	}
}