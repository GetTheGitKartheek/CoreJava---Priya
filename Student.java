import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Students {
    public String studentName;
    public int registrationNo;
    public double cgpa;
    public String city;
    public String collegeName;  // Initially store as empty
    public String departmentName; // Initially store as empty
    Students(String studentName, int registrationNo, double cgpa,  String city,String collegeName,String departmentName) { //constructor
        this.studentName = studentName;
        this.registrationNo = registrationNo;
        this.cgpa = cgpa;
        this.city = city;
        this.collegeName=collegeName;
        this.departmentName=departmentName;
    }



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
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
    public String collegeCode;
    public String collegeName;
    public String departmentName;
    public int seatCount;
    public double collegeCgpa;

    College(String collegeCode,String collegeName,String departmentName,int seatCount,double collegeCgpa){
        this.collegeCode=collegeCode;
        this.collegeName=collegeName;
        this.departmentName=departmentName;
        this.seatCount=seatCount;
        this.collegeCgpa=collegeCgpa;
    }

    public String getCollegeCode() { return collegeCode; }

    public void setCollegeCode(String collegeCode) { this.collegeCode = collegeCode; }

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
        addCollege.add(new College("123","CEG", "Mech", 10, 9.5));
        addCollege.add(new College("456","MIT", "Civil", 10, 8));
        addCollege.add(new College("789","RMK", "ECE", 10, 8));
        addCollege.add(new College("112","SSN", "EEE", 10, 7));
        addCollege.add(new College("113","Saveetha", "CSE", 10, 7));


        //Case 1
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);
        Scanner s7 = new Scanner(System.in);
        Scanner s8 = new Scanner(System.in);
        Scanner s9= new Scanner(System.in);
        Scanner s10 = new Scanner(System.in);
        Scanner s11 = new Scanner(System.in);





        int ch;
        //   doing
        for (int c=0;c<=100;c++)
        {
            System.out.println("****************Engineering Counselling System**********");
            System.out.println("1.Add Student Details: ");
            System.out.println("2.Display Student Details: ");
            System.out.println("3.Display College Details: ");
            System.out.println("4.Enter Counselling select college: ");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice:");

            ch = s.nextInt();

            switch (ch) {

                case 1:

                    System.out.print("Enter Registration No:");
                    int registrationNo = s.nextInt();
                    System.out.println("Enter Student Name : ");
                    String studentName = s1.nextLine();
                    System.out.println("Enter CGPA:");
                    Double cgpa = s2.nextDouble();
                    System.out.println("Enter City:");
                    String city = s3.nextLine();
                    addStudent.add(new Students(studentName, registrationNo, cgpa, city, "", ""));
                    System.out.println("-----Successfully saved student records----");

                    break;
                case 2:

                    System.out.println("---DISPLAY STUDENT DETAILS------");
                    for (int i = 0; i < addStudent.size(); i++) {
                        System.out.println("Student Reg No :"+addStudent.get(i).registrationNo+ "Student Name:" + addStudent.get(i).studentName +" CGPA : "+addStudent.get(i).cgpa+" City : "+addStudent.get(i).city+" College name : "+addStudent.get(i).collegeName +" Department Name : "+addStudent.get(i).departmentName);
                    }
                    break;
                case 3:
                      /*  System.out.println("-----case 2----");
                        System.out.println("Enter College Code : ");
                        String collegeCode = s4.nextLine();
                        System.out.println("Enter College Name : ");
                        String collegeName = s5.nextLine();
                        System.out.println("Enter Department Name : ");
                        String departmentName = s6.nextLine();
                        System.out.println("Enter Seat Count : ");
                        int seatCount = s7.nextInt();
                        System.out.println("Enter College CGPA : ");
                        double collegeCgpa = s8.nextDouble();
                        addCollege.add(new College(collegeCode,collegeName, departmentName, seatCount, collegeCgpa));
                        System.out.println("-----Successfully saved In College records----");*/
                    System.out.println("---DISPLAY COLLEGE DETAILS------");
                    for (int i = 0; i < addCollege.size(); i++) {
                        System.out.println("College Code : "+addCollege.get(i).collegeCode + " College Name :" + addCollege.get(i).collegeName + " Department Name:" + addCollege.get(i).departmentName+" Seat Count :"+addCollege.get(i).seatCount+" College CGPA : "+addCollege.get(i).collegeCgpa);
                    }
                    break;
                case 4:
                    System.out.print("Enter Student Registration No :");
                    int regNo = s11.nextInt();
                    double studentCgpa = 0.0;
                    //Display Student Info
                    for (int i = 0; i < addStudent.size(); i++) {
                        if (regNo==addStudent.get(i).registrationNo) {
                            System.out.println("Student Reg No :" + addStudent.get(i).registrationNo + " Student Name:" + addStudent.get(i).studentName +" Student CGPA : "+ addStudent.get(i).cgpa);
                            studentCgpa = addStudent.get(i).cgpa;
                        } else {
                            System.out.println("----Enter Correct Student Registration No-----");
                        }

                        System.out.println("----Available College List for this Student : ");
                        for (int k = 0; k < addCollege.size(); k++) {
                            if (studentCgpa >= addCollege.get(k).collegeCgpa) {
                                if (addCollege.get(k).seatCount > 0) {
                                    System.out.println("College Code :"+addCollege.get(k).collegeCode +" College Name :"+addCollege.get(k).collegeName+" Department Name :"+addCollege.get(k).departmentName+" Available Seat Count :"+addCollege.get(k).seatCount);
                                }
                            }
                        }


                        System.out.print("Enter College Name :");
                        String collegeNames = s9.nextLine();
                        int cEnd=0;
                        for (int j = 0; j < addCollege.size(); j++) {

                            //Check College Names

                            if (collegeNames.trim().equalsIgnoreCase(addCollege.get(j).collegeName.trim())) {

                                // Check CGPA Conditions

                                if (studentCgpa >= addCollege.get(j).collegeCgpa) {
                                    // Checking Seat Count
                                    if (addCollege.get(j).seatCount > 0 && cEnd==0) {

                                        System.out.println("--Department name---" + addCollege.get(j).departmentName + "--Sear Count---" + addCollege.get(i).seatCount);
                                        System.out.print("Enter Department Name :");
                                        String departmentNames = s10.nextLine(); //select department
                                        System.out.println("----Successfully completed counselling-----");
                                        //Decreased Seat count
                                        int decreaseSeatCount = addCollege.get(j).seatCount - 1;
                                        System.out.println("---Now available Seat Count----"+decreaseSeatCount);
                                        int beforeCount =  addCollege.get(j).seatCount;
                                        //update student record

                                        addStudent.add(new Students(addStudent.get(i).studentName, addStudent.get(i).registrationNo, addStudent.get(i).cgpa, addStudent.get(i).city
                                                , addCollege.get(j).collegeName, addCollege.get(j).departmentName));

                                        //Old Student Record Remove
                                        for (Students stu : addStudent) {
                                            if (stu.registrationNo==regNo) {
                                                addStudent.remove(stu);
                                            }
                                        }
                                        System.out.println("---After Finish Counselling Student Records-----");
                                        for (Students display : addStudent){
                                            System.out.println("Student Name:"+display.studentName +" College Name :"+display.collegeName);
                                        }

                                        //update college record
                                        addCollege.add(new College(addCollege.get(j).collegeCode,addCollege.get(j).collegeName, addCollege.get(j).departmentName, decreaseSeatCount, addCollege.get(j).collegeCgpa));

                                        //Old College Remove
                                          /*  for (College col : addCollege) {
                                                if (col.collegeName.trim().equalsIgnoreCase(collegeNames.trim())) {
                                                    if(beforeCount==col.seatCount) {
                                                        addCollege.remove(col);
                                                    }
                                                }
                                            }*/

                                        for (int z = 0; z < addCollege.size(); z++) {
                                            if (collegeNames.trim().equalsIgnoreCase(addCollege.get(z).collegeName.trim())) {
                                                if(beforeCount==addCollege.get(z).seatCount){
                                                    addCollege.remove(addCollege.get(z));
                                                }
                                            }
                                        }

                                        System.out.println("-----After Selecting Seat College Status -----");
                                        for (College clg : addCollege){
                                            System.out.println("College Name : "+clg.collegeName+" Seat Count : "+clg.seatCount);
                                        }
                                        cEnd=1;


                                    } else {
                                        System.out.println("----No Seat Availabity for this college----");
                                    }
                                } else {
                                    System.out.println("---Not available this college for your cgpa-----");
                                }
                            } else {
                                //System.out.println("---Enter Correct College Name-------");
                            }

                        }


                    }


                    break;
                case 5:
                    c=101;
            }
            c++;
        }
    }

}
