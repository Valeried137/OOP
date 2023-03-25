package CalcOOP.Client;

import CalcOOP.Core.MVP.Presenter;
import CalcOOP.Core.MVP.View;
import CalcOOP.Core.MVP.Model;

public class Program {
    public static void main (String[] args) {
        Presenter p = new Presenter (new Calc(), new View());
        p.buttonClick();
    }
}