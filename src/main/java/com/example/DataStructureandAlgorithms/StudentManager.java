package com.example.DataStructureandAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students;
    private static final Scanner scanner = new Scanner(System.in);

    public StudentManager(){
        students = new ArrayList<>();
    }

    //Thêm sv
    public void addStudent(Student student){
        students.add(student);
    }

    //Hiển thị danh sách
    public void displayAllStudent(){
        for(Student student:students){
            System.out.println(student);
        }
    }

    //Tìm sv theo ID
    public Student findStudentById(int id){
        for(Student student: students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }


    public void inputStudent() {
        System.out.println("Nhập vào tên sinh viên");
        String name = scanner.nextLine();

        System.out.println("Nhập vào tuổi");
        int age = scanner.nextInt();

        // Loại bỏ ký tự xuống dòng sau khi nhập tuổi
        scanner.nextLine();

        System.out.println("Nhập vào địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập vào điểm GPA");
        float gpa = scanner.nextFloat();

        //Tạo đối tượng Student
        Student student = new Student(name,age,address,gpa);
        addStudent(student);

        System.out.println("Thêm thành công");
    }

    public void editStudentById(int id){
        Student student = findStudentById(id);

        if(student == null) {
            System.out.println("Không tìm thấy sinh viên với ID : "+id);
            return;
        }

        //Hiển thị thông tin sinh viên theo id
        System.out.println("Thông tin sinh viên hiện tại.");
        System.out.println(student);

        //Cập nhật thông tin
        System.out.println("Nhập tên mới (Nhập '-' để bỏ qua):  ");
        String newName = scanner.nextLine();
        if(!newName.equals("-")){
            student.setName(newName);
        }

        System.out.println("Nhập tuổi mới (Nhập '-' để bỏ qua):  ");
        String newAgeStr = scanner.nextLine();
        if(!newAgeStr.equals("-")){
            int newAge = Integer.parseInt(newAgeStr);
            student.setAge(newAge);
        }

        System.out.println("Nhập địa chỉ mới (Nhập '-' để bỏ qua):  ");
        String newAddress = scanner.nextLine();
        if(!newAddress.equals("-")){
            student.setAddress(newAddress);
        }

        System.out.println("Nhập điểm GPA mới (Nhập '-' để bỏ qua): ");
        String newGpaStr = scanner.nextLine();
        if(!newGpaStr.equals("-")){
            float newGpa = Float.parseFloat(newGpaStr);
            student.setGpa(newGpa);
        }

        System.out.println("Cập nhật sinh viên thành công!");
    }

    public void deleteStudentById(int id){
        Student student = findStudentById(id);
        if(student == null) {
            System.out.println("Không tìm thấy sinh viên với ID : "+id);
            return;
        }
        //Hiển thị thông tin sinh viên theo id
        System.out.println("Thông tin sinh viên hiện tại.");
        System.out.println(student);
        System.out.println("Xác nhận xóa sinh viên này : ('YES' or 'NO')");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("YES")) {
            students.remove(student);
            System.out.println("Đã xóa sinh viên với ID: " + id);
        }
    }

    public Student findStudentWithhightestGPA(){
       if(students.isEmpty()){
           System.out.println("Danh sách sinh viên rỗng");
           return null;
       }

       Student topStudent = students.get(0);

       for(Student student : students){
           if(student.getGpa()> topStudent.getGpa()){
               topStudent = student;
           }
       }

       return topStudent;
    }

    public void sortStudentByGPA(){
        students.sort((s1,s2)->Double.compare(s2.getGpa(),s1.getGpa()));
        displayAllStudent();
    }

    public List<Student> findStudentsByGPARange(double minGPA, double maxGPA){
        return students.stream()
                .filter(student -> student.getGpa()>= minGPA && student.getGpa()<=maxGPA)
                .collect(Collectors.toList());
    }

    public void displayTopStudentByGPA() {
        Student topStudent = findStudentWithhightestGPA();
        if (topStudent != null) {
            System.out.println("Sinh viên có GPA cao nhất:");
            System.out.println(topStudent);
        }
    }
    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getName));
        displayAllStudent(); // Hiển thị danh sách đã sắp xếp
    }



    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        String choice;
        do {
            System.out.println("Chọn thao tác: ");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên theo id");
            System.out.println("3. Xóa sinh viên theo id");
            System.out.println("4. Lọc sinh viên theo GPA");
            System.out.println("5. Lọc sinh viên theo tên");
            System.out.println("6. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    manager.inputStudent(); // Nhập thông tin sinh viên
                    break;
                case "2":
                    System.out.println("Nhập thông tin ID sinh viên cần sửa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    manager.editStudentById(id);
                    break;
                case "3":
                    System.out.println("Nhập ID sinh viên cần xóa: ");
                    int idRemove = scanner.nextInt();
                    scanner.nextLine();
                    manager.deleteStudentById(idRemove);
                    break;
                case "4":
                    System.out.println("Danh sách sinh viên lọc theo GPA");
                    manager.sortStudentByGPA();
                    break;
                case "5":
                    System.out.println("Danh sách sinh viên lọc theo tên");
                    manager.sortStudentsByName();
                    break;
                case "6":
                    System.out.println("Danh sách sinh viên");
                    manager.displayAllStudent();
                    break;
                case "0":
                    System.out.println("Thoát chương trình.");
                    break;
            }

        } while (!choice.equals("0"));
    }
}
