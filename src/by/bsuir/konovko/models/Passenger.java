package by.bsuir.konovko.models;

public class Passenger {
    // variables
    private static int base_id = 0;
    private int id;
    private String fio;
    private int age;



    // methods
    public int getId() { return id; }
    public String getFio() { return fio; }
    public int getAge() { return age; }

    public void setFio(String fio) { this.fio = fio; }
    public void setAge(int age) { this.age = age; }

    public Passenger(String fio, int age) {
        base_id++;
        this.id = base_id;
        this.fio = fio;
        this.age = age;
    }

    public void print() {
        System.out.println("----- PASSENGER INFO -----");
        System.out.println(" Id: " + id);
        System.out.println(" FIO: " + fio);
        System.out.println(" Age: " + age);
        System.out.println();
    }

}
