public class Arabic {
    private int numberOne;
    private int numberTwo;
    private char symbol;

    public Arabic(String numberOne, String numberTwo, char symbol){
        this.numberOne = Integer.parseInt(numberOne);
        this.numberTwo = Integer.parseInt(numberTwo);
        this.symbol = symbol;
    }

    public void calculation() {
        switch (symbol) {
            case '+':
                System.out.println("Output:\n" + (numberOne + numberTwo));
                return;
            case '-':
                System.out.println("Output:\n" + (numberOne - numberTwo));
                return;
            case '/':
                System.out.println("Output:\n" + (numberOne / numberTwo));
                return;
            case '*':
                System.out.println("Output:\n" + (numberOne * numberTwo));
                return;
                default:
                    return;
        }
    }
}