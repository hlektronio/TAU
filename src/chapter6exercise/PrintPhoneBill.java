package chapter6exercise;

public class PrintPhoneBill {

    public static void main (String args[]){

        PhoneBill bill = new PhoneBill(1,82.45,50,59);
        bill.printBill();

        PhoneBill bill2 = new PhoneBill(1);
        bill2.setMinUsed(1000);
        bill2.printBill();
    }
}
