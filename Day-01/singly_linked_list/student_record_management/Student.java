package singly_linked_list.student_record_management;

class StudentNode {
    int rollNumber; // Roll number of the student
    String name; // Name of the student
    int age; // Age of the student
    String grade; // Grade of the student
    StudentNode next; // Pointer to the next node in the list

    // Constructor to initialize a student record
    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}


