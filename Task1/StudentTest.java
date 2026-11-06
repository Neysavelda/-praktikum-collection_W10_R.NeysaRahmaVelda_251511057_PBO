package Task1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class StudentTest {
    public static void main(String[] args) {
        // BAGIAN 1: ArrayList + Sorting
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(101, "Citra", "Computer Science", "Jl. Melati 1"));
        studentList.add(new Student(102, "Andi", 2, "Jl. Kenanga 2"));       // kode 2 = Mathematics
        studentList.add(new Student(103, "Budi", "Physics", "Jl. Mawar 3"));
        studentList.add(new Student(104, "Dewi", "Computer Science", "Jl. Anggrek 4"));
        studentList.add(new Student(105, "Eka", 1, "Jl. Dahlia 5"));          // kode 1 = Computer Science

        System.out.println("=== Sebelum Sorting ===");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Collections.sort(studentList);

        System.out.println("\n=== Setelah Sorting (Berdasarkan Nama A-Z) ===");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // BAGIAN 2: Vector + Filter Jurusan Computer Science
        Vector<Student> studentVector = new Vector<Student>();
        studentVector.add(new Student(201, "Fajar", "Computer Science", "Jl. Flamboyan 1"));
        studentVector.add(new Student(202, "Gita", "Mathematics", "Jl. Cempaka 2"));
        studentVector.add(new Student(203, "Hadi", "Computer Science", "Jl. Teratai 3"));
        studentVector.add(new Student(204, "Indah", "Physics", "Jl. Seroja 4"));
        studentVector.add(new Student(205, "Joko", "Computer Science", "Jl. Kamboja 5"));

        System.out.println("\n=== Mahasiswa Computer Science (dari Vector) ===");
        for (Student s : studentVector) {
            if (s.getDepartment().equals("Computer Science")) {
                System.out.println(s);
            }
        }
    }
}