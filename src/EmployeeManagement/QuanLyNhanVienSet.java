package EmployeeManagement;

import java.util.HashSet;
import java.util.Set;

public class QuanLyNhanVienSet {
    public static void main(String[] args) {
        Set<NhanVien> danhSachNhanVien = new HashSet<>();

        // Thêm nhân viên
        danhSachNhanVien.add(new NhanVien("NV001", "Nguyen Van A", 5000));
        danhSachNhanVien.add(new NhanVien("NV002", "Tran Thi B", 6000));
        danhSachNhanVien.add(new NhanVien("NV003", "Nguyen Van A", 7000));
        danhSachNhanVien.add(new NhanVien("NV002", "Le Van C", 8000)); // Thao tác này sẽ không có hiệu lực

        System.out.println("Danh sách nhân viên (Set):");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }
}
