public class Assignment2_3 
{

    private static final double convRatio = 2.2;

    public static void main(String[] args) throws Exception 
    {

        double[] kilo = {1, 3, 5, 7, 9, 11, 13, 15};
        //double[] pound = new double[kilo.length];
        

        System.out.println("This program will display the conversion of kilograms to pounds on odd numbers up to 15.");

        System.out.println("\t\tkilograms\tpounds");
        System.out.println("\t\t---------\t------");

        for(int i = 0; i < kilo.length; i++)
        {
            System.out.println("\t\t" + String.format("%.0f",kilo[i]) + "\t\t" + String.format("%.02f", (kilo[i] * convRatio)));
        }

        System.out.println("\n\nGoodbye...");

        System.exit(0);

    }

}