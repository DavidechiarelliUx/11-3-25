package epicode.giorno2.es4;

public class For {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void contoAllaRovescia(int num){
        for(int i=num; i>=0; i-- ){
            System.out.println(i);
        }
    }
}
