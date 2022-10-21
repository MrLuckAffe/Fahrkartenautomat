import java.util.Scanner;

class automat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        Integer age;
        String sale;
        String plan;
        Integer amount;
        Double result = null;




        System.out.println("bitte gib deinen namen ein");
        name = input.nextLine().toLowerCase();

        System.out.println("Hi " + name + " und willkommen am Fahrkartenautomat");

        System.out.println("wie alt bist du?");
        age = input.nextInt();
        System.out.println(age);

        System.out.println("hast du eine bahnkard y/n");
        sale = input.next().toLowerCase();

        System.out.println("Wähle bitte zwischen Tarif A, B und C");
        plan = input.next();

        System.out.println("wie viele Karten möchtest du?");
        amount = input.nextInt();

        switch (plan) {
            case "a":
                System.out.println("du hast tarif a und " + amount + " karten ausgewählt");

                if (sale.equals("y")) {
                    if (age < 18) {
                        result = (2.50 * (amount - (0.2 * amount) * 0.5));
                    } else {
                        result = (2.50 * (amount - (0.2 * amount)));
                    }
                } else {
                    if (age < 18) {
                        result = ((2.50 * amount) * 0.5);
                    } else {
                        result = (2.50 * amount);
                    }
                }
                System.out.println("dies wird dich " + result + "€ kosten");
                break;

            case "b":
                System.out.println("du hast tarif b und " + amount + " karten ausgewählt");

                break;

            case "c":
                System.out.println("du hast tarif c und " + amount + " karten ausgewählt");

                break;

            default:
                System.out.println("diese option gibt es nicht");
                break;
        }

    }

}