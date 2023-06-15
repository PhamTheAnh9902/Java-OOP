package quanlyduantongcongtysanxuat;

import java.io.Serializable;
import java.util.Scanner;
public class person  implements Serializable {
    private String ten;
    private String gt;
    private String ns;
    private String dc;
    public person() {
    }
    public person(String ten, String gt, String ns, String dc) {
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho va ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gt = sc.nextLine();
        System.out.println("Nhay ngay sinh: ");
        ns = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        dc = sc.nextLine();
    }
    public void xuat(){
        System.out.printf("\n%20s",ten);
        System.out.printf("%20s",gt);
        System.out.printf("%20s",ns);
        System.out.printf("%20s",dc);
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getGt() {
        return gt;
    }
    public void setGt(String gt) {
        this.gt = gt;
    }
    public String getNs() {
        return ns;
    }
    public void setNs(String ns) {
        this.ns = ns;
    }
    public String getDc() {
        return dc;
    }
    public void setDc(String dc) {
        this.dc = dc;
    }
}

