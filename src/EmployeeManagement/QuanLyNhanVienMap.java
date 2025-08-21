package EmployeeManagement;

import java.util.HashMap;
import java.util.Map;

public class QuanLyNhanVienMap {
    public static void main(String[] args) {
        Map<String, NhanVien> danhSachNhanVien = new HashMap<>();

        // Thêm nhân viên
        danhSachNhanVien.put("NV001", new NhanVien("NV001", "Nguyen Van A", 5000));
        danhSachNhanVien.put("NV002", new NhanVien("NV002", "Tran Thi B", 6000));
        danhSachNhanVien.put("NV003", new NhanVien("NV003", "Nguyen Van A", 7000));
        danhSachNhanVien.put("NV002", new NhanVien("NV002", "Le Van C", 8000)); // Ghi đè nhân viên có mã "NV002"

        System.out.println("Danh sách nhân viên (Map):");
        for(Map.Entry<String, NhanVien> entry : danhSachNhanVien.entrySet()) {
            System.out.println("Mã: " + entry.getKey() + ", Thông tin: " + entry.getValue());
        }

        // Tìm kiếm nhân viên theo mã
        String maCanTim = "NV001";
        if (danhSachNhanVien.containsKey(maCanTim)) {
            System.out.println("\nTìm thấy nhân viên có mã " + maCanTim + ": " + danhSachNhanVien.get(maCanTim));
        } else {
            System.out.println("\nKhông tìm thấy nhân viên có mã " + maCanTim);
        }
    }
}
