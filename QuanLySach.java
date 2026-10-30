import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sach s = new Sach();
        s.nhap(sc);

        System.out.println();
        System.out.println("THONG TIN SACH");
        s.hienThi();
        System.out.println("Thanh tien: " + s.tinhThanhTien());
        System.out.println("Phi van chuyen (5%): " + s.tinhPhiVanChuyen());
        System.out.println("Tong tien nhap: " + s.tinhTongTienNhap());

        System.out.println("TUAN 4");

        if (s.kiemTraHopLe())
            {
                System.out.println("=> Sach hop le.");
                s.phanLoaiGia();
                s.phanLoaiTonKho();
            }
        else
            {
                System.out.println("=> Sach khong hop le, khong the phan loai gia va ton kho.");
            }

        System.out.println();
        s.chonLoaiSach(sc);

        sc.close();
    }
}