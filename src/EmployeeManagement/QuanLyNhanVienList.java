package EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVienList {
    public static void main(String[] args) {
        List<NhanVien> danhSachNhanVien = new ArrayList<>();

        // Thêm nhân viên
        danhSachNhanVien.add(new NhanVien("NV001", "Nguyen Van A", 5000));
        danhSachNhanVien.add(new NhanVien("NV002", "Tran Thi B", 6000));
        danhSachNhanVien.add(new NhanVien("NV003", "Nguyen Van A", 7000)); // Ví dụ trùng tên
        danhSachNhanVien.add(new NhanVien("NV002", "Le Van C", 8000)); // Ví dụ trùng mã

        System.out.println("Danh sách nhân viên (List):");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }

        // Truy cập theo index
        System.out.println("\nNhân viên ở vị trí 1: " + danhSachNhanVien.get(1));
    }
}
