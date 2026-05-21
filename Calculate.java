// Калькуляторсошибками
publicclassCalculator{
publicstaticvoidmain(String[]args){
int a =10;
int b =0;
int result = a / b;// Ошибка: делениенаноль!

int[] numbers =newint[5];
numbers[10]=100;// Ошибка: выходзаграницымассива

System.out.println(result);

// Неиспользуемая переменная
Stringunused="Привет";
}

// Слишком длинная функция (запах кода)
publicvoiddoEverything(){
// многостроккода...
}
}
