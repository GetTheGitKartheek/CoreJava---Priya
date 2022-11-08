import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Students {
    public int studentId;
    public String studentName;
    public String registrationNo;
    public double cgpa;
    public String city;
    public String collegeName;  // Initially store as empty
    public String departmentName; // Initially store as empty
    Students(int studentId, String studentName, String registrationNo, double cgpa,  String city,String collegeName,String departmentName) { //constructor
        this.studentId = studentId;
        this.studentName = studentName;
        this.registrationNo = registrationNo;
        this.cgpa = cgpa;
        this.city = city;
        this.collegeName=collegeName;
        this.departmentName=departmentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

class College{
    public String collegeName;
    public String departmentName;
    public int seatCount;
    public double collegeCgpa;

    College(String collegeName,String departmentName,int seatCount,double collegeCgpa){
        this.collegeName=collegeName;
        this.departmentName=departmentName;
        this.seatCount=seatCount;
        this.collegeCgpa=collegeCgpa;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public double getCollegeCgpa() {
        return collegeCgpa;
    }

    public void setCollegeCgpa(double collegeCgpa) {
        this.collegeCgpa = collegeCgpa;
    }
}


public class Student {
    public static void main(String[] args) {
        List<Students> addStudent = new ArrayList<Students>(); // case 1 use
        List<College> addCollege = new ArrayList<College>(); // case 2 use

        //Case 1
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);

        //Case 2
        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);
        Scanner s7 = new Scanner(System.in);
        Scanner s8 = new Scanner(System.in);

        //Case 3
        Scanner s9 = new Scanner(System.in);
        Scanner s10 = new Scanner(System.in);
        Scanner s11 = new Scanner(System.in);

        int ch;
     //   do
        for (int c=0;c<=100;c++)
        {
            System.out.println("****************Engineering Counselling System**********");
            System.out.println("1.Add Student Details: ");
            System.out.println("2.Add College details: ");
            System.out.println("3.Enter Counselling select college: ");
            System.out.println("4 Exit");
            System.out.println("Enter Your Choice:");

            ch = s.nextInt();

            switch (ch) {

                case 1:

                    System.out.print("Enter Student Id :");
                    int studentId = s.nextInt();
                    System.out.print("Enter Student Name : ");
                    String studentName = s1.nextLine();
                    System.out.print("Enter CGPA:");
                    Double cgpa = s2.nextDouble();
                    System.out.println("Enter Registration No:");
                    String registrationNo = s3.nextLine();
                    System.out.println("Enter City:");
                    String city = s4.nextLine();
                    addStudent.add(new Students(studentId, studentName, registrationNo, cgpa, city, "", ""));
                    System.out.println("-----Successfully saved student records----");
                    System.out.println("------------------");
                    System.out.println("---ALL STUDENT RECORD");
                    for (int i = 0; i < addStudent.size(); i++) {
                        System.out.println("Student Id :" + addStudent.get(i).studentId + " Student Name:" + addStudent.get(i).studentName);
                    }

                    break;
                case 2:
                    System.out.println("-----case 2----");
                    System.out.print("Enter College Name : ");
                    String collegeName = s5.nextLine();
                    System.out.print("Enter Department Name : ");
                    String departmentName = s6.nextLine();
                    System.out.print("Enter Seat Count : ");
                    int seatCount = s7.nextInt();
                    System.out.print("Enter College CGPA : ");
                    double collegeCgpa = s8.nextDouble();
                    addCollege.add(new College(collegeName, departmentName, seatCount, collegeCgpa));
                    System.out.println("-----Successfully saved In College records----");
                    System.out.println("---ALL COLLEGE RECORD------");
                    for (int i = 0; i < addCollege.size(); i++) {
                        System.out.println("College Name :" + addCollege.get(i).collegeName + " Department Name:" + addCollege.get(i).departmentName);
                    }
                    break;
                case 3:
                    System.out.println("----Counselling Started----");
                    System.out.print("Enter Student Id :");
                    int studentIds = s9.nextInt();
                    double studentCgpa = 0.0;
                    //Display Student Info
                    for (int i = 0; i < addStudent.size(); i++) {
                        if (studentIds == addStudent.get(i).studentId) {
                            System.out.println("Student Id :" + addStudent.get(i).studentId + " Student Name:" + addStudent.get(i).studentName);
                            studentCgpa = addStudent.get(i).cgpa;
                        } else {
                            System.out.println("----Enter Correct Student Id-----");
                        }

                        System.out.print("Enter College Name :");
                        String collegeNames = s10.nextLine();
                        for (int j = 0; j < addCollege.size(); j++) {
                          //Check College Names
                            if (collegeNames.equalsIgnoreCase(addCollege.get(j).collegeName)) {
                              // Check CGPA Conditions
                                if (studentCgpa >= addCollege.get(j).collegeCgpa) {
                                     // Checking Seat Count
                                    if (addCollege.get(j).seatCount > 0) {
                                        System.out.println("--Department name---" + addCollege.get(j).departmentName + "--Sear Count---" + addCollege.get(i).seatCount);
                                        System.out.print("Enter Department Name :");
                                        String departmentNames = s11.nextLine(); //select department
                                        System.out.println("----Successfully completed counselling-----");
                                     //Decreased Seat count
                                        int decreaseSeatCount = addCollege.get(j).seatCount - 1;
                                       System.out.println("---Now available Seat Count----"+decreaseSeatCount);
                                        int beforeCount =  addCollege.get(j).seatCount;
                                        //update student record

                                        addStudent.add(new Students(addStudent.get(i).studentId, addStudent.get(i).studentName, addStudent.get(i).registrationNo, addStudent.get(i).cgpa, addStudent.get(i).city
                                                , addCollege.get(j).collegeName, addCollege.get(j).departmentName));

                                        //Old Student Record Remove
                                        for (Students stu : addStudent) {
                                            if (stu.studentId==studentIds) {
                                                addStudent.remove(stu);
                                            }
                                        }
                                        System.out.println("---After Finish Counselling Student Records-----");
                                        for (Students display : addStudent){
                                            System.out.println("Student Name:"+display.studentName +" College Name :"+display.collegeName);
                                        }

                                       //update college record
                                        addCollege.add(new College(addCollege.get(j).collegeName, addCollege.get(j).departmentName, decreaseSeatCount, addCollege.get(j).collegeCgpa));

                                        //Old College Remove
                                        for (College col : addCollege) {
                                            if (col.collegeName.equalsIgnoreCase(collegeNames)) {
                                              if(beforeCount==col.seatCount) {
                                                  addCollege.remove(col);
                                              }
                                            }
                                        }
                                        System.out.println("-----After Selecting Seat College Status -----");
                                        for (College clg : addCollege){
                                        System.out.println("----College Name---"+clg.collegeName+"---Seat Count ----"+clg.seatCount);
                                        }

                                    } else {
                                        System.out.println("----No Seat Availabity for this college----");
                                    }
                                } else {
                                    System.out.println("---Not available this college for your cgpa-----");
                                }
                            } else {
                                System.out.println("---Enter Correct College Name-------");
                            }

                        }


                    }


                    break;
                case 4:
                    c=101;
            }
            c++;
        }
    }

}