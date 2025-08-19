package StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManager = new StudentManagement();
        int choice;

        do{
            System.out.println("\n--- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Cập nhật sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentManager.addStudent(scanner);
                    break;
                    case 2:
                    studentManager.showStudentsInformation();
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    String studentId = scanner.nextLine();
                    Student student = studentManager.findStudentById(studentId);
                    if(student != null){
                        System.out.println("Đã tìm thấy sinh viên:");
                        student.showStudent();
                    } else {
                        System.out.println("Không tìm thấy sinh viên.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String deletedStudentId = scanner.nextLine();
                    studentManager.removeStudent(deletedStudentId);
                    break;
                case 5:
                    System.out.print("Nhập mã sinh viên cần cập nhật: ");
                    String updatedStudentId = scanner.nextLine();
                    studentManager.updateStudent(scanner, updatedStudentId);
                    break;
                case 0:
                    System.out.println("Chuơng trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
