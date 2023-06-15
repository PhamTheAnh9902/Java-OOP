package quanlyduantongcongtysanxuat;

import java.util.Scanner;
public class NHANVIEN extends person {
    private String soCMTND;
    private int soDienThoai;
    private float heSoLuong;
    public NHANVIEN(){
        super();
        soDienThoai=0;
        heSoLuong=0.0f;
    }
    public NHANVIEN(String ten, String gt, String ns, String dc, String cmt, int sdt, float hsl){
        super(ten,gt,ns,dc);
        soCMTND = cmt;
        soDienThoai=sdt;
        heSoLuong=hsl;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so CMTND: ");
        soCMTND =sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        soDienThoai =sc.nextInt();
        System.out.println("Nhap he so luong: ");
        heSoLuong =sc.nextFloat();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%15s", soCMTND);
        System.out.printf("%15s", soDienThoai);
        System.out.printf("%8s", heSoLuong);
        System.out.printf("%15s", luong());
    }
    public float luong(){
        int l;
        l= (int) (1490000 * heSoLuong);
        return l;
    }
    public String getcmt() {
        return soCMTND ;
    }
    public int getsdt(){
        return soDienThoai;
    }
    public float gethsl(){
        return heSoLuong;
    }
    public void setcmt(String soCMTND) {
        this.soCMTND = soCMTND;
    }
    public void setsdt(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public void sethsl(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}

