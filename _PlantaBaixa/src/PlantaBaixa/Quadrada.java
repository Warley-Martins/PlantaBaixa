package PlantaBaixa;

public class Quadrada implements Espaco{
    private float lado;
    private static String nomeForma = "Quadrado";
    public Quadrada(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float calculaArea() {
        return (this.lado * this.lado);
    }
    
    public static String getNomeForma() {
        return nomeForma;
    }
}







