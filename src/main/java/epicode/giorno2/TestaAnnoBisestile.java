package epicode.giorno2;

import epicode.giorno2.es1.AnnoBisestile;

public class TestaAnnoBisestile {
    public static void main(String[] args){
        AnnoBisestile anno1 = new AnnoBisestile();

        anno1.setAnno(2025);

        anno1.annoBisestile(anno1.getAnno());
    }
}
