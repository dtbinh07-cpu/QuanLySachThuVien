import java.util.ArrayList;
import java.util.Scanner;

public class BTT9 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SachGiaoKhoa> dsGiaoKhoa = new ArrayList<>();
    static ArrayList<SachThamKhao> dsThamKhao = new ArrayList<>();

    static int docSoNguyen(String thongBao) {
        while (true) {
            try {
                System.out.print(thongBao);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại!");
            }
        }
    }

    static double docSoThuc(String thongBao) {
        while (true) {
            try {
                System.out.print(thongBao);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại!");
            }
        }
    }

    static String docChuoi(String thongBao) {
        System.out.print(thongBao);
        return sc.nextLine().trim();
    }

    // Nhập các thông tin chung của sách
    static SachGiaoKhoa nhapSachGiaoKhoa() {
        String ma = docChuoi("Mã sách: ");
        String tieuDe = docChuoi("Tiêu đề: ");
        String tacGia = docChuoi("Tác giả: ");
        int soLuong = docSoNguyen("Số lượng: ");
        int namXB = docSoNguyen("Năm xuất bản: ");
        System.out.println("Ngày nhập:");
        int ngay = docSoNguyen("  Ngày: ");
        int thang = docSoNguyen("  Tháng: ");
        int nam = docSoNguyen("  Năm: ");
        double donGia = docSoThuc("Đơn giá: ");
        String nxb = docChuoi("Nhà xuất bản: ");
        String tinhTrang;
        while (true) {
            tinhTrang = docChuoi("Tình trạng (moi/cu): ");
            if (tinhTrang.equalsIgnoreCase("moi") || tinhTrang.equalsIgnoreCase("cu")) {
                break;
            }
            System.out.println("Chỉ được nhập 'moi' hoặc 'cu'!");
        }
        return new SachGiaoKhoa(ma, tieuDe, tacGia, soLuong, namXB, ngay, thang, nam, donGia, nxb, tinhTrang);
    }

    static SachThamKhao nhapSachThamKhao() {
        String ma = docChuoi("Mã sách: ");
        String tieuDe = docChuoi("Tiêu đề: ");
        String tacGia = docChuoi("Tác giả: ");
        int soLuong = docSoNguyen("Số lượng: ");
        int namXB = docSoNguyen("Năm xuất bản: ");
        System.out.println("Ngày nhập:");
        int ngay = docSoNguyen("  Ngày: ");
        int thang = docSoNguyen("  Tháng: ");
        int nam = docSoNguyen("  Năm: ");
        double donGia = docSoThuc("Đơn giá: ");
        String nxb = docChuoi("Nhà xuất bản: ");
        double thue = docSoThuc("Thuế: ");
        return new SachThamKhao(ma, tieuDe, tacGia, soLuong, namXB, ngay, thang, nam, donGia, nxb, thue);
    }

    static void nhapDanhSach() {
        int n = docSoNguyen("Nhập số lượng sách giáo khoa: ");
        for (int i = 0; i < n; i++) {
            System.out.println("--- Sách giáo khoa thứ " + (i + 1) + " ---");
            dsGiaoKhoa.add(nhapSachGiaoKhoa());
        }
        int m = docSoNguyen("Nhập số lượng sách tham khảo: ");
        for (int i = 0; i < m; i++) {
            System.out.println("--- Sách tham khảo thứ " + (i + 1) + " ---");
            dsThamKhao.add(nhapSachThamKhao());
        }
    }

    static void xuatDanhSach() {
        System.out.println("===== DANH SÁCH SÁCH GIÁO KHOA =====");
        if (dsGiaoKhoa.isEmpty()) {
            System.out.println("(Trống)");
        }
        for (SachGiaoKhoa s : dsGiaoKhoa) {
            s.hienthiThongTin();
            System.out.println("-----------------------------");
        }
        System.out.println("===== DANH SÁCH SÁCH THAM KHẢO =====");
        if (dsThamKhao.isEmpty()) {
            System.out.println("(Trống)");
        }
        for (SachThamKhao s : dsThamKhao) {
            s.hienthiThongTin();
            System.out.println("-----------------------------");
        }
    }

    static void tinhTongThanhTien() {
        double tongGiaoKhoa = 0;
        for (SachGiaoKhoa s : dsGiaoKhoa) {
            tongGiaoKhoa += s.tinhThanhTien();
        }
        double tongThamKhao = 0;
        for (SachThamKhao s : dsThamKhao) {
            tongThamKhao += s.tinhThanhTien();
        }
        System.out.println("Tổng thành tiền sách giáo khoa: " + tongGiaoKhoa);
        System.out.println("Tổng thành tiền sách tham khảo: " + tongThamKhao);
    }

    static void trungBinhDonGiaThamKhao() {
        if (dsThamKhao.isEmpty()) {
            System.out.println("Chưa có sách tham khảo nào!");
            return;
        }
        double tong = 0;
        for (SachThamKhao s : dsThamKhao) {
            tong += s.getDonGia();
        }
        System.out.println("Trung bình cộng đơn giá sách tham khảo: " + tong / dsThamKhao.size());
    }

    static void xuatGiaoKhoaTheoNXB() {
        String x = docChuoi("Nhập nhà xuất bản cần tìm: ");
        boolean coKetQua = false;
        for (SachGiaoKhoa s : dsGiaoKhoa) {
            if (s.getNhaXuatBan().equalsIgnoreCase(x)) {
                s.hienthiThongTin();
                System.out.println("-----------------------------");
                coKetQua = true;
            }
        }
        if (!coKetQua) {
            System.out.println("Không có sách giáo khoa nào của nhà xuất bản " + x);
        }
    }

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n========== QUẢN LÝ SÁCH THƯ VIỆN ==========");
            System.out.println("1. Nhập danh sách sách");
            System.out.println("2. Xuất danh sách sách");
            System.out.println("3. Tính tổng thành tiền từng loại");
            System.out.println("4. Trung bình cộng đơn giá sách tham khảo");
            System.out.println("5. Xuất sách giáo khoa của nhà xuất bản X");
            System.out.println("0. Thoát");
            chon = docSoNguyen("Chọn chức năng: ");
            switch (chon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    tinhTongThanhTien();
                    break;
                case 4:
                    trungBinhDonGiaThamKhao();
                    break;
                case 5:
                    xuatGiaoKhoaTheoNXB();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}