
import java.util.ArrayList;
import java.util.Scanner;

public class DataCustomer {
    private ArrayList<Receipt> receipts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addCustomer() {
        Customer customer = new Customer();
        System.out.println("Nhập tên ");
        String name = sc.nextLine();
        customer.setName(name);
        System.out.println("Nhập số nhà");
        int sn = Integer.parseInt(sc.nextLine());
        customer.setNumHome(sn);
        System.out.println("Nhập id công tơ");
        int id = Integer.parseInt(sc.nextLine());
        customer.setId(id);
        System.out.println("Nhập chỉ số mới");
        int old = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chỉ số cũ");
        int news = Integer.parseInt(sc.nextLine());
        Receipt receipt = new Receipt(customer,old,news);
        receipts.add(receipt);
    }

    public void searchPrice() {
        System.out.println("Nhap ID cong to");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("số tiền điện là ");
        Receipt.totalMoney(ID, receipts);
        System.out.println("VNĐ");
    }

    public void showReceipt() {
        for (int i = 0; i < receipts.size(); i++) {
            System.out.println(  receipts.get(i).getCustomer().toString() );
            System.out.println("Chỉ số mới, " + receipts.get(i).getNewIndex() + " Chỉ số cũ " + receipts.get(i).getOldIndex());
        }
    }

}