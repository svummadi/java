package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor -- prompt user to enter name and year
        public Student (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();


        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();


        System.out.println("1 - freshmen\n2 - sophomore\n3 - junior\n4 - senior\n Enter student's grade level: ");
        this.gradeYear = in.nextInt();

        setStudentId();

        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

    }

    // generate an ID

    private void setStudentId() {
            id++;
        // grade level plus id
        this.studentId = gradeYear + "" + id;

    }

    // enroll in course

    public void enroll(){
            //get inside a loop
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            }
            else {
                break;
            }
        } while(1!=0);

        //System.out.println("ENROLLED IN: " + courses);
        //System.out.println("TUITION BALANCE: " + tuitionBalance);


        }


    //view balance

    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition

    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }



    // show status

    public String toString(){
       return "Name: " + firstName + " " + lastName +
               "\nGrade Level: " + gradeYear +
               "\nStudent ID: " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;

    }










    // pay tuition










}
