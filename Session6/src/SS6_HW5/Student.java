package SS6_HW5;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private int phone;
    public Student(){
        //Constructor rong
    }

    public Student(String studentId, String studentName, int age, boolean gender, String address, int phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    //Phương thức nhập thông tin sinh viên
    public void inputData(Scanner scanner){
        System.out.println("Nhập mã SV ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập tên SV ");
        this.studentName= scanner.nextLine();
        System.out.println("Nhập tuổi SV ");
        this.age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính SV ");
        this.gender= Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập địa chỉ SV ");
        this.address= scanner.nextLine();
        System.out.println("Nhập số điện thoại SV ");
        this.phone= Integer.parseInt(scanner.nextLine());
    }
    public void displayData(){
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi SV: %d - Giới tính: %s - Địa chỉ: %s - Điện thoại: %d\n",
                this.studentId, this.studentName, this.age, (this.gender?"Nam":"Nữ"), this.address, this.phone;
    }

}
