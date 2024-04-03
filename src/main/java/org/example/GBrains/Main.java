package org.example.GBrains;

/**
 * Основной класс приложения
 */
public class Main {
    /**
     * Основной метод запуска. В нем используются экземпляры других классов.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Экземпляр класса, который дает два числа.
         */
        NumbersPool numbersPool = new NumbersPool();
        /**
         * Экземпляр класса, который дает метод суммирования
         */
        OperationsPool operationsPool = new OperationsPool();
        System.out.println(operationsPool.sumNumbers(numbersPool.numOne,
                numbersPool.numTwo));
    }
}