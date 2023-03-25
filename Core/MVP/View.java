package CalcOOP.Core.MVP;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in); // Считывание данных с терминала

    public double getValue(String title) { // Получение текста
        System.out.printf("%s", title); // Печать текста
        return in.nextInt(); // Число в ответ
    }

    // print(f'{title} = {data}')
    public void print(double data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}