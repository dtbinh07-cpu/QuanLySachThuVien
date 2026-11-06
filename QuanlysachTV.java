import java.util.ArrayList;
import java.util.Scanner;

public class QuanlysachTV {
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

        sc.nextLine(); // bo ky tu xuong dong con thua sau sc.nextInt() o tren

        int n= 0;
        String [] ma = null, ten = null, tacgia = null;
        String [] nam = null;
        double [] dongia = null;
        int [] soLuongSach = null;
        int chon;

        do {
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tính tổng số lượng và giá trị sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("0. Thoát");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: do{
                        System.out.print("Nhap n:");
                        n = Integer.parseInt(sc.nextLine());
                    } while (n <= 0);
                    ma = new String[n]; ten = new String[n]; tacgia = new String[n];
                    dongia = new double[n]; soLuongSach = new int[n]; nam = new String[n];
                    for(int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
                        System.out.print("Nhap ma sach: ");
                        ma[i] = sc.nextLine();
                        System.out.print("Nhap ten sach: ");
                        ten[i] = sc.nextLine();
                        System.out.print("Nhap tac gia: ");
                        tacgia[i] = sc.nextLine();
                        System.out.print("Nhap nam xuat ban: ");
                        nam[i] = sc.nextLine();
                        System.out.print("Nhap don gia: ");
                        dongia[i] = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhap so luong: ");
                        soLuongSach[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    int tongSoLuong = 0; double tongGiaTri = 0;
                    for(int i = 0; i < n; i++) {
                        tongSoLuong += soLuongSach[i];
                        tongGiaTri += dongia[i] * soLuongSach[i];
                    }
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    boolean found = false;
                    for(int i = 0; i < n; i++) {
                        if(ma[i].equals(maCanTim)) {
                            System.out.println("Thong tin sach:");
                            System.out.println("Ma sach: " + ma[i]);
                            System.out.println("Ten sach: " + ten[i]);
                            System.out.println("Tac gia: " + tacgia[i]);
                            System.out.println("Nam xuat ban: " + nam[i]);
                            System.out.println("Don gia: " + dongia[i]);
                            System.out.println("So luong: " + soLuongSach[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Khong tim thay sach voi ma " + maCanTim);
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while(chon != 0);

        tuan6(sc);

        sc.close();
    }

    // ===================== TUAN 6: MANG VA ARRAYLIST =====================
    static void tuan6(Scanner sc) {
        System.out.println();
        System.out.println("TUAN 6");
        bai1(sc);
        bai2(sc);
        bai3va4(sc);
    }

    // Bai 1: mang int[] soLuong cua 5 cuon sach
    static void bai1(Scanner sc) {
        System.out.println();
        System.out.println("--- BAI 1: Mang so luong 5 cuon sach ---");
        int[] soLuong = new int[5];
        for (int i = 0; i < soLuong.length; i++) {
            do {
                System.out.print("Nhap so luong sach thu " + (i + 1) + " (>=0): ");
                soLuong[i] = Integer.parseInt(sc.nextLine());
            } while (soLuong[i] < 0);
        }

        System.out.print("Danh sach so luong: ");
        int tong = 0;
        int max = soLuong[0];
        int viTriMax = 0;
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print(soLuong[i] + " ");
            tong += soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
                viTriMax = i;
            }
        }
        System.out.println();
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max + " (sach thu " + (viTriMax + 1) + ")");
    }

    // Bai 2: ArrayList<String> luu ma sach: them, hien thi, tim, xoa
    static void bai2(Scanner sc) {
        System.out.println();
        System.out.println("--- BAI 2: ArrayList ma sach ---");
        ArrayList<String> dsMa = new ArrayList<>();
        int chon;
        do {
            System.out.println();
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi ma sach");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach can them: ");
                    String maThem = sc.nextLine();
                    if (dsMa.contains(maThem)) {
                        System.out.println("Ma sach da ton tai!");
                    } else {
                        dsMa.add(maThem);
                        System.out.println("Da them ma sach " + maThem);
                    }
                    break;
                case 2:
                    if (dsMa.isEmpty()) {
                        System.out.println("Danh sach rong.");
                    } else {
                        System.out.println("Co " + dsMa.size() + " ma sach:");
                        for (int i = 0; i < dsMa.size(); i++) {
                            System.out.println((i + 1) + ". " + dsMa.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    if (dsMa.contains(maTim)) {
                        System.out.println("Tim thay ma " + maTim + " o vi tri " + (dsMa.indexOf(maTim) + 1));
                    } else {
                        System.out.println("Khong tim thay ma " + maTim);
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (dsMa.remove(maXoa)) {
                        System.out.println("Da xoa ma sach " + maXoa);
                    } else {
                        System.out.println("Khong tim thay ma " + maXoa);
                    }
                    break;
                case 0:
                    System.out.println("Quay lai.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }

    // Bai 3 + Bai 4: ArrayList<String> danhSachSach, moi phan tu la 1 cuon sach
    // Dinh dang phan tu: ma|ten|tacGia|namXuatBan|donGia|soLuong
    static void bai3va4(Scanner sc) {
        System.out.println();
        System.out.println("--- BAI 3 + BAI 4: Quan ly danh sach sach (menu hoan chinh) ---");
        ArrayList<String> danhSachSach = new ArrayList<>();
        int chon;
        do {
            System.out.println();
            System.out.println("===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maThem = sc.nextLine();
                    if (timViTri(danhSachSach, maThem) != -1) {
                        System.out.println("Ma sach da ton tai, khong the them!");
                    } else {
                        danhSachSach.add(nhapThongTin(sc, maThem));
                        System.out.println("Da them sach.");
                    }
                    break;
                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach rong.");
                    } else {
                        System.out.println("Co " + danhSachSach.size() + " cuon sach:");
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println("Sach thu " + (i + 1) + ":");
                            inSach(danhSachSach.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    int viTriTim = timViTri(danhSachSach, sc.nextLine());
                    if (viTriTim == -1) {
                        System.out.println("Khong tim thay sach.");
                    } else {
                        inSach(danhSachSach.get(viTriTim));
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    int viTriXoa = timViTri(danhSachSach, sc.nextLine());
                    if (viTriXoa == -1) {
                        System.out.println("Khong tim thay sach.");
                    } else {
                        danhSachSach.remove(viTriXoa);
                        System.out.println("Da xoa sach.");
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    int viTriSua = timViTri(danhSachSach, maSua);
                    if (viTriSua == -1) {
                        System.out.println("Khong tim thay sach.");
                    } else {
                        System.out.println("Thong tin hien tai:");
                        inSach(danhSachSach.get(viTriSua));
                        System.out.println("Nhap thong tin moi (giu nguyen ma sach):");
                        danhSachSach.set(viTriSua, nhapThongTin(sc, maSua));
                        System.out.println("Da sua sach.");
                    }
                    break;
                case 6:
                    int tongSoLuong = 0;
                    for (String s : danhSachSach) {
                        tongSoLuong += Integer.parseInt(s.split("\\|")[5]);
                    }
                    System.out.println("Tong so luong: " + tongSoLuong);
                    break;
                case 7:
                    double tongGiaTri = 0;
                    for (String s : danhSachSach) {
                        String[] t = s.split("\\|");
                        tongGiaTri += Double.parseDouble(t[4]) * Integer.parseInt(t[5]);
                    }
                    System.out.println("Tong gia tri: " + tongGiaTri);
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }

    // Tra ve vi tri cua sach co ma can tim, khong co thi tra ve -1
    static int timViTri(ArrayList<String> ds, String ma) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).split("\\|")[0].equals(ma)) {
                return i;
            }
        }
        return -1;
    }

    // Nhap thong tin con lai cua sach (co kiem tra hop le), tra ve chuoi "ma|ten|tacGia|nam|donGia|soLuong"
    static String nhapThongTin(Scanner sc, String ma) {
        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        int nam;
        do {
            System.out.print("Nhap nam xuat ban (1900-2026): ");
            nam = Integer.parseInt(sc.nextLine());
        } while (nam < 1900 || nam > 2026);
        double donGia;
        do {
            System.out.print("Nhap don gia (>0): ");
            donGia = Double.parseDouble(sc.nextLine());
        } while (donGia <= 0);
        int soLuong;
        do {
            System.out.print("Nhap so luong (>=0): ");
            soLuong = Integer.parseInt(sc.nextLine());
        } while (soLuong < 0);
        return ma + "|" + ten + "|" + tacGia + "|" + nam + "|" + donGia + "|" + soLuong;
    }

    // In thong tin 1 cuon sach tu chuoi "ma|ten|tacGia|nam|donGia|soLuong"
    static void inSach(String s) {
        String[] t = s.split("\\|");
        System.out.println("  Ma sach: " + t[0]);
        System.out.println("  Ten sach: " + t[1]);
        System.out.println("  Tac gia: " + t[2]);
        System.out.println("  Nam xuat ban: " + t[3]);
        System.out.println("  Don gia: " + t[4]);
        System.out.println("  So luong: " + t[5]);
    }

}