import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir Ay Giriniz: ");
        month = input.nextInt();
        System.out.print("Lütfen Bir Gün Giriniz: ");
        day = input.nextInt();

        if ((month > 0) && (month <= 12)) {
            if (month == 1) {
                if ((day > 0) && (day <= 31)) {
                    if (day <= 22) {
                        burc = "Oğlak Burcu";
                    } else {
                        burc = "Kova Burcu";
                    }
                    System.out.println("Burcunuz: " + burc);
                } else {
                    isError = true;
                }

            } else if (month == 2) {
                if ((day > 0) && (day <= 29)) {
                    if (day <= 19) {
                        burc = "Kova Burcu";
                    } else {
                        burc = "Balık Burcu";
                    }
                    System.out.println("Burcunuz: " + burc);
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if ((day > 0) && (day <= 31)) {
                    if (day <= 20) {
                        burc = "Balık Burcu";
                    } else {
                        burc = "Koç Burcu";
                    }
                    System.out.println("Burcunuz: " + burc);
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if ((day > 0) && (day <= 30)) {
                    if (day <= 20) {
                        burc = "Koç Burcu";
                    } else {
                        burc = "Boğa Burcu";
                    }
                    System.out.println("Burcunuz: " + burc);
                } else {
                    isError = true;

                }

            } else if (month == 5) {
                if ((day > 0) && (day <= 31)) {
                    if (day <= 21) {
                        burc = "Boğa Burcu";
                    } else {
                        burc = "İkizler Burcu";
                    }
                    System.out.println("Burcunuz: " + burc);
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if ((day > 0) && (day <= 30)){
                    if (day <= 22){
                        burc = "İkizler Burcu";
                    }else {
                        burc = "Yengeç Burcu";
                    }System.out.println("Burcunuz: " + burc);
                }else {
                    isError = true;
                }
            } else if (month == 7) {
                if ((day > 0) && ( day <= 31)){
                    if (day <= 22){
                        burc = "Yengeç Burcu";
                    }else {
                        burc = "Aslan Burcu";
                    }System.out.println("Burcunuz: " + burc);
                }else {
                    isError = true;
                }
            } else if (month == 8) {
                if ((day > 0) && (day <= 31)){
                    if (day <= 22){
                        burc = "Aslan Burcu";
                    }else {
                        burc = "Başak Burcu";
                    }System.out.println("Burcunuz: " + burc);
                }else {
                    isError = true;
                }
            } else if (month == 9) {
                if ((day > 0) && (day <= 30)){
                    if (day <= 22){
                        burc = "Başak Burcu";
                    }else {
                        burc = "Terazi Burcu";
                    }System.out.println("Burcunuz: " + burc);
                }else {
                    isError = true;
                }
            } else if (month == 10) {
                if ((day > 0 ) && (day <= 31)){
                    if (day < 22){
                        burc = "Terazi Burcu";
                    }else {
                        burc = "Akrep Burcu";
                    }System.out.println("Burcunuz: " + burc);
                }else {
                    isError = true;
                }
            } else if (month == 11) {
                if ((day > 0) && (day <= 30)){
                    if (day <= 21){
                        burc = "Akrep Burcu";
                    }else {
                        burc = "Yay Burcu";
                    }System.out.println("Burcunuz: " + burc);
                }else {
                    isError = true;
                }
            } else if (month == 12) {
                if ((day > 0) && (day <= 31)){
                    if (day < 21){
                        burc = "Yay Burcu";
                    }else {
                        burc = "Oğlak Burcu";
                    }System.out.println("Burcunuz: " + burc);
                }else {
                    isError = true;
                }
            }if (isError == true){
                System.out.println("Hatalı Gün  Girişi Yaptınız!!! ");
            }
        }
        else {

            System.out.println("Hatalı Bir Ay  Girişi Yaptınız!!! ");
        }
    }
}