public class Main {
    public static void main(String[] args) {
        System.out.println("Let's create a bank app!");

        Bank sbiBankAccount= new SBIBankAccount(1000,"Anita","anita1@");
        sbiBankAccount.addMoney(100);
        Boolean withdrawStatus= sbiBankAccount.withdrawMoney(1300);
        if(Boolean.TRUE.equals(withdrawStatus)){
            System.out.println("successfully withdrawn");
        }
        int balance= sbiBankAccount.checkBalance();

        SBIBankAccount sbiBankAccount2= new SBIBankAccount();
        sbiBankAccount2.setName("Ani");
        sbiBankAccount2.setBalance(1000);
        sbiBankAccount2.setPassword("pass");


    }
}