package Interface;

interface AccountBank {
    void updateData();
}

class SavingAccountBank implements AccountBank {
    public void updateData() {
        System.out.println("This is a Bank saving account: ");
    }
}

class CurrentAccountBank implements AccountBank {
    public void updateData() {
        System.out.println("This is a Bank current account: ");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        AccountBank accountno1 = new SavingAccountBank();
        AccountBank accountno2 = new CurrentAccountBank();
        accountno1.updateData();
        accountno2.updateData();
        
    }
    
}
