package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) { //я создала вторую ветку в ней и работаю)
    // ДЗ 1.2.

    //Задание 1.
	// целочисленные
        byte b1 = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
    //вещественные
        float f = 1.777_777_7f;
        double d1 = 20.777_777_777_777;
    //символьные
        char c1 = 76;
        char c2 = 'L';
    //логические
        boolean trueOrFalse = c1 == c2;

    //Задание 2.
        System.out.println("Задание 2");
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float commonWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксёров: " + commonWeight + " кг");
        System.out.println("Разница в: " + boxer2 % boxer1 + " кг");

    //Задание 3.
        System.out.println("Задание 3");
        int banana, iceCream, egg, milk;
        float weightOfBreakfast;
        banana = 5;
        milk = 200;
        iceCream = 2;
        egg = 4;
        weightOfBreakfast = (float) ((banana * 80) + (milk * 1.05) + (iceCream * 100) + (egg * 70)) /1000;
        System.out.println("Вес спорт-завтрака: " + weightOfBreakfast + " кг"); //intellij idea сам поставил (float)

    //Задание 4.
        System.out.println("Задание 4");
        float loseWeight1, loseWeight2, neededWeight, dayresult1, dayResult2, averageDayResult;
        loseWeight1 = 250f;
        loseWeight2 = 500f;
        neededWeight = 7f;
        dayresult1 = neededWeight / (loseWeight1/1000);
        dayResult2 = neededWeight / (loseWeight2/1000);
        averageDayResult = (dayresult1+dayResult2)/2;
        System.out.println("Количество дней, при потери веса в 250 грамм ежедневно: " + dayresult1);
        System.out.println("Количество дней, при потери веса в 500 грамм ежедневно: " + dayResult2);
        System.out.println("В среднем это займет: " + averageDayResult + " день");

    //Задание 5.
        System.out.println("Задание 5");
        float salaryOfMary, salaryOfDenis, salaryOfKristina;
        float salaryOfMaryNew, salaryOfDenisNew, salaryOfKristinaNew, differenceSalaryMary, differenceSalaryDenis, differenceSalaryKristina;
        salaryOfMary = 67_760f;
        salaryOfDenis = 83_690f;
        salaryOfKristina = 76_230f;

        salaryOfMaryNew = salaryOfMary+((salaryOfMary/100)*10);
        differenceSalaryMary = (salaryOfMaryNew*12)-(salaryOfMary*12);
        System.out.println("Маша теперь получает " + salaryOfMaryNew + " рублей. Годовой доход вырос на " + differenceSalaryMary + " рублей");

        salaryOfDenisNew = salaryOfDenis+((salaryOfDenis/100)*10);
        differenceSalaryDenis = (salaryOfDenisNew*12)-(salaryOfDenis*12);
        System.out.println("Денис теперь получает " + salaryOfDenisNew + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей");

        salaryOfKristinaNew = salaryOfKristina+((salaryOfKristina/100)*10);
        differenceSalaryKristina = (salaryOfKristinaNew*12)-(salaryOfKristina*12);
        System.out.println("Кристина теперь получает " + salaryOfKristinaNew + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей");

   // дополнительные задания)
   //Задание 6.
        System.out.println("Задание 6.");
        int a = 12, b = 27, c = 44, d = 15, e = 9, result;
        result = a * (b + (c - d * e));
        System.out.println(result * -1);

   //Задание 7.
        System.out.println("Задание 7.");
        int A = 5, B = 7;
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println(A +" " + B);

   //Задание 8.
        System.out.println("Задание 8.");
        int a_ = 786, b_;
        b_ = (a_ / 10) % 10;
        System.out.println(b_);
    }
}
