package ro.btrl.miswsclient.mobileacademy.threads;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[30];
        for (int i = 0; i < 30; i++) {
            employees[i] = new Employee(i);
                employees[i].start();
        }
    }
}
