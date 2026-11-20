public class SachGiaoKhoa extends Sach {
    private int ngayNhap;
    private int thangNhap;
    private int namNhap;
    private double donGia;
    private String nhaXuatBan;
    private String tinhTrang; // "moi" hoặc "cu"

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, String tieude, String tacgia, int soluong, int namXuatBan,
                        int ngayNhap, int thangNhap, int namNhap,
                        double donGia, String nhaXuatBan, String tinhTrang) {
        super(maSach, tieude, tacgia, soluong, namXuatBan);
        this.ngayNhap = ngayNhap;
        this.thangNhap = thangNhap;
        this.namNhap = namNhap;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
        this.tinhTrang = tinhTrang;
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

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    // Sách mới: thành tiền = số lượng * đơn giá
    // Sách cũ: thành tiền = số lượng * đơn giá * 50%
    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return getSoLuong() * donGia;
        }
        return getSoLuong() * donGia * 0.5;
    }

    @Override
    public void hienthiThongTin() {
        super.hienthiThongTin();
        System.out.println("Ngày nhập: " + ngayNhap + "/" + thangNhap + "/" + namNhap);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Tình trạng: " + tinhTrang);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}