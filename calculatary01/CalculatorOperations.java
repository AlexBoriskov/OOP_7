package calculatary01;

public class CalculatorOperations {
    
    private double resultReal;
    private double resultImaginary;

    /**
     * Расчет суммы двух комплексных чисел
     * @param real01 реальная часть комплексного числа №1
     * @param imaginary01 комплексная часть комплексного числа №1
     * @param real02 реальная часть комплексного числа №2
     * @param imaginary02 комплексная часть комплексного числа №2
     */
    public void addComplex(int real01, int imaginary01, int real02, int imaginary02){
        resultReal = real01 + real02;
        resultImaginary = imaginary01 + imaginary02;
    }

    /**
     * Расчет разницы двух комплексных чисел
     * @param real01 реальная часть комплексного числа №1
     * @param imaginary01 комплексная часть комплексного числа №1
     * @param real02 реальная часть комплексного числа №2
     * @param imaginary02 комплексная часть комплексного числа №2
     */
    public void substractComplex (int real01, int imaginary01, int real02, int imaginary02){
        resultReal = real01 - real02;
        resultImaginary = imaginary01 - imaginary02;
    }

    /**
     * Расчет умножения двух комплексных чисел
     * @param real01 реальная часть комплексного числа №1
     * @param imaginary01 комплексная часть комплексного числа №1
     * @param real02 реальная часть комплексного числа №2
     * @param imaginary02 комплексная часть комплексного числа №2
     */
    public void multiplyComplex (int real01, int imaginary01, int real02, int imaginary02){
        resultReal = real01*real02 - imaginary01*imaginary02;
        resultImaginary = real01*imaginary02 - imaginary01*real02;
    }

    /**
     * Расчет деления двух комплексных чисел
     * @param real01 реальная часть комплексного числа №1
     * @param imaginary01 комплексная часть комплексного числа №1
     * @param real02 реальная часть комплексного числа №2
     * @param imaginary02 комплексная часть комплексного числа №2
     */
    public void divideComplex (int real01, int imaginary01, int real02, int imaginary02){
        int denominator = real02*real02 + imaginary02*imaginary02;
        resultReal = (real01*real02 + imaginary01*imaginary02) / denominator;
        resultImaginary = (imaginary01*real02 - real01*imaginary02) / denominator; 
    }

    /**
     * Геттер для реальной части комплексного числа
     * @return 
     */
    public double returnResultReal(){
        return resultReal;
    }

    /**
     * Геттер для комплексной части комплексного числа
     * @return
     */
    public double returnResultImaginary(){
        return resultImaginary;
    }
}