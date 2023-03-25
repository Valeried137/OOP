package CalcOOP.Operations;

public class DivModel {
    public DiviModel() {
        
    }
    // Получить результат суммы
    @Override
    public int result() {
        return x / y;
    }
    // Задать значеник х
    @Override
    public void setX(int value) {
        super.x = value;
    }
    // Задать значение у
    @Override
    public void setY(int value) {
        super.y = value;
    }
}
