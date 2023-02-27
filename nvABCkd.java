package tuan3.vd.bttruong;

public class nvABCkd extends nvABC{
    private int dstoithieu;
    private int dsthang;

    public nvABCkd(){}
    public nvABCkd(String ma,String ten,int namsinh,String gioitinh,int hesoluong,int namvaolam,int dstoithieu,int dsthang){
        setMa(ma);
        setTen(ten);
        setGioitinh(gioitinh);
        setHesoluong(hesoluong);
        setNamsinh(namsinh);
        setNamvaolam(namvaolam);
        this.dstoithieu=dstoithieu;
        this.dsthang=dsthang;
    }

    public int getDstoithieu() {
        return this.dstoithieu;
    }

    public void setDstoithieu(int dstoithieu) {
        this.dstoithieu = dstoithieu;
    }

    public int getDsthang() {
        return this.dsthang;
    }

    public void setDsthang(int dsthang) {
        this.dsthang = dsthang;
    }

    @Override
    public float luong() {
       return getHesoluong()*luongcb+(15/100*(dsthang-dstoithieu)*500);
    }

    @Override
    public char xeploai() {
       if(dsthang<(dstoithieu/2))
       return 'D';
       if(dsthang<(dstoithieu*2))
       return 'A';
       if(dsthang>=dstoithieu)
       return 'B';
       return 'C';
    }
    
    @Override
    public void nhap(){
        super.nhap();
		System.out.print("Nhap so doanh so toi thieu:");
		dstoithieu=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap doanh so trong thang:");
		dsthang=Integer.parseInt(sc.nextLine());
    }

	@Override
	public String toString(){
        return String.format(super.toString()+"%10d|%10d|%10d|%7d|%20s|%8d|%9d|%7c|%15s|%7f",0,0,dstoithieu,dsthang,0,0,0,xeploai(),danhgia(),luong());

	}
    
}
