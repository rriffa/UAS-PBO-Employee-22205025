/**
 *
 * @author User
 * Nama : Ma'rifatu Khirzah
 * Nim : 22205025
 * Jurusan : Teknik Informatika
 */
package uas.pbo.employee.pkg22205025;

abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void work();
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Memimpin tim");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Membuat aplikasi");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Membuat desain");
    }
}

class EmployeeMain {

    public static void main(String[] args) {
        Manager manajer = new Manager("Zalfa");
        Developer pengembang = new Developer("Jane Doe");
        Designer desainer = new Designer("John Smith");

        manajer.work();
        pengembang.work();
        desainer.work();
    }
}
