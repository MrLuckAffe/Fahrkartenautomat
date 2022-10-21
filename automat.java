import java.util.Scanner;

class automat {
  public static void main(String[] args) {

        System.out.println("Willkommen am Fahrkartenautomat");

        System.out.println("bitte gib deinen namen ein");
        Scanner myname = new Scanner(System.in);
        String name = myname.nextLine();

        System.out.println("wie alt bist du?");
        Scanner myage = new Scanner(System.in);
        Integer age = myage.nextLine();

        System.out.println("hast du eine bahnkard");
        Scanner mysale = new Scanner(System.in);
        String sale = mysale.nextLine();

        System.out.println("Wähle bitte zwischen Tarif A, B und C");
        Scanner myplan = new Scanner(System.in);  
        String plan = myplan.nextLine();  

        System.out.println("wie viele Karten möchtest du?");
        Scanner myamount = new Scanner(System.in);
        Integer amount = myamount.nextLine();
    


  }

}