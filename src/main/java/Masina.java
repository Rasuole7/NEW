public class Masina extends Transportas {
    private int dureliuSkaicius;

    public Masina (String markė, String modelis, String metai, int dureliuSkaicius){
        super(markė, modelis, metai);
        this.dureliuSkaicius = dureliuSkaicius;
    }

    public int getDureliuSkaicius(){
        return dureliuSkaicius;
    }
}
