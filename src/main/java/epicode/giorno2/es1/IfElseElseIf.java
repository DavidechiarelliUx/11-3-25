package epicode.giorno2.es1;

public class IfElseElseIf {
    private String str1;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public static void StringaPariDispari(String str1){
        if(str1.length()%2 == 0){
            System.out.println("La stringa è pari");
        }else{
            System.out.println("La Stringa è dispari");
        }
    }
}
