public class Main {
    public static void main(String[] args) {

        //Tsikli

        //Zadanie 1

        System.out.println("Zadanie 1");

        for (int i = 1; i <= 10; i++) {

            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {

            System.out.print(" " + i);
        }

        //Zadanie 2
        System.out.println();
        System.out.println("Zadanie 2");



        for (int firstFriday = 3; firstFriday < 32; firstFriday += 7 ) {

            System.out.println("Сегодня пятница " + firstFriday + "-е число");
        }

        //Zadanie 3
        System.out.println();
        System.out.println("Zadanie 3");

        for (int m=0; m<2122; m+=79) {
            if (m>1822 && m<2122)
                System.out.println(m);

        }










    }
}