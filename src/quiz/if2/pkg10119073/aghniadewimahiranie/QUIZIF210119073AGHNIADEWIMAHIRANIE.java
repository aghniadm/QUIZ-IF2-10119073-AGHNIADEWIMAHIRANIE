package quiz.if2.pkg10119073.aghniadewimahiranie;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 *
 */
public class QUIZIF210119073AGHNIADEWIMAHIRANIE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ServicePrice service = new ServicePrice();
        Customer cust = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        String name = scan.nextLine();
        System.out.print("Customer Email : ");
        String email = scan.nextLine();
        
        service.displayService();
        int price = scan.nextInt();
        System.out.print("Are you Member (yes/no) : ");
        String member = scan.next();
        
        System.out.println("\n#*************************#");
        System.out.println("#*****CUSTOMER INVOICE*****#");
        cust.currentTime();
        System.out.println("Service Price : ");
        System.out.println("Discount : ");
        System.out.println("Total Pay : ");
    }
    
}
