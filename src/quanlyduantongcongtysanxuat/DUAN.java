package quanlyduantongcongtysanxuat;
import java.io.Serializable;
import java.util.Scanner;
public class DUAN implements Serializable{
    private String tenDA;
    private String maDA;
    private String ddDA;
    private String ngayBD;
    private String phongBan;
    private double tongTDA;
    public DUAN(){
    }
    public DUAN(String maDA, String tenDA, String ddDA, String ngayBD, String phongBan, double tongTDA ){
        this.tenDA=tenDA;
        this.maDA=maDA;
        this.ddDA=ddDA;
        this.ngayBD=ngayBD;
        this.phongBan=phongBan;
        this.tongTDA=tongTDA;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma du an: ");
        maDA=sc.nextLine();
        System.out.println("Nhap ten du an: ");
        tenDA=sc.nextLine();
        System.out.println("Nhap dia diem du an: ");
        ddDA=sc.nextLine();
        System.out.println("Nhap ngay bat dau du an:  ");
        ngayBD=sc.nextLine();
        System.out.println("Nhap phong ban: ");
        phongBan=sc.nextLine();
        System.out.println("tong tien  ");
        tongTDA=sc.nextDouble();
    }
    public void xuat(){
        System.out.printf("\n%10s", maDA);
        System.out.printf("%20s", tenDA);
        System.out.printf("%20s", ddDA);
        System.out.printf("%20s", ngayBD);
        System.out.printf("%15s", phongBan);
        System.out.printf("%10f", tongTDA);
    }
    public String getTenDA() {
        return tenDA;
    }
    public void setTenDA(String tenDA) {
        this.tenDA = tenDA;
    }
    public String getMaDA() {
        return maDA;
    }
    public void setMaDA(String maDA) {
        this.maDA = maDA;
    }
    public String getDdDA() {
        return ddDA;
    }
    public void setDdDA(String ddDA) {
        this.ddDA = ddDA;
    }
    public String getNgayBD() {
        return ngayBD;
    }
    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }
    public String getPhongBan() {
        return phongBan;
    }
    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
    public double getTongTDA() {
        return tongTDA;
    }
    public void setTongTDA(double tongTDA) {
        this.tongTDA = tongTDA;
    }
}

