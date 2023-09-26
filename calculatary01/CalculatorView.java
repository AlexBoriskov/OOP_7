package calculatary01;

import java.util.Scanner;

public class CalculatorView {

    /**
     * Выдача результата для пользователя
     * @param realEnter реальная часть комплексного числа
     * @param imaginaryEnter комплексная часть комплексного числа
     */
    public void showResult(double realEnter, double imaginaryEnter){
        System.out.printf("\nРезультат = %.1f + %.1fi", realEnter, imaginaryEnter);
    }

    /**
     * Ввод с терминала реальной части комплексного числа
     * @return реальная часть (int)
     */
    public int enterUserReal(){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\nВведите реальную часть = ");
        int realEnter = iScanner.nextInt();
        return realEnter;
    }

    /**
     * Ввод с терминала комплексной части комплексного числа
     * @return комплексная часть (int)
     */
    public int enterUserImaginary(){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите комплексную часть = ");
        int imaginaryEnter = iScanner.nextInt();
        return imaginaryEnter;
    }

    /**
     * Ввод с терминала номера команды для выполнения последующей операции
     * @return номер операции в меню (int)
     */
    public int enterUserChoose(){
        Scanner iScanner = new Scanner (System.in);
        System.out.print("\nВыберите действие: ");
        int choose = iScanner.nextInt();
        return choose;
    }   
}