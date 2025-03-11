package epicode.giorno2.es3;

public class StringaVirgola {
    private String stringa;

    public String getStringa() {
        return stringa;
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }

    public void CaratteriSeparatiDaVirgola(String stringa){
        StringBuilder stringaConVirgola = new StringBuilder();
        int i =0;
        while (i < stringa.length()) {
            stringaConVirgola.append(stringa.charAt(i));
            if (i < stringa.length() - 1) {
                stringaConVirgola.append(",");
            }
            i++;
        }

        stringa = stringaConVirgola.toString();
        System.out.println(stringa);
    }
}
