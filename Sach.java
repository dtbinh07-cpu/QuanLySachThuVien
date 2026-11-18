public class Sach   {
    private String maSach;
    private String tieude;
    private String tacgia;
    private int soluong;
    private int namXuatBan;
public Sach(){

}

public Sach(String maSach, String tieude, String tacgia, int soluong, int namXuatBan) {
    this.maSach = maSach;
    this.tieude = tieude;
    this.tacgia = tacgia;
    this.soluong = soluong;
    this.namXuatBan = namXuatBan;
}

public String getMaSach() {
    return maSach;
}
public void setMaSach(String maSach) {
    this.maSach = maSach;
}
public String getTieude() {
    return tieude;
}
public void setTieude(String tieude) {
    this.tieude = tieude;
}
public String getTacgia() {
    return tacgia;
}
public void setTacgia(String tacgia) {
    this.tacgia = tacgia;
}
public int getSoLuong() {
    return soluong;
}
public void setSoLuong(int soluong) {
    this.soluong = soluong;
}
public int getNamXuatBan() {
    return namXuatBan;
}
public void setNamXuatBan(int namXuatBan) {
    this.namXuatBan = namXuatBan;
}
public void hienthiThongTin() {
    System.out.println("Mã sách: " + maSach);
    System.out.println("Tiêu đề: " + tieude);
    System.out.println("Tác giả: " + tacgia);
    System.out.println("Số lượng: " + soluong);
    System.out.println("Năm xuất bản: " + namXuatBan);
}
}