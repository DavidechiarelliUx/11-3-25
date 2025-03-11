package epicode.giorno2.es1;

public class AnnoBisestile {

    private int anno;

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void annoBisestile(int anno){
        if((anno%4 == 0 && anno%100 !=0)|| anno%400 == 0) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
