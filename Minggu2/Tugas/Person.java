
package TugasMinggu2;

/**
 * @fikry
 */

public class Person {
        
    String fName;
    String iName;
    int stuId;
    String stuStatus;
    
    public Person(String fName, String iName, int stuId, String stuStatus){
        this.fName = fName;
        this.iName = iName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    public static void main(String[] args) {
        Person student = new Person("Lisa", "Palombo", 123456789, "Active");
        System.out.println("Student Name : " + student.fName+ " " + student.iName);  
        System.out.println("Student ID : " + student.stuId);
        System.out.println("Student Status : " + student.stuStatus);
    }
}

