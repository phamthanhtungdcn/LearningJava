package StudentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    // 1.Add new Student
    public void addStudent(Scanner scanner) {
        System.out.print("Bạn muốn thêm sinh viên đại học hay cao đẳng, 1 - Đại học, 2 - Cao đẳng: ");
        int studentType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        String maSV = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = Double.parseDouble(scanner.nextLine());

        Student student;
        double grade;
        if(studentType == 1){
            System.out.print("Nhập điểm luận văn: ");
            grade = Double.parseDouble(scanner.nextLine());
            student = new UniStudent(maSV, hoTen, diemTB, grade);
        } else {
            System.out.print("Nhập điểm đồ án: ");
            grade = Double.parseDouble(scanner.nextLine());
            student = new ColStudent(maSV, hoTen, diemTB, grade);
        }

        students.add(student);
        System.out.println("Đã thêm sinh viên thành công!");
    }

    // 2.Show Student infomation
    public void showStudentsInformation() {
        if(students.isEmpty()){
            System.out.println("Danh sách rỗng.");
            return;
        }
        System.out.println("--- DANH SÁCH SINH VIÊN ---");
        for(Student student : students){
            student.showStudent();
            System.out.println("---------------------------");
        }
    }

    // 3.Find Student by student id
    public Student findStudentById(String studentId) {
        for(Student student : students){
            if(student.getStudentId().equals(studentId)){
                return student;
            }
        }

        return null;
    }

    // 4.Remove Student
    public void removeStudent(String studentId) {
        Student student = findStudentById(studentId);
        if(student != null){
            students.remove(student);
            System.out.println("Đã xóa sinh viên có mã " + studentId + " thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + studentId);
        }

    }

    // 5.Update Student information
    public void updateStudent(Scanner scanner, String studentId){
        Student student = findStudentById(studentId);
        if(student != null){
            System.out.print("Nhập tên mới: ");
            String newName = scanner.nextLine();
            student.setName(newName);

            System.out.print("Nhập điểm trung bình mới: ");
            double newGrade = Double.parseDouble(scanner.nextLine());
            student.setGrade(newGrade);

            System.out.println("Đã cập nhật thông tin sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + studentId);
        }
    }
}
