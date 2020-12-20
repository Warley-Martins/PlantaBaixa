package PlantaBaixa;
public class Circular implements Espaco{
    private float raio;
    private static String nomeForma = "Circulo";
    public Circular(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calculaArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    public static String getNomeForma() {
        return nomeForma;
    }    
}







