package Odevler.WageCalculator;

public class Employee {

        //değişkenleri tanımlıyoruz

        public String name;
        public Integer salary;
        public Integer workHours;
        public Integer hireYear;





        //constructorları atıyoruz
    public Employee(String name, Integer salary, Integer workHours, Integer hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        //vergi 1000 lira altına 0 değilse %3
        public double tax () {
            if (salary <= 1000) {
                return 0;
            } else {
                return salary * 0.03;
            }

        }

        //bonus hesaplaması
        public double bonus () {
            int extraHours= workHours-40;
            if (extraHours > 0) {

                return extraHours * 30;
            } else {
                return  0;
            }
        }



    //maaş artışı hesaplaması
        public double raiseSalary () {
            int currentYear = 2021;
            int workingYears = currentYear - hireYear;
            if (workingYears < 10) {
                return salary * 0.05;

            } else if (workingYears <= 20) {
                return salary * 0.1;
            } else {
                return salary * 0.15;
            }

        }

    @Override
    public String toString() {
        double totalSalary = salary-tax()+raiseSalary()+bonus();
        return "----ÇALIŞAN BİLGİLERİ ------ \n" +
                "İsim= " + name + '\n' +
                "Maaş= " + salary + "\n" +
                "Çalışma saati= " + workHours  + "\n"+

                "İşe giriş tarihi= " + hireYear + "\n" +
                "Vergi= " + tax() + "\n"+
                "Bonus= " + bonus() + "\n" +
                "Maaş Artışı= " +raiseSalary() +"\n" +
                "Toplam Maaş= " + totalSalary;
    }
}



