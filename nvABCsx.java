package tuan3.vd.bttruong;

public class nvABCsx extends nvABC{
    private int songaynghi;
    private int pcnangnhoc;

    public nvABCsx(){}
    public nvABCsx(String ma,String ten,int namsinh,String gioitinh,int hesoluong,int namvaolam,int songaynghi,int pcnangnhoc){
        setMa(ma);
        setTen(ten);
        setGioitinh(gioitinh);
        setHesoluong(hesoluong);
        setNamsinh(namsinh);
        setNamvaolam(namvaolam);
        this.songaynghi=songaynghi;
        this.pcnangnhoc=pcnangnhoc;
        
    }
	public int getPcnangnhoc() {
        return this.pcnangnhoc;
    }

    public void setPcnangnhoc(int pcnangnhoc) {
        this.pcnangnhoc = pcnangnhoc;
    }

    public int getSongaynghi() {
        return this.songaynghi;
    }

    public void setSongaynghi(int songaynghi) {
        this.songaynghi = songaynghi;
    }

    @Override
    public char xeploai(){
        if(songaynghi<=1)
        return 'A';
        if(songaynghi<=3)
        return 'B';
        if(songaynghi<=5)
        return 'C';
        return 'D';
    }
    public float luong(){
        float u =getHesoluong()*luongcb*(1+getPcnangnhoc());
        if(namhientai-getNamvaolam()>5){
            float phucapthamnien=((namhientai-getNamvaolam())*luongcb);
            if(xeploai()=='A')
            return u+phucapthamnien;
            if(xeploai()=='B')
            return u*75/100+phucapthamnien;
            if(xeploai()=='C')
            return u*50/100+phucapthamnien;
            return u*0/100+phucapthamnien;
        }else{
            if(xeploai()=='A')
            return u;
            if(xeploai()=='B')
            return u*75/100;
            if(xeploai()=='C')
            return u*50/100;
            return u*0/100;
        }
    }

    @Override
    public void nhap(){
        super.nhap();
		System.out.print("Nhap so ngay nghi: ");
		songaynghi=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap phu cap nang nhoc: ");
		pcnangnhoc=Integer.parseInt(sc.nextLine());
    }

	@Override
	public String toString(){
		return String.format(super.toString()+"%10d|%10d|%10d|%7d|%20s|%8d|%9d|%7c|%15s|%7f",songaynghi,pcnangnhoc,0,0,0,0,0,xeploai(),danhgia(),luong());
	}

    
}
