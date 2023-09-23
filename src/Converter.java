import java.util.*;

public class Converter {
    Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

    //DKK conversion rates
    private static final double DKK_TO_USd = 0.14;
    private static final double DKK_TO_JPY = 21.18;
    private static final double DKK_TO_EUR = 0.13;
    private static final double DKK_TO_GBP = 0.12;

    private static final int USD_TO_DKK = 7;
    private static final double USD_TO_JPY = 148.28;
    private static final double USD_TO_EUR = 0.94;
    private static final double USD_TO_GBP = 0.82;

    private static final double JPY_TO_US = 0.0067;
    private static final double JPY_TO_DKK = 0.47;
    private static final double JPY_TO_EUR = 0.0063;
    private static final double JPY_TO_GBP = 0.0055;

    private static final double EUR_TO_US = 0.14;
    private static final double EUR_TO_JPY = 21.18;
    private static final double EUR_TO_DKK = 0.47;
    private static final double EUR_TO_GBP = 0.12;

    private static final double GBP_TO_US = 0.14;
    private static final double GBP_TO_JPY = 21.18;
    private static final double GBP_TO_EUR = 0.13;
    private static final double GBP_TO_DKK = 0.12;



    public void dkkConverter() {

        double userDKK = 0;
        double userDKKToJPY = 0;
        double userDKKToUSD = 0;
        double userDKKToEUR = 0;
        double userDKKToGBP = 0;

        System.out.println("Please enter hom many DKK you want to convert");
        userDKK = getDoubleInput();

        userDKKToJPY = userDKK * DKK_TO_JPY;
        userDKKToUSD = userDKK * DKK_TO_USd;
        userDKKToEUR = userDKK * DKK_TO_EUR;
        userDKKToGBP = userDKK * DKK_TO_GBP;

        System.out.println("Here is your DKK in EUR, JPY, USD and GBP: \n" +
                "JPY: " + userDKKToJPY + " \n" +
                "USD: " + userDKKToUSD + " \n" +
                "EUR: " + userDKKToEUR + " \n" +
                "GBP: " + userDKKToGBP + " \n");


    }

    public void usdConverter() {

        double userUSD = 0;
        double userUSDToJPY = 0;
        double userUSDToDKK = 0;
        double userUSDToEUR = 0;
        double userUSDToGBP = 0;

        System.out.println("Please enter hom many USD you want to convert");
        userUSD = getDoubleInput();

        userUSDToJPY = userUSD * USD_TO_JPY;
        userUSDToDKK = userUSD * USD_TO_DKK;
        userUSDToEUR = userUSD * USD_TO_EUR;
        userUSDToGBP = userUSD * USD_TO_GBP;

        System.out.println("Here is your USD in EUR, JPY, DKK and GBP: \n" +
                "JPY: " + userUSDToJPY + " \n" +
                "DKK: " + userUSDToDKK + " \n" +
                "EUR: " + userUSDToEUR + " \n" +
                "GBP: " + userUSDToGBP + " \n");


    }

    public void jpyConverter() {

        double userJPY = 0;
        double userJPYToDKK = 0;
        double userJPYToUSD = 0;
        double userJPYToEUR = 0;
        double userJPYToGBP = 0;

        System.out.println("Please enter hom many JPY you want to convert");
        userJPY = getDoubleInput();

        userJPYToDKK = userJPY * JPY_TO_DKK;
        userJPYToUSD = userJPY * JPY_TO_US;
        userJPYToEUR = userJPY * JPY_TO_EUR;
        userJPYToGBP = userJPY * JPY_TO_GBP;

        System.out.println("Here is your JPY in EUR, DKK, USD and GBP: \n" +
                "DKK: " + userJPYToDKK + " \n" +
                "USD: " + userJPYToUSD + " \n" +
                "EUR: " + userJPYToEUR + " \n" +
                "GBP: " + userJPYToGBP + " \n");


    }

    public void eurConverter() {

        double userEUR = 0;
        double userEURToJPY = 0;
        double userEURToUSD = 0;
        double userEURToDKK = 0;
        double userEURToGBP = 0;

        System.out.println("Please enter hom many EUR you want to convert");
        userEUR = getDoubleInput();

        userEURToJPY = userEUR * EUR_TO_JPY;
        userEURToUSD = userEUR * EUR_TO_US;
        userEURToDKK = userEUR * EUR_TO_DKK;
        userEURToGBP = userEUR * EUR_TO_GBP;

        System.out.println("Here is your EUR in DKK, JPY, USD and GBP: \n" +
                "JPY: " + userEURToJPY + " \n" +
                "USD: " + userEURToUSD + " \n" +
                "DKK: " + userEURToDKK + " \n" +
                "GBP: " + userEURToGBP + " \n");


    }

    public void gbpConverter() {

        double userGBP = 0;
        double userGBPToDKK = 0;
        double userGBPToUSD = 0;
        double userGBPToEUR = 0;
        double userGBPToJPY = 0;

        System.out.println("Please enter hom many GBP you want to convert");
        userGBP = getDoubleInput();

        userGBPToJPY = userGBP * GBP_TO_JPY;
        userGBPToUSD = userGBP * GBP_TO_US;
        userGBPToEUR = userGBP * GBP_TO_EUR;
        userGBPToDKK = userGBP * GBP_TO_DKK;

        System.out.println("Here is your GBP in EUR, JPY, USD and DKK: \n" +
                "JPY: " + userGBPToJPY + " \n" +
                "USD: " + userGBPToUSD + " \n" +
                "EUR: " + userGBPToEUR + " \n" +
                "DKK: " + userGBPToDKK + " \n");


    }

    private double getDoubleInput() {
        while(true) {
            try {
                return keyboard.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please type enter a number");
                keyboard.nextLine();
            }
        }
    }
}
