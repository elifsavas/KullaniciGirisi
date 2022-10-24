import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, choose, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();

        System.out.print("Şifreniz:");
        password = input.nextLine();

        if (userName.equals("Elif SAVAŞ") && password.equals("elif123")) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Hatalı Giriş Yaptınız!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("Evet\nHayır");

            System.out.print("Seçiminiz:");
            choose = input.nextLine();

            if (choose.equals("Evet")) {
                System.out.print("Yeni Şifreniz:");
                newPassword = input.nextLine();

                if (newPassword.equals(password)) {
                    System.out.println("Eski bir şifre seçemezsiniz. Lütfen yeniden deneyiniz!!");
                } else {
                    System.out.println("Şifreniz değiştirilmiştir!");
                }
            } else {
                System.out.println("Giriş Yapmadan Devam Et!");
            }
        }

    }




      


}
