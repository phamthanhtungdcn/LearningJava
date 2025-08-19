package StudentManagement;

public class ColStudent extends Student{
    private double diemDoAn;

    public ColStudent(String studentId, String name, double grade, double diemDoAn) {
        super(studentId, name, grade);
        this.diemDoAn = diemDoAn;
    }

    @Override
    public void showStudent(){
        System.out.println("Mã sinh viên: " + getStudentId());
        System.out.println("Họ tên: " + getName());
        System.out.println("Điểm trung bình: " + getGrade());
        System.out.println("Điểm đồ án: " + diemDoAn);
    }
}
