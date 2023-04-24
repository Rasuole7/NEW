public class SportineMasina extends Masina {
    private int didziausiasGreitis;

    public SportineMasina (String markė,String modelis, String metai, int dureliuSkaicius, int didziausiasGreitis){
        super (markė, modelis, metai, dureliuSkaicius);
            this.didziausiasGreitis = didziausiasGreitis;
    }

    public int getDidziausiasGreitis(){
        return didziausiasGreitis;
    }

    public static void main(String[] args){
        SportineMasina masina = new SportineMasina("Volkswagen", "Golf","2023",5, 300);
        System.out.println("Pirksiu automobilį, kurio markė yra: " + masina.getMarkė() + ", o modelis: " + masina.getModelis() +
                "." + " Automobilis " + masina.getMetai() + " metų" + ", greitis: " + masina.getDidziausiasGreitis());
    }


}
