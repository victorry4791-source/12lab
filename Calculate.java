// Калькулятор с намеренными ошибками для валидатора
public class Calculator {
    // Ошибка 1: public static void main отсутствует или неправильная сигнатура
    public void main(String[] args) {  // Нет static - ошибка!
        
        // Ошибка 2: деление на ноль (будет RuntimeException)
        int a = 10;
        int b = 0;
        int result = a / b;  // Делим на ноль!
        
        // Ошибка 3: выход за границы массива
        int[] numbers = new int[5];
        numbers[10] = 100;  // Индекс 10 вне диапазона 0-4
        
        // Ошибка 4: переменная не инициализирована перед использованием
        String text;
        System.out.println(text);  // Ошибка компиляции!
        
        // Ошибка 5: сравнение строк через == вместо equals()
        String str1 = "Hello";
        String str2 = new String("Hello");
        if (str1 == str2) {  // Сравнение ссылок, а не содержимого
            System.out.println("Строки равны");
        }
        
        // Ошибка 6: потеря точности при преобразовании
        double pi = 3.14159265359;
        int intPi = pi;  // Ошибка компиляции: потеря точности
        
        // Ошибка 7: бесконечный цикл (нет условия выхода)
        int i = 0;
        while (true) {
            i++;  // Нет break, будет бесконечно!
        }
        
        // Ошибка 8: NullPointerException
        String nullString = null;
        int length = nullString.length();  // NullPointerException!
        
        // Ошибка 9: неиспользуемая переменная и импорт
        String unused = "Не используется";
        
        // Ошибка 10: неверный оператор (присваивание вместо сравнения)
        int x = 5;
        if (x = 10) {  // Должно быть x == 10, но тут присваивание
            System.out.println("x равно 10");
        }
        
        // Ошибка 11: выход из метода с возвращаемым значением
        System.out.println(result);
    }
    
    // Ошибка 12: метод должен возвращать int, но ничего не возвращает
    public int add(int a, int b) {
        // Нет return!
    }
    
    // Ошибка 13: закомментированный код (запах кода)
    public void oldMethod() {
        // int oldValue = 100;
        // String oldLogic = "old";
        // System.out.println(oldLogic);
        // if (oldValue > 50) {
        //     System.out.println("OK");
        // }
        
        // Ошибка 14: дублирование кода
        int val1 = 10;
        int val2 = 20;
        int sum1 = val1 + val2;
        
        int val3 = 30;
        int val4 = 40;
        int sum2 = val3 + val4;  // Та же логика сложения
    }
    
    // Ошибка 15: слишком длинный метод (более 50 строк для примера)
    public void doEverything() {
        System.out.println("Шаг 1");
        System.out.println("Шаг 2");
        System.out.println("Шаг 3");
        System.out.println("Шаг 4");
        System.out.println("Шаг 5");
        // ... много-много строк кода ...
        System.out.println("Шаг 99");
        System.out.println("Шаг 100");
    }
    
    // Ошибка 16: утечка ресурсов (не закрыт Scanner)
    public void readFile() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();  // Scanner не закрыт!
    }
    
    // Ошибка 17: магическое число
    public void calculate() {
        int total = 100 * 24 * 60 * 60;  // 100, 24, 60, 60 - магические числа
    }
    
    // Ошибка 18: пустой catch блок
    public void unsafeMethod() {
        try {
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            // Пустой catch - проглатываем ошибку!
        }
    }
    
    // Ошибка 19: некорректное именование (начинается с цифры)
    public void 123InvalidMethodName() {  // Ошибка компиляции!
        System.out.println("Invalid");
    }
    
    // Ошибка 20: рекурсия без условия выхода
    public void infiniteRecursion() {
        infiniteRecursion();  // StackOverflowError!
    }
}
