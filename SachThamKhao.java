public class SachThamKhao extends Sach {
    private int ngayNhap;
    private int thangNhap;
    private int namNhap;
    private double donGia;
    private String nhaXuatBan;
    private double thue;

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(String maSach, String tieude, String tacgia, int soluong, int namXuatBan,
                        int ngayNhap, int thangNhap, int namNhap,
                        double donGia, String nhaXuatBan, double thue) {
        super(maSach, tieude, tacgia, soluong, namXuatBan);
        this.ngayNhap = ngayNhap;
        this.thangNhap = thangNhap;
        this.namNhap = namNhap;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
        this.thue = thue;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getThangNhap() {
        return thangNhap;
    }

    public void setThangNhap(int thangNhap) {
        this.thangNhap = thangNhap;
    }

    public int getNamNhap() {
        return namNhap;
    }

    public void setNamNhap(int namNhap) {
        this.namNhap = namNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    // Thành tiền = số lượng * đơn giá + thuế
    public double tinhThanhTien() {
        return getSoLuong() * donGia + thue;
    }

    @Override
    public void hienthiThongTin() {
        super.hienthiThongTin();
        System.out.println("Ngày nhập: " + ngayNhap + "/" + thangNhap + "/" + namNhap);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Thuế: " + thue);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}