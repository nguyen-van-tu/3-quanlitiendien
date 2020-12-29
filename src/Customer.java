import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String name;
    private int numHome;
    private int Id;

    public Customer() {
    }

    public Customer(String name, int numHome, int id) {
        this.name = name;
        this.numHome = numHome;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumHome() {
        return numHome;
    }

    public void setNumHome(int numHome) {
        this.numHome = numHome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numHome=" + numHome +
                ", Id=" + Id +
                '}';
    }

    ArrayList<Customer> customerArrayList = new ArrayList<>();

//    public void addCustomer() {
//        Scanner sc = new Scanner(System.in);
//        Customer customer = new Customer();
//        Receipt receipt = new Receipt();
//        System.out.println("Nhập tên ");
//        customer.setName(sc.nextLine());
//        System.out.println("Nhập số nhà");
//        customer.setNumHome(Integer.parseInt(sc.nextLine()));
//        System.out.println("Nhập id công tơ");
//        customer.setId(Integer.parseInt(sc.nextLine()));
//        System.out.println("Nhập chỉ số mới");
//        receipt.setOldIndex(Integer.parseInt(sc.nextLine()));
//        System.out.println("Nhập chỉ số cũ");
//        receipt.setNewIndex(Integer.parseInt(sc.nextLine()));
//        customerArrayList.add(customer);
//    }
//
//    public void showCustomer() {
//        for (Customer c : customerArrayList) {
//            System.out.println(c.toString());
//        }
//    }
//
//    public Customer money(int id) {
//
//        for (Customer c : customerArrayList) {
//            if (id == getId()) {
//                return c;
//            }
//        }
//        return null;
//    }

}
