package com.example.DataStructureandAlgorithms;

public class Student {
    // Viết chương trình quản lý sinh viên.
    // Mỗi đối tượng sinh viên có các thuộc tính sau:
    // id, name, age, address và gpa (điểm trung bình).
    // Yêu cầu: tạo ra một menu với các chức năng sau:
    ///****************************************/
    //1. Add student.
    //2. Edit student by id.
    //3. Delete student by id.
    //4. Sort student by gpa.
    //5. Sort student by name.
    //6. Show student.
    //0. Exit.
    ///****************************************/

    private static int idCount = 1;
    private int id;
    private String name;
    private int age;
    private String address;
    private float gpa;

    public Student(String name, int age, String address, float gpa){
        this.id =idCount++;
        this.name=name;
        this.age=age;
        this.address=address;
        this.gpa=gpa;
    }

    //Getter and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ",address=" + address + " gpa=" + gpa + "]";
    }

}
