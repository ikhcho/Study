package study.java.threadTest;
class Account {
    String accountNo;    // ���¹�ȣ
    String ownerName;    // ������ �̸�
    int balance;         // �ܾ�
    Account(String accountNo, String ownerName, int balance) {   
        this.accountNo = accountNo; 
        this.ownerName = ownerName;  
        this.balance = balance;       
    }
    void  deposit(int amount)  {       
        balance += amount;
    }
    int withdraw(int amount) {
        if (balance < amount)
            return 0;
        balance -= amount;
        return amount;
    }
}
class SharedArea2 {
    Account account1;   // �̸����� ����
    Account account2;   // �������� ����
}

class TransferThread extends Thread {
    SharedArea2 sharedArea;
    TransferThread(SharedArea2 area) {   // ������
        sharedArea = area;
    }
    public void run() {
       for (int cnt = 0; cnt < 12; cnt ++) {
            sharedArea.account1.withdraw(1000000);
            System.out.print("�̸��� ����: 100���� ����,");
            sharedArea.account2.deposit(1000000);
            System.out.println("������ ����: 100���� �Ա�");
        }
    }
}
class PrintThread2 extends Thread {
    SharedArea2 sharedArea;
    PrintThread2(SharedArea2 area) {   // ������
        sharedArea = area;
    }
    public void run() {
       for (int cnt = 0; cnt < 3; cnt ++) {
           int sum = sharedArea.account1.balance +
                     sharedArea.account2.balance;
            System.out.println("���� �ܾ� �հ�: " + sum);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ThreadTest4 {
	public static void main(String[] args) {
        SharedArea2 area = new SharedArea2();
        area.account1 = new Account("111-111-1111", "�̸���", 20000000);
        area.account2 = new Account("222-222-2222", "������", 10000000);
        TransferThread thread1 = new TransferThread(area);
        PrintThread2 thread2 = new PrintThread2(area);
        thread1.start();
        thread2.start();
	
	}
}
