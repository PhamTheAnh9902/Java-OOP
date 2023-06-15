package quanlyduantongcongtysanxuat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String [] args)throws IOException, FileNotFoundException, ClassNotFoundException
    {
        int chon,chon1,chon2,chon3 ;
        DSDA ds3 = new DSDA();
        DSKH ds2 = new DSKH();
        DSNV ds1 = new DSNV();
        File f = new File("duan.dat");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("----------------------------------");
            System.out.println("1.Danh sach nhan vien");
            System.out.println("2.Danh sach khach hang");
            System.out.println("3.Danh sach du an");
            System.out.println("Moi ban chon");
            chon = sc.nextInt();
            System.out.println("----------------------------------");
            switch(chon){
                case 1:
                    do{
                        System.out.println("\n----------------------------------");
                        System.out.println("1. Nhap danh sach nhan vien");
                        System.out.println("2. Hien danh sach nhan vien");
                        System.out.println("3. Tim kiem nhan vien can tim theo ma nhan vien");
                        System.out.println("4. luu danh sach nhan vien vao file");
                        System.out.println("5. Doc danh sach nhan vien tu file");
                        System.out.println("6. Xoa thong tin nhan vien can xoa");
                        System.out.println("7. Thoat chuong trinh");
                        System.out.println("Moi ban chon");
                        chon1 = sc.nextInt();
                        switch(chon1){
                            case 1:
                                ds1.nhap();
                                break;
                            case 2 :
                                ds1.xuat();
                                break;
                            case 3 :
                                ds1.timkiem();
                                break;
                            case 4 :
                                ds1.luufile();
                                break;
                            case 5 :
                                ds1.docfile();
                            case 6 :
                                ds1.xoathongtin();
                                break;
                            case 7 :
                                System.exit(0);

                        }
                    }
                    while(chon1 != 0);{
                    System.out.println("Moi ban chon lai");
                }
                case 2 :
                    do{
                        System.out.println("\n----------------------------------");
                        System.out.println("1. Nhap danh sach khach hang ");
                        System.out.println("2. Hien danh sach khach hang");
                        System.out.println("3. Tim kiem khach hang can tim theo so dien thoai");
                        System.out.println("4. luu danh sach khach hang vao file");
                        System.out.println("5. Doc danh sach khach hang tu file");
                        System.out.println("6. Xoa thong tin khach hang can xoa");
                        System.out.println("7. Thoat chuong trinh");
                        System.out.println("Moi ban chon");
                        chon2 = sc.nextInt();
                        switch(chon2){
                            case 1:
                                ds2.nhap();
                                break;
                            case 2 :
                                ds2.xuat();
                                break;
                            case 3 :
                                ds2.timkiem();
                                break;
                            case 4 :
                                ds2.luufile();
                                break;
                            case 5 :
                                ds2.docfile();
                            case 6 :
                                ds2.xoathongtin();
                                break;
                            case 7 :
                                System.exit(0);
                        }
                    }
                    while(chon2 != 0);{
                    System.out.println("Moi ban chon lai");
                }
                case 3 :
                    do{
                        System.out.println("\n----------------------------------");
                        System.out.println("1. Nhap danh sach du an ");
                        System.out.println("2. Hien danh sach du an");
                        System.out.println("3. Tim kiem du an can tim theo ma du an");
                        System.out.println("4. luu danh sach du an vao file");
                        System.out.println("5. Doc danh sach du an tu file");
                        System.out.println("6. Xoa thong tin du an can xoa");
                        System.out.println("7. Thoat chuong trinh");
                        System.out.println("Moi ban chon");
                        chon3 = sc.nextInt();
                        switch(chon3){
                            case 1:
                                ds3.nhap();
                                break;
                            case 2 :
                                ds3.xuat();
                                break;
                            case 3 :
                                ds3.timkiem();
                                break;
                            case 4 :
                                ds3.luufile();
                                break;
                            case 5 :
                                ds3.docfile();
                            case 6 :
                                ds3.xoathongtin();
                                break;
                            case 7 :
                                System.exit(0);
                        }
                    }
                    while(chon3 != 0);{
                    System.out.println("Moi ban chon lai");
                }
            }
        }
        while(chon !=0);{
        System.out.println("Moi ban chon lai");
    }
    }
}
