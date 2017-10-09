package MikkelSorensen;

public class Args {
    public static void main(String[] args) {

        System.out.println("Skriv de 3 værdier: " + args[0] + args[1] + args[2]);
        double v1 = Double.parseDouble(args[0]);
        double v2 = Double.parseDouble(args[2]);

        double sum = 0;
        String ope = args[1];

        switch (ope) {
            case "+":
                sum = v1 + v2;
                break;

            case "-":
                sum = v1 - v2;
                break;

            case "*":
                sum = v1 * v2;
                break;

            case "/":
                sum = v1 / v2;
                break;
        }
            System.out.println("Resultatet er: " + sum);




        }


        }
    

