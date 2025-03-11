package epicode.giorno2.es2;

public class Switch {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void stampaNumTra0e3(int num){
        switch(num){
            case (0):
                System.out.println("zero");
                break;
            case(1):
                System.out.println("uno");
                break;
            case (2):
                System.out.println("due");
                break;
            case (3):
                System.out.println("tre");
                break;
            default :
                System.out.println("Inserisci un numero da uno a tre");
        }
    }
}
