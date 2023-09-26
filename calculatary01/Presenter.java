package calculatary01;

public class Presenter {
    
    private CalculatorView view;
    private CalculatorOperations operations;
    private ShowMenu show;
    private boolean proverka;

    /**
     * Конструктор для создания Presenter
     * @param view экземпляр CalculatorView
     * @param operations экземпляр CalculatorOperations
     * @param show экземпляр ShowMenu
     */
    public Presenter(CalculatorView view, CalculatorOperations operations, ShowMenu show){
        this.view = view;
        this.operations = operations;
        this.show = show;
        this.proverka = true;
    }

    /**
     * Реализация работы калькулятора комплексных чисел
     */
public void onCalculatorComplex (){
        while (proverka){
            show.showUserMenu();
            switch (view.enterUserChoose()) {
                case 1:
                    operations.addComplex(view.enterUserReal(), view.enterUserImaginary(),
                                                 view.enterUserReal(), view.enterUserImaginary());
                    view.showResult(operations.returnResultReal(), operations.returnResultImaginary());
                    break;
                case 2:
                    operations.substractComplex(view.enterUserReal(), view.enterUserImaginary(),
                                                 view.enterUserReal(), view.enterUserImaginary());
                    view.showResult(operations.returnResultReal(), operations.returnResultImaginary());
                    break;
                case 3:
                    operations.multiplyComplex(view.enterUserReal(), view.enterUserImaginary(),
                                                 view.enterUserReal(), view.enterUserImaginary());
                    view.showResult(operations.returnResultReal(), operations.returnResultImaginary());
                    break;
                case 4:
                    operations.divideComplex(view.enterUserReal(), view.enterUserImaginary(),
                                                 view.enterUserReal(), view.enterUserImaginary());
                    view.showResult(operations.returnResultReal(), operations.returnResultImaginary());
                    break;
                case 5:
                    System.out.println("Выход. До свидания");
                    proverka = false;
                    break;
            }
        }
    }
}