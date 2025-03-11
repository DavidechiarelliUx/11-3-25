package epicode.giorno2;

import epicode.giorno2.es2.Switch;

public class TestaSwitch {
    public static void main (String[] args){
        Switch num1 = new Switch();
        num1.setNum(3);

        num1.stampaNumTra0e3(num1.getNum());
    }
}
