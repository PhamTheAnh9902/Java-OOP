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

public class DSDA  {
    private int n;
    private ArrayList <DUAN> dsDA;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so du an: ");
        n=sc.nextInt();
        dsDA = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Du An thu"+(i+1)+":");
            DUAN x = new DUAN();
            x.nhap();
            dsDA.add(x);
        }
    }
    public void xuat(){
        System.out.println("DANH SACH DU AN");
        System.out.printf("%10s","Ma DA");
        System.out.printf("%20s","Ten DA");
        System.out.printf("%20s","Dia Diem DA");
        System.out.printf("%20s","Ngay BD");
        System.out.printf("%15s","Phong Ban");
        System.out.printf("%10s","Tong Tien DA");
        for(int i=0;i<n;i++){
            dsDA.get(i).xuat();
        }
    }
    public void timkiem(){
        Scanner sc = new Scanner(System.in);
        String maDA;
        System.out.println("Nhap ma du an cua du an muon tim kiem: ");
        maDA = sc.nextLine();
        dsDA.stream().filter(x -> (x.getMaDA().equals(maDA))).forEachOrdered(x -> {
            System.out.println("DANH SACH DU AN");
            System.out.printf("%10s","Ma DA");
            System.out.printf("%20s","Ten DA");
            System.out.printf("%20s","Dia Diem DA");
            System.out.printf("%20s","Ngay BD");
            System.out.printf("%15s","Phong Ban");
            System.out.printf("%10s","Tong Tien DA");
            x.xuat();
        });
    }
    public void luufile() throws FileNotFoundException, IOException {
        File fname = new File ("DuAn.dat");
        FileOutputStream fout = new FileOutputStream (fname);
        ObjectOutputStream out = new ObjectOutputStream (fout);
        out.writeObject(dsDA);
        out.close();
        fout.close();
        System.out.println("\nDa luu file thanh cong!");
    }
    public void docfile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File fname = new File ("DuAn.dat");
        try (FileInputStream fin = new FileInputStream(fname);
             ObjectInputStream in = new ObjectInputStream(fin)) {
            dsDA = (ArrayList<DUAN>)in.readObject();
            n = dsDA.size();
            in.close();
            fin.close();
        }
        System.out.println("Da doc file thanh cong!");
    }
    public void xoathongtin(){
        String maDA;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so du an can xoa: ");
        maDA = sc.nextLine();
        for(DUAN x : dsDA){
            if(x.getMaDA().equals(maDA)){
                dsDA.remove(x);
                System.out.println("\nDa xoa khach hang co ma:"+ maDA);
                break;
            }
            System.out.printf("%10s","Ma DA");
            System.out.printf("%20s","Ten DA");
            System.out.printf("%20s","Dia Diem DA");
            System.out.printf("%20s","Ngay BD");
            System.out.printf("%15s","Phong Ban");
            System.out.printf("%10s","Tong Tien DA");
            x.xuat();
        }
    }
}

