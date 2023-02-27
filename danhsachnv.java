package tuan3.vd.bttruong;

import java.util.Scanner;

public class danhsachnv {
    static Scanner sc=new Scanner(System.in);
    nvT ds[];
    public void nhapds(){
        ds=new nvT[8];
        ds[0]=new nvABCsx("4102","Linh",2003,"Nam",3,2023,3,2);
        ds[1]=new nvABCsx("4109","Trung",2005,"Nam",4,2023,4,5);
        ds[2]=new nvABCsx("4103","Thanh",2009,"Nu",1,2020,1,5);
        ds[3]=new nvABCkd("4104","Truong",2004,"Nam",3,2015,200,300);
        ds[4]=new nvABCqlcb("4105","Duong",2000,"Nu",2,2022,"Quan tri vien",3);
        ds[5]=new nvBCD("4106","Vi",300000);
        ds[6]=new nvBCD("4107","Lan",50000);
        ds[7]=new nvBCD("4108","Trang",100000);
        // System.out.print("Nhap tong so nhan vien: ");
        // int n=Integer.parseInt(sc.nextLine());
        // ds=new nvT[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("Nhap nhan vien thu:"+i);

        //     nhap1nv(i);   
        // }
    }
    public void nhap1nv(int i){
        System.out.println("1.Nhan vien cong ty ABC");
        System.out.println("2.Nhan vien cong ty BCD");
        System.out.println("Thuoc cong ty: ");
        int u=Integer.parseInt(sc.nextLine());
        switch(u){
            case 1:
            nhap1nvABC(i);
            break;
            case 2:
            ds[i]=new nvBCD();
            ds[i].nhap();
            break;
            default:break;
        
        }
    }
    public void nhap1nvABC(int i){
        System.out.println("1.Nhan vien san xuat");
        System.out.println("2.Nhan vien kinh doanh");
        System.out.println("3.Nhan vien quan ly can bo");
        System.out.println("Thuoc nhom: ");
        int u=Integer.parseInt(sc.nextLine());
        switch(u){
            case 1:
            ds[i]=new nvABCsx();
            ds[i].nhap();
            break;
            case 2:
            ds[i]=new nvABCkd();
            ds[i].nhap();
            break;
            case 3:
            ds[i]=new nvABCqlcb();
            ds[i].nhap();
            break;
            default:break;
        }
    }
    public void xuat(){
        // ten|ma|namsinh|gioitinh|hesoluong|namvaolam|songaynghi|pcnangnhoc|dstoithieu|dsthang|chucvu|hschucvu|tongtientaora|xeploai|danhgia|luong
        System.out.println("ma   |ten    |namsinh|gioitinh|HS luong|nambd|songaynghi|pcnangnhoc|dstoithieu|dsthang|chucvu\t\t   |hschucvu|tientaora|xeploai|danhgia\t      |luong");
        for(nvT x :ds)
            x.xuat();
    }
    public void demnv(){
        int demabc=0;
        int dembcd=0;
        for(int i=0;i<ds.length;i++){
            if(ds[i] instanceof nvABC)
            demabc++;
            if(ds[i] instanceof nvBCD)
            dembcd++;
        }
        System.out.println("So nhan vien ABC:"+demabc);
        System.out.println("So nhan vien BCD:"+dembcd);
    }
    public int demnlt(){
        int dem=0;
        for(int i=0;i<ds.length;i++){
            if(ds[i].danhgia()=="nang luc tot")
            dem++;
        }
        return dem;
    }
    public void nvChuaThiDuaBCD(){
        int dem=0;
        System.out.println("Danh sach chua danh hieu BCD:");
        for(int i=0;i<ds.length;i++){
            if(ds[i] instanceof nvBCD){
                if(ds[i].danhhieu()=="0"){
                    ds[i].xuat();
                    dem++;
                }
            }
        }
        System.out.println("Tong:"+dem);   
    }
    public void nvLaoDongTienTienABC(){
        int dem=0;
        System.out.println("Danh sach lao dong tien tien ABC:");
        for(int i=0;i<ds.length;i++){
            if(ds[i] instanceof nvABC){
                if(ds[i].danhhieu()=="lao dong tien tien"){
                    ds[i].xuat();
                    dem++;
                }
            }
        }
        System.out.println("Tong:"+dem);   
    }

}
