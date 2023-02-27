package tuan3.vd.bttruong;

public class quanlynv {
     static danhsachnv dsnv=new danhsachnv();
    public static void main(String[] args) {
        dsnv.nhapds();
        dsnv.demnv();
        System.out.println("So Nhan Vien 'Nang luc tot' la: "+dsnv.demnlt());
        dsnv.nvChuaThiDuaBCD();
        dsnv.nvLaoDongTienTienABC();
        dsnv.xuat();
        dsnv.nvLaoDongTienTienABC();
    }
}