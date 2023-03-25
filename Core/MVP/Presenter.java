package CalcOOP.Core.MVP;

import CalcOOP.Operations.SumModel;

public class Presenter {
    // Абстарктные
    View view; 
    Model model;

    // Конкретные
    public Presenter(SumModel sumModel, Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        // Пользователь нажимает кнопки во Вью
        double a = view.getValue("Введите первое число: ");
        double b = view.getValue("Введите второе число: ");
        // Презентер обрабатывает данные и передает их в Модел
        model.setX(a);
        model.setY(b);
        double result = model.result();
        // Модел возвращает результат, Презентр перадает его во Вью
        view.print(result, "Результат: ");
    }
}
