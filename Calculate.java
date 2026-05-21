// Калькулятор с обработкой ошибок
public class Calculator {
    public static void main(String[] args) {
        // Исправление 1: деление на ноль
        int a = 10;
        int b = 0;
        int result = 0;
        
        try {
            result = a / b; // Проверка деления на ноль
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно!");
            System.out.println("Попробуйте изменить значение b на ненулевое.");
        }
        
        // Исправление 2: выход за границы массива
        int[] numbers = new int[5];
        try {
            numbers[10] = 100; // Выход за границы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс 10 выходит за границы массива!");
            System.out.println("Размер массива: " + numbers.length + 
                             " (доступные индексы: 0-" + (numbers.length - 1) + ")");
        }
        
        // Исправление 3: удаление неиспользуемой переменной (или использование)
        String greeting = "Привет, мир!";
        System.out.println(greeting);
        
        // Исправление 4: разбиваем длинную функцию на несколько
        Calculator calc = new Calculator();
        calc.showMenu();
        calc.processData();
        calc.saveResults();
    }
    
    // Вместо одной длинной функции разбиваем на небольшие
    public void showMenu() {
        System.out.println("\n=== Калькулятор ===");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("==================");
    }
    
    public void processData() {
        // Пример обработки данных
        int x = 25;
        int y = 5;
        
        System.out.println("\nВычисления:");
        System.out.println("Сложение: " + x + " + " + y + " = " + (x + y));
        System.out.println("Вычитание: " + x + " - " + y + " = " + (x - y));
        System.out.println("Умножение: " + x + " * " + y + " = " + (x * y));
        
        try {
            System.out.println("Деление: " + x + " / " + y + " = " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления: " + e.getMessage());
        }
    }
    
    public void saveResults() {
        // Метод для сохранения результатов
        System.out.println("\nРезультаты сохранены в истории вычислений.");
    }
    
    // Дополнительный метод: безопасный калькулятор
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть нулем!");
        }
        return a / b;
    }
    
    // Дополнительный метод: безопасный доступ к массиву
    public static int getArrayElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Ошибка: Индекс " + index + " вне диапазона [0-" + 
                             (array.length - 1) + "]");
            return 0;
        }
        return array[index];
    }
}
