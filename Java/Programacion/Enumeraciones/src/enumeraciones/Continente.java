package enumeraciones;

public enum Continente {
    AFRICA(53),
    EUROPA(2),
    ASIA(2),
    AMERICA(2),
    OCEANIA(2);
    //Proporcionando atributos
    private final int paises;
    
    //creamos constructor y get
    Continente(int paises){
        this.paises=paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
}
