package quanlyduantongcongtysanxuat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class DSKH {
    private int n;
    private ArrayList <KHACHHANG> dskh;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so khach hang: ");
        n = sc.nextInt();
        dskh = new ArrayList <>();
        for(int i = 0;i<n;i++){
            System.out.println("Khach hang thu "+(i+1)+":");
            KHACHHANG x = new KHACHHANG();
            x.nhap();
            dskh.add(x);
        }
    }
    public void xuat(){
        System.out.println("DANH SACH KHACH HANG");
        System.out.printf("%20s","ho ten");
        System.out.printf("%20s","gioi tinh");
        System.out.printf("%20s","ngay sinh");
        System.out.printf("%20s","dia chi");
        System.out.printf("%20s","so dien thoai");
        System.out.printf("%20s","ma so thue");
        for(int i =0;i<n;i++){
            dskh.get(i).xuat();
        }
    }
    public void timkiem(){
        Scanner sc = new Scanner(System.in);
        String sdt;
        System.out.print("\nNhap so dien thoai cua khach hang muon tim kiem: ");
        sdt = sc.nextLine();
        dskh.stream().filter(x -> (x.getSdt().equals(sdt))).forEachOrdered(x -> {
            System.out.printf("%20s","ho ten");
            System.out.printf("%20s","gioi tinh");
            System.out.printf("%20s","ngay sinh");
            System.out.printf("%20s","dia chi");
            System.out.printf("%20s","so dien thoai");
            System.out.printf("%20s","ma so thue");
            x.xuat();
        });
    }
    public void luufile() throws FileNotFoundException, IOException {
        File fname = new File("KhachHang.dat");
        try (FileOutputStream fout = new FileOutputStream (fname); ObjectOutputStream out = new ObjectOutputStream (fout)) {
            out.writeObject(dskh);
        }
        System.out.println("\nDa luu file thanh cong!");
    }
    public void docfile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File fname = new File ("KhachHang.dat");
        try (FileInputStream fin = new FileInputStream(fname);
             ObjectInputStream in = new ObjectInputStream(fin)) {
            dskh = (ArrayList<KHACHHANG>)in.readObject();
            n = dskh.size();
            in.close();
            fin.close();
        }
        System.out.println("Da doc file thanh cong!");
    }
    public void xoathongtin(){
        String mst;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so thue khach hang can xoa: ");
        mst = sc.nextLine();
        for(KHACHHANG x : dskh){
            if(x.getMsthue().equals(mst)){
                dskh.remove(x);
                System.out.println("\nDa xoa khach hang co ma:"+mst);
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

