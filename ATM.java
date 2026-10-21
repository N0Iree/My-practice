import java.util.Scanner;
    public class ATM {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String Pass= "1234";
            Boolean accessGranted = false;
            for (int i = 0; i < 3; i++) 
            {
                System.out.print("Masukan PIN:");
                String pass = sc.nextLine();
            
                if (pass.equals(Pass)) {
                    System.out.println("Akses diberikan.");
                    accessGranted = true;
                    break;
                } else if (i < 2 ) {
                    System.out.println("PIN salah.");
                    accessGranted = false;
                }
                else {
                    System.out.println("Anda telah melebihi jumlah percobaan maksimum. Silakan coba lagi nanti.");
                    accessGranted = false;
                };
        }
        if (!accessGranted) {
            System.out.println("Akses ditolak.");
            return;
        } else {
            System.out.println("Pilih menu.");
            System.out.println("1. Cek saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Masukan pilihan menu: ");
            {
            switch (sc.nextLine()) 
            {
                case "1":
                    System.out.println("Cek saldo.");
                    break;
                case "2":
                    System.out.println("Setor Tunai.");
                    break;
                case "3":
                    System.out.println("Tarik Tunai.");
                    break;
                case "4":
                    System.out.println("Transfer.");
                    break;
                default:
                    System.out.println("keluar.");
                    break;

                }
            }
        }    
    }    
}