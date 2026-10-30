import java.util.Scanner;

public class TH_Tuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bài 1
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
        System.out.println("THONG TIN SACH");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // Bài 2: 
        double thanhTien = donGia * soLuong;
        System.out.println("Thanh tien: " + thanhTien);

        //Bài 3: 
        double phiVanChuyen = thanhTien * 5 / 100;
        System.out.println("Phi van chuyen (5%): " + phiVanChuyen);

        //Bài 4:
        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("Tong tien nhap: " + tongTienNhap);

        sc.close();
    }
}