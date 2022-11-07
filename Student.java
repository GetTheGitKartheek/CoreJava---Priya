import java.util.*;



class Students {
    public int id;
    public String studentName;
    public String registrationNo;
    public double cgpa;
    public String city;
    public String gender;

    public static int count = 0;


    public Students(int id,String registrationNo,String studentName,double cgpa,String city,String gender )
    {
        super();
        this.id = id;
        this.studentName = studentName;
        this.gender = gender;
        this.registrationNo = registrationNo;
        this.cgpa = cgpa;
        this.city = city;
        count++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Students.count = count;
    }

}

//college add
class Colleges {
    public int id;
    public String collegeName;
    public String locationOfTheCollege;

    public static int count = 0;

    public Colleges(int id, String collegeName, String locationOfTheCollege) {
        super();
        this.id = id;
        this.collegeName = collegeName;
        this.locationOfTheCollege = locationOfTheCollege;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocationOfTheCollege() {
        return locationOfTheCollege;
    }

    public void setLocationOfTheCollege(String locationOfTheCollege) {
        this.locationOfTheCollege = locationOfTheCollege;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Colleges.count = count;
    }


}
// Depart
class Departments {
    public String mechDepartment;
    public int mechDeptSeatCount;
    public double mechCgpa;
    public String civilDepartment;
    public int civilDeptSeatCount;
    public double civilCgpa;
    public String electricalDepartment;
    public int electricalDeptSeatCount;
    public double electricalCgpa;
    public String itDepartment;
    public int itDeptSeatCount;

    public double itCgpa;


    public static int count = 0;

    public Departments(String mechDepartment, int mechDeptSeatCount, double mechCgpa, String civilDepartment, int civilDeptSeatCount, double civilCgpa, String electricalDepartment, int electricalDeptSeatCount, double electricalCgpa, String itDepartment, int itDeptSeatCount, double itCgpa) {
        super();
        this.mechDepartment = mechDepartment;
        this.mechDeptSeatCount = mechDeptSeatCount;
        this.mechCgpa = mechCgpa;
        this.civilDepartment = civilDepartment;
        this.civilCgpa = civilCgpa;
        this.electricalCgpa = electricalCgpa;
        this.itCgpa = itCgpa;
        this.civilDeptSeatCount = civilDeptSeatCount;
        this.electricalDepartment = electricalDepartment;
        this.electricalDeptSeatCount = electricalDeptSeatCount;
        this.itDepartment = itDepartment;
        this.itDeptSeatCount = itDeptSeatCount;

        count++;

    }

    public String getMechDepartment() {
        return mechDepartment;
    }

    public void setMechDepartment(String mechDepartment) {
        this.mechDepartment = mechDepartment;
    }

    public int getMechDeptSeatCount() {
        return mechDeptSeatCount;
    }

    public void setMechDeptSeatCount(int mechDeptSeatCount) {
        this.mechDeptSeatCount = mechDeptSeatCount;
    }

    public double getMechCgpa() {
        return mechCgpa;
    }

    public void setMechCgpa(double mechCgpa) {
        this.mechCgpa = mechCgpa;
    }

    public String getCivilDepartment() {
        return civilDepartment;
    }

    public void setCivilDepartment(String civilDepartment) {
        this.civilDepartment = civilDepartment;
    }

    public int getCivilDeptSeatCount() {
        return civilDeptSeatCount;
    }

    public void setCivilDeptSeatCount(int civilDeptSeatCount) {
        this.civilDeptSeatCount = civilDeptSeatCount;
    }

    public double getCivilCgpa() {
        return civilCgpa;
    }

    public void setCivilCgpa(double civilCgpa) {
        this.civilCgpa = civilCgpa;
    }

    public String getElectricalDepartment() {
        return electricalDepartment;
    }

    public void setElectricalDepartment(String electricalDepartment) {
        this.electricalDepartment = electricalDepartment;
    }

    public int getElectricalDeptSeatCount() {
        return electricalDeptSeatCount;
    }

    public void setElectricalDeptSeatCount(int electricalDeptSeatCount) {
        this.electricalDeptSeatCount = electricalDeptSeatCount;
    }

    public double getElectricalCgpa() {
        return electricalCgpa;
    }

    public void setElectricalCgpa(double electricalCgpa) {
        this.electricalCgpa = electricalCgpa;
    }

    public String getItDepartment() {
        return itDepartment;
    }

    public void setItDepartment(String itDepartment) {
        this.itDepartment = itDepartment;
    }

    public int getItDeptSeatCount() {
        return itDeptSeatCount;
    }

    public void setItDeptSeatCount(int itDeptSeatCount) {
        this.itDeptSeatCount = itDeptSeatCount;
    }

    public double getItCgpa() {
        return itCgpa;
    }

    public void setItCgpa(double itCgpa) {
        this.itCgpa = itCgpa;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Departments.count = count;
    }
}
public class Student {
    public static void main(String[] args) throws Exception {
        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students(1, "123456", "Saravana", 9.7, "Chennai", "M"));
        studentList.add(new Students(2, "234567", "Sireesha", 8.0, "Mumbai", "F"));
        studentList.add(new Students(3, "345678", "Kartheek", 5.9, "Hyderabad", "M"));
        studentList.add(new Students(4, "456789", "Swetha", 7.8, "Chennai", "F"));

        for (Students s : studentList) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("ID, studentName, cgpa, city,gender : ");
            System.out.println(s.getId() + " " + s.getRegistrationNo() + " " + s.getStudentName() + " " + s.getCgpa() + " " + s.getCity() + " " + s.getGender());
        }



            List<Colleges> collegeList = new ArrayList<>();
            collegeList.add(new Colleges(1, "RMK College Of Engineering", "Ponneri"));
            collegeList.add(new Colleges(2, "Anna University CUG", "Guindy"));
            collegeList.add(new Colleges(3, "Saveetha Engineering College", "Poonthamalli"));
            for (Colleges s : collegeList) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
            {
                System.out.print("ID, collegeName, locationOfTheCollege: ");
                System.out.println(s.getId() + " " + s.getCollegeName() + " " + s.getLocationOfTheCollege());
            }

        List<Departments>departmentList = new ArrayList<>();
        departmentList.add(new Departments("Mechanical",20,9,"Civil",20,8,"Electrical",15,7,"Information Technology",25,5));

        //for loop new code
        for (Departments s : departmentList) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("mechDepartment, mechDeptSeatCount,mechCgpa,civilDepartment,civilDeptSeatCount,civilCgpa,electricalDepartment,electricalDeptSeatCount,electricalCgpa, itDepartment,itDeptSeatCount,itCgpa : ");
            System.out.println(s.getMechDepartment() + " " + s.getMechDeptSeatCount() + " " + s.getMechCgpa()+" " + s.getCivilDepartment()+" " + s.getCivilDeptSeatCount() +" "+ s.getCivilCgpa()+" " + s.getElectricalDepartment()+" "+s.getElectricalDeptSeatCount()+" "+s.getElectricalCgpa()+" "+ s.getItDepartment()+" "+s.getItDeptSeatCount()+ " " +s.getItCgpa());
        }

        //Order by cgpa student list
        List<Double> studentCgpaOnlyList = new ArrayList<>();
        List<Students> studentCgpaList = new ArrayList<>();

        for (Students s : studentList) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            studentCgpaOnlyList.add(s.getCgpa());
        }
        Collections.sort(studentCgpaOnlyList);

        for (Students s : studentCgpaList) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            studentCgpaList.add(new Students(s.getId(), s.getRegistrationNo(), s.getStudentName(), s.getCgpa(), s.getCity(), s.getGender()));
        }

        //Enter Student for loop
        for (int i=0;i<studentCgpaList.size();i++){
            System.out.println("Student Name..."+studentCgpaList.get(i).getStudentName()+"..CGPA..."+studentCgpaList.get(i).getCgpa());

            Scanner sc1= new Scanner(System.in);
            System.out.print("Select a College Name: ");


        }

    }
}
