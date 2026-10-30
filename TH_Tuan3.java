import java.util.Scanner;

public class TH_Tuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        System.out.println();
        System.out.println("===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        double thanhTien = donGia * soLuong;
        System.out.println("Thanh tien: " + thanhTien);

        double phiVanChuyen = thanhTien * 5 / 100;
        System.out.println("Phi van chuyen (5%): " + phiVanChuyen);

        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("Tong tien nhap: " + tongTienNhap);

        System.out.println("TUAN 4");

        boolean hopLe = true;

        if (donGia > 0) {
            System.out.println("Don gia hop le.");
        } else {
            System.out.println("Don gia khong hop le (phai > 0).");
            hopLe = false;
        }

        if (soLuong >= 0) {
            System.out.println("So luong hop le.");
        } else {
            System.out.println("So luong khong hop le (phai >= 0).");
            hopLe = false;
        }
        if (namXuatBan >= 1900 && namXuatBan <= 2026) {
            System.out.println("Nam xuat ban hop le.");
        } else {
            System.out.println("Nam xuat ban khong hop le (phai tu 1900 den 2026).");
            hopLe = false;
        }

        if (hopLe) {
            System.out.println("=> Sach hop le.");

            if (donGia < 50000) {
                System.out.println("Phan loai gia: Sach gia thap");
            } else if (donGia <= 100000) {
                System.out.println("Phan loai gia: Sach gia trung binh");
            } else if (donGia <= 200000) {
                System.out.println("Phan loai gia: Sach gia cao");
            } else {
                System.out.println("Phan loai gia: Sach gia dac biet");
            }

            if (soLuong == 0) {
                System.out.println("Ton kho: Het sach");
            } else if (soLuong <= 5) {
                System.out.println("Ton kho: Sap het");
            } else if (soLuong <= 20) {
                System.out.println("Ton kho: Con it");
            } else {
                System.out.println("Ton kho: Con nhieu");
            }
        } else {
            System.out.println("=> Sach khong hop le, khong the phan loai gia va ton kho.");
        }

        System.out.println();
        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon: ");
        int loaiSach = sc.nextInt();

        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa");
                break;
            case 2:
                System.out.println("Loai sach: Sach tham khao");
                break;
            case 3:
                System.out.println("Loai sach: Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Loai sach: Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }

        sc.close();
    }
}