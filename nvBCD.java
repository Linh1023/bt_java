package tuan3.vd.bttruong;

public class nvBCD extends nvT{
    private int tongtientaora;

    public int getTongtientaora() {
        return this.tongtientaora;
    }

    public void setTongtientaora(int tongtientaora) {
        this.tongtientaora = tongtientaora;
    }
    public nvBCD(){}
    public nvBCD(String ma,String ten,int tongtientaora){
        setMa(ma);
        setTen(ten);
        this.tongtientaora=tongtientaora;
    }

    public float luong(){
        return tongtientaora*15/100;
    }
public String danhhieu(){
    if(luong()>20000)return "chien si thi dua";
    if(luong()>10000)return "lao dong tien tien";
    return "0";
    }
    
    @Override
    public void nhap(){
        super.nhap();
		System.out.print("Nhap tong tien tao ra:");
		tongtientaora=Integer.parseInt(sc.nextLine());
    }

	@Override
	public String toString(){
        return String.format(super.toString()+"%7d|%8s|%8d|%5d|%10d|%10d|%10d|%7d|%20s|%8d|%9d|%7c|%15s|%7f",0,0,0,0,0,0,0,0,0,0,tongtientaora,'0',danhgia(),luong());
    }
}