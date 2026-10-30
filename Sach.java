import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;
    private int loaiSach;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getLoaiSach() {
        return loaiSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setLoaiSach(int loaiSach) {
        this.loaiSach = loaiSach;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
    }

    public void hienThi() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
    }

    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 5 / 100;
    }

    public double tinhTongTienNhap() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    public boolean kiemTraHopLe() {
        boolean hopLe = true;

        if (donGia > 0)
            {
                System.out.println("Don gia hop le.");
            }
        else
            {
                System.out.println("Don gia khong hop le (phai > 0).");
                hopLe = false;
            }

        if (soLuong >= 0)
            {
                System.out.println("So luong hop le.");
            }
        else
            {
                System.out.println("So luong khong hop le (phai >= 0).");
                hopLe = false;
            }

        if (namXuatBan >= 1900 && namXuatBan <= 2026)
            {
                System.out.println("Nam xuat ban hop le.");
            }
        else
            {
                System.out.println("Nam xuat ban khong hop le (phai tu 1900 den 2026).");
                hopLe = false;
            }

        return hopLe;
    }

    public void phanLoaiGia() {
        if (donGia < 50000)
            {
                System.out.println("Phan loai gia: Sach gia thap");
            }
        else
            if (donGia <= 100000)
                {
                    System.out.println("Phan loai gia: Sach gia trung binh");
                }
            else
                if (donGia <= 200000)
                    {
                        System.out.println("Phan loai gia: Sach gia cao");
                    }
                else
                    {
                        System.out.println("Phan loai gia: Sach gia dac biet");
                    }
    }

    public void phanLoaiTonKho() {
        if (soLuong == 0)
            {
                System.out.println("Ton kho: Het sach");
            }
        else
            if (soLuong <= 5)
                {
                    System.out.println("Ton kho: Sap het");
                }
            else
                if (soLuong <= 20)
                    {
                        System.out.println("Ton kho: Con it");
                    }
                else
                    {
                        System.out.println("Ton kho: Con nhieu");
                    }
    }

    public void chonLoaiSach(Scanner sc) {
        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon: ");
        loaiSach = sc.nextInt();

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
    }
}