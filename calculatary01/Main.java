package calculatary01;

public class Main {
    
    public static void main(String[] args) {
        
        Presenter presenter = new Presenter(new CalculatorView(), 
                            new CalculatorOperations(), new ShowMenu());

        presenter.onCalculatorComplex();
    }
}