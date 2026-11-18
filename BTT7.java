import java.time.Year;
import java.util.ArrayList;

// Yêu cầu 1 (tuần 8): tất cả thuộc tính đều private (đóng gói)
class Sach {
    private String maSach;
    private String tieude;
    private String tacgia;
    private int soluong;
    private int namXuatBan;

    public Sach() {
    }

    // Yêu cầu 4 (tuần 8): constructor đầy đủ tham số (gọi setter để dữ liệu luôn được kiểm tra)
    public Sach(String maSach, String tieude, String tacgia, int soluong, int namXuatBan) {
        setMaSach(maSach);
        setTieude(tieude);
        setTacgia(tacgia);
        setSoLuong(soluong);
        setNamXuatBan(namXuatBan);
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieude() { return tieude; }
    public void setTieude(String tieude) { this.tieude = tieude; }

    public String getTacgia() { return tacgia; }
    public void setTacgia(String tacgia) { this.tacgia = tacgia; }

    public int getSoLuong() { return soluong; }
    // Yêu cầu 3 (tuần 8): số lượng không được âm
    public void setSoLuong(int soluong) {
        if (soluong >= 0) {
            this.soluong = soluong;
        } else {
            System.out.println("Số lượng không hợp lệ (phải >= 0): " + soluong);
        }
    }

    public int getNamXuatBan() { return namXuatBan; }
    // Yêu cầu 3 (tuần 8): năm xuất bản phải > 0 và không lớn hơn năm hiện tại
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ (1.." + currentYear + "): " + namXuatBan);
        }
    }

    // Yêu cầu 2 (tuần 7): in ra tất cả thông tin chi tiết của sách
    public void hienthiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieude);
        System.out.println("Tác giả: " + tacgia);
        System.out.println("Số lượng: " + soluong);
        System.out.println("Năm xuất bản: " + namXuatBan);
    }
}

public class BTT7 {
    public static void main(String[] args) {
        System.out.println("################ BÀI TẬP TUẦN 7 ################");
        tuan7();
        System.out.println("\n################ BÀI TẬP TUẦN 8 ################");
        tuan8();
    }

    // ================= TUẦN 7 =================
    static void tuan7() {
        // Yêu cầu 3: tạo đối tượng từ lớp Sach
        Sach s1 = new Sach("S001", "Java Programming", "John Doe", 10, 2020);
        Sach s2 = new Sach("S002", "Python Programming", "Jane Smith", 5, 2019);
        Sach s3 = new Sach("S003", "C++ Programming", "Alice Johnson", 8, 2021);

        System.out.println("Thông tin sách 1:");
        s1.hienthiThongTin();
        System.out.println("\nThông tin sách 2:");
        s2.hienthiThongTin();
        System.out.println("\nThông tin sách 3:");
        s3.hienthiThongTin();

        // Yêu cầu 4: tạo và quản lý danh sách Sach bằng ArrayList
        System.out.println("\n===== QUẢN LÝ DANH SÁCH SÁCH (ArrayList) =====");
        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(s1);
        danhSach.add(s2);
        danhSach.add(s3);
        danhSach.add(new Sach("S004", "Data Structures", "Bob Brown", 12, 2018));

        System.out.println("\n--- Danh sách sách (" + danhSach.size() + " cuốn) ---");
        hienThiDanhSach(danhSach);

        // Tìm kiếm theo mã sách
        System.out.println("\n--- Tìm sách có mã S002 ---");
        Sach timThay = timTheoMa(danhSach, "S002");
        if (timThay != null) {
            timThay.hienthiThongTin();
        } else {
            System.out.println("Không tìm thấy sách.");
        }

        // Xóa sách theo mã
        System.out.println("\n--- Xóa sách có mã S003 ---");
        Sach canXoa = timTheoMa(danhSach, "S003");
        if (canXoa != null) {
            danhSach.remove(canXoa);
            System.out.println("Đã xóa sách S003.");
        } else {
            System.out.println("Không tìm thấy sách để xóa.");
        }

        System.out.println("\n--- Danh sách sau khi xóa (" + danhSach.size() + " cuốn) ---");
        hienThiDanhSach(danhSach);

        // Thống kê tổng số lượng
        int tong = 0;
        for (Sach s : danhSach) {
            tong += s.getSoLuong();
        }
        System.out.println("\nTổng số lượng sách trong thư viện: " + tong);
    }

    static void hienThiDanhSach(ArrayList<Sach> ds) {
        int stt = 1;
        for (Sach s : ds) {
            System.out.println("Sách " + stt++ + ":");
            s.hienthiThongTin();
            System.out.println();
        }
    }

    static Sach timTheoMa(ArrayList<Sach> ds, String ma) {
        for (Sach s : ds) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }

    // ================= TUẦN 8 =================
    static void tuan8() {
        System.out.println("===== Tạo sách bằng constructor đầy đủ tham số =====");
        Sach s1 = new Sach("S001", "Java Programming", "John Doe", 10, 2020);
        s1.hienthiThongTin();

        System.out.println("\n===== Dữ liệu hợp lệ qua setter =====");
        s1.setSoLuong(25);
        s1.setNamXuatBan(2022);
        s1.hienthiThongTin();

        System.out.println("\n===== Dữ liệu không hợp lệ qua setter (giữ nguyên giá trị cũ) =====");
        s1.setSoLuong(-5);
        s1.setNamXuatBan(2999);
        s1.setNamXuatBan(0);
        System.out.println("Số lượng hiện tại: " + s1.getSoLuong());
        System.out.println("Năm xuất bản hiện tại: " + s1.getNamXuatBan());

        System.out.println("\n===== Constructor với dữ liệu sai =====");
        Sach s2 = new Sach("S002", "Python Programming", "Jane Smith", -3, 3000);
        s2.hienthiThongTin();

        System.out.println("\n===== Danh sách sách (ArrayList) dùng getter =====");
        ArrayList<Sach> ds = new ArrayList<>();
        ds.add(s1);
        ds.add(new Sach("S003", "C++ Programming", "Alice Johnson", 8, 2021));
        for (Sach s : ds) {
            System.out.println(s.getMaSach() + " | " + s.getTieude() + " | " + s.getTacgia()
                    + " | SL: " + s.getSoLuong() + " | Năm: " + s.getNamXuatBan());
        }
    }
}