package Hafta5.NestedClasses;

public class Employee {

    private String name;
    private String surname;
    private int idNumber;
    private ContactInfo contactInfo;

    public Employee(String name, String surname, int idNumber, int phone, String email) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.contactInfo = new ContactInfo(phone, email);
    }


    static class ContactInfo {
        private int phone;
        private String email;

        public ContactInfo(int phone, String email) {
            this.phone = phone;
            this.email = email;
        }


        public void displayContactInfo (){
            System.out.println("Employee's phone is :  " +phone + "\n" +"E-mail is: " + email);
        }
    }


        public void employeeDisplay (){
            System.out.println("Çalışan: " + name + " " + surname);
            System.out.println("ID Numarası: " + idNumber);
            contactInfo.displayContactInfo();


    }

    public static void main(String[] args) {
        Employee employee = new Employee("Hasan", "Koşan" , 101, 2262626, "hasan@gmail.com");
        employee.employeeDisplay();
    }
}

