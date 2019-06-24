import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();
        kalkulator.start();
    }

    private String numberOne = "";
    private String numberTwo = "";
    private char symbol;
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Input:");
        String input = scanner.next();

        int symbolMatch = 0;

        for (int i = 0; i < input.length(); i++) {
            if (isSymbol(input.charAt(i))){
                if (symbolMatch > 1){
                    return;
                }
                symbolMatch++;
                symbol = input.charAt(i);
                continue;
            }
            if (symbolMatch == 0)numberOne += input.charAt(i);
            else numberTwo += input.charAt(i);
        }

        if (isNumber(numberOne) && isNumber(numberTwo)){
            Arabic arabic =  new Arabic(numberOne, numberTwo, symbol);
            arabic.calculation();
            return;
        }else if (isRomanNumber(numberOne) && isRomanNumber(numberTwo)){
                if (romanToArabic(numberOne) == 0
                        || romanToArabic(numberTwo) == 0){
                    return;
                }else {
                    Roman roman = new Roman(numberOne, numberTwo, symbol);
                    roman.calculation();
                    return;
                }
        }else{
            return;
        }
    }

    public boolean isSymbol(char symbol){
        switch (symbol){
            case '+':
                return true;
            case '-':
                return true;
            case '/':
                return true;
            case '*':
                return true;
                default:
                    return false;
        }
    }

    public int romanToArabic(String romanNumber){
        if (romanNumber.equals("I"))
            return 1;
        if (romanNumber.equals("II"))
            return 2;
        if (romanNumber.equals("III"))
            return 3;
        if (romanNumber.equals("IV"))
            return 4;
        if (romanNumber.equals("V"))
            return 5;
        if (romanNumber.equals("VI"))
            return 6;
        if (romanNumber.equals("VII"))
            return 7;
        if (romanNumber.equals("VIII"))
            return 8;
        if (romanNumber.equals("IX"))
            return 9;
        if (romanNumber.equals("X"))
            return 10;
        return 0;
    }

    public boolean isNumber(String number){
        if (number.equals("1"))
            return true;
        if (number.equals("2"))
            return true;
        if (number.equals("3"))
            return true;
        if (number.equals("4"))
            return true;
        if (number.equals("5"))
            return true;
        if (number.equals("6"))
            return true;
        if (number.equals("7"))
            return true;
        if (number.equals("8"))
            return true;
        if (number.equals("9"))
            return true;
        if (number.equals("10"))
            return true;

        return false;
    }
    
    public boolean isRomanNumber(String number){
        if (number.equals("I"))
            return true;
        if (number.equals("II"))
            return true;
        if (number.equals("III"))
            return true;
        if (number.equals("IV"))
            return true;
        if (number.equals("V"))
            return true;
        if (number.equals("VI"))
            return true;
        if (number.equals("VII"))
            return true;
        if (number.equals("VIII"))
            return true;
        if (number.equals("IX"))
            return true;
        if (number.equals("X"))
            return true;

        return false;
    }

}



