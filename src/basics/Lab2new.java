package basics;

public class Lab2new {



public static void main(String[] args) {

// Create a Student

Student stu1= new Student("Abhishek" , "123456");

stu1.enroll("Math251");

stu1.enroll("English234");

stu1.enroll("History211");

stu1.showCourses();

stu1.checkBalance();

stu1.payTution(100);

stu1.checkBalance();

System.out.println(stu1.toString());



}



}



class Student{

//Properties

private static int iD=100;



private String userId;

private String name;

private String SSN;

private String email;

private String phone;

private String city;

private String state;

public String courses="";

public static final int costOfCourses=800;

private int balance=0;

public Student(String Name, String ssn) {

iD++;

this.name=Name;

this.SSN=ssn;

setEmail();

setUserId();

}

public String getPhone() {

return phone;

}



public void setPhone(String phone) {

this.phone = phone;

}



public String getCity() {

return city;

}



public void setCity(String city) {

this.city = city;

}



public String getState() {

return state;

}



public void setState(String state) {

this.state = state;

}

private void setEmail() {

email= name.toLowerCase()+ "."+iD+"@srmuniversity.com";

System.out.println("Your email :" + email);

}

public String getEmail() {

return email;

}

public void setUserId() {

int max=9000;

int min=1000;

int randNum=(int) (Math.random()*(max-min));

System.out.println(randNum);

userId=iD+ randNum +SSN.substring(5);

System.out.println("Your ID:" + userId);

}

public String getUserId() {

return userId;

}

public void enroll(String course) {

this.courses = this.courses + " " +course;

//System.out.println(courses);

balance=balance +costOfCourses;

}

public void payTution(int amount) {

balance= balance-amount;

System.out.println("Amount paid: " +amount);

}

public void checkBalance() {

System.out.println("Balance: $" +balance);

}

public void showCourses(){

System.out.println(courses);

}

public String toString() {

return "[Name : " + name + "]\n" +"[Courses :" + courses + "]\n" +"[Balance: " + balance + "]\n";

}

}

