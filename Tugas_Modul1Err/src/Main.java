import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String usernameAdmin = "Adnan";
        String passwordAdmin = "Adnan123";

        String[] mahasiswaNIM = { "202310370311001"};

        System.out.println("=== Library System ===");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose Option (1-3): ");
        int option = scanner.nextInt();

        switch (option){
            case 1 :
                System.out.print("Enter your NIM: ");
                String nimKM = scanner.next();

                boolean jikabenar = false;
                for (String nim : mahasiswaNIM){
                    if (nim.equals(nimKM)){
                        jikabenar = true;
                        break;
                    }
                }

                if (jikabenar){
                    System.out.println("Successfull login as Student");
                } else {
                    System.out.println("User Tidak Ditemukan");
                }
                break;

            case 2 :
                System.out.print("Enter your NIM: ");
                String nameAdmin = scanner.next();
                System.out.print("Enter your Password: ");
                String pwAdmin = scanner.next();
                if (nameAdmin.equals(usernameAdmin) && pwAdmin.equals(passwordAdmin)){
                    System.out.println("Successfull login as Admin");
                } else {
                    System.out.println("Admin user not found");
                }
                break;
            case 3 :
                System.out.println("Anda berhasil keluar");

        }
    }
}