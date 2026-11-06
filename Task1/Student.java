package Task1;
public class Student implements Comparable<Student> {
    // Attributes private (Enkapsulasi)
    private int studentID;
    private String name;
    private String department;
    private String address;

    // Constructor 1: department berupa String langsung
    public Student(int studentID, String name, String department, String address) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    // Constructor 2: department berupa int (kode angka), lalu dikonversi
    public Student(int studentID, String name, int departmentCode, String address) {
        this.studentID = studentID;
        this.name = name;
        this.department = convertDepartmentCode(departmentCode);
        this.address = address;
    }

    // Method pembantu konversi kode departemen
    private String convertDepartmentCode(int code) {
        switch (code) {
            case 1: return "Computer Science";
            case 2: return "Mathematics";
            case 3: return "Physics";
            default: return "Unknown Department";
        }
    }

    // Getter & Setter
    public int getStudentID() { return studentID; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getAddress() { return address; }

    public void setStudentID(int studentID) { this.studentID = studentID; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setAddress(String address) { this.address = address; }

    // Membandingkan mahasiswa berdasarkan nama untuk Collections.sort()
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student[ID=" + studentID + ", Name=" + name + ", Department=" + department + ", Address=" + address + "]";
    }
}