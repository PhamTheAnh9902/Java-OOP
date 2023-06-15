package quanlyduantongcongtysanxuat;
import java.util.Scanner;
public class KHACHHANG extends person {
    String sdt;
    String msthue;
    public KHACHHANG() {
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        System.out.println("Nhap ma so thue: ");
        msthue = sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%20s",sdt);
        System.out.printf("%20s",msthue);
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getMsthue() {
        return msthue;
    }
    public void setMsthue(String msthue) {
        this.msthue = msthue;
    }
}

