package ro.btrl.miswsclient.mobileacademy;

import java.io.*;

public class Employee implements Serializable {
    private String name;
    private transient Integer no;

    public Employee() {
    }

    public Employee(String name, Integer no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return name + no;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = new Employee("Marius",10);
        ObjectOutputStream os = null;
        try {
            os = new ObjectOutputStream(new FileOutputStream("out.bin"));
            os.writeObject(emp);
            System.out.println("Succesfull writing");
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("out.bin"));
        System.out.println("Succesfull reading");
        emp = (Employee) is.readObject();

        System.out.println(emp);
    }
}
