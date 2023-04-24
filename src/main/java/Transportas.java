public class Transportas {
    private String markė;
    private String modelis;
    private String metai;

    public Transportas(String markė,String modelis, String metai){
        this.markė = markė;
        this.modelis = modelis;
        this.metai = metai;
    }

    public String getMarkė(){
        return markė;
    }
    public String getModelis(){
        return modelis;

    }

    public String getMetai(){
        return metai;
    }


}
