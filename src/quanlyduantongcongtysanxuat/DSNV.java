package quanlyduantongcongtysanxuat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class DSNV {
    private int n;
    private ArrayList <NHANVIEN> dsnv;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien: ");
        n = sc.nextInt();
        dsnv = new ArrayList <>();
        for(int i = 0;i<n;i++){
            System.out.println("Nhan vien thu "+(i+1)+":");
            NHANVIEN x = new NHANVIEN();
            x.nhap();
            dsnv.add(x);
        }
    }
    public void xuat(){
        System.out.println("DANH SACH NHAN VIEN");
        System.out.printf("%20s","ho ten");
        System.out.printf("%20s","gioi tinh");
        System.out.printf("%20s","ngay sinh");
        System.out.printf("%20s","dia chi");
        System.out.printf("%20s","so CMTND");
        System.out.printf("%20s","so dien thoai");
        System.out.printf("%20s","he so luong");
        System.out.printf("%20s","luong");
        for(int i =0;i<n;i++){
            dsnv.get(i).xuat();
        }
    }
    public void timkiem(){
        Scanner sc = new Scanner(System.in);
        int sdt;
        System.out.print("\nNhap so dien thoai cua nhan vien muon tim kiem: ");
        sdt = sc.nextInt();
        dsnv.stream().filter(x -> (x.getsdt()==sdt)).forEachOrdered(x -> {
            System.out.printf("%20s","ho ten");
            System.out.printf("%20s","gioi tinh");
            System.out.printf("%20s","ngay sinh");
            System.out.printf("%20s","dia chi");
            System.out.printf("%20s","so CMTND");
            System.out.printf("%20s","so dien thoai");
            System.out.printf("%20s","he so luong");
            System.out.printf("%20s","luong");
            x.xuat();
        });
    }
    public void luufile() throws FileNotFoundException, IOException {
        File fname = new File("Nhanvien.dat");
        try (FileOutputStream fout = new FileOutputStream (fname); ObjectOutputStream out = new ObjectOutputStream (fout)) {
            out.writeObject(dsnv);
        }
        System.out.println("\nDa luu file thanh cong!");
    }
    public void docfile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File fname = new File ("Nhanvien.dat");
        try (FileInputStream fin = new FileInputStream(fname);
             ObjectInputStream in = new ObjectInputStream(fin)) {
            dsnv = (ArrayList<NHANVIEN>)in.readObject();
            n = dsnv.size();
            in.close();
            fin.close();
        }
        System.out.println("Da doc file thanh cong!");
    }
    public void xoathongtin(){
        int sdt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap sdt nhan vien can xoa: ");
        sdt = sc.nextInt();
        for(NHANVIEN x : dsnv){
            if(x.getsdt()==sdt){
                dsnv.remove(x);
                System.out.println("\nDa xoa khach hang co ma:"+sdt);
                break;
            }
            System.out.printf("%20s","ho ten");
            System.out.printf("%20s","gioi tinh");
            System.out.printf("%20s","ngay sinh");
            System.out.printf("%20s","dia chi");
            System.out.printf("%20s","so dien thoai");
            System.out.printf("%20s","ma so thue");
            x.xuat();
        }
    }
}

