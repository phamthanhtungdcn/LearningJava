package StudentManager;

public class UniStudent extends Student{
    private double diemLuanVan;

    public UniStudent(String studentId, String name, double grade, double diemLuanVan) {
        super(studentId, name, grade);
        this.diemLuanVan = diemLuanVan;
    }

    @Override
    public void showStudent(){
        System.out.println("Mã sinh viên: " + getStudentId());
        System.out.println("Họ tên: " + getName());
        System.out.println("Điểm trung bình: " + getGrade());
        System.out.println("Điểm luận văn: " + diemLuanVan);
    }
}
