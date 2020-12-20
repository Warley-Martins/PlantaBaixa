package PlantaBaixa;
public class Triangular implements Espaco{
    private float base;
    private float altura;
    private static String nomeForma = "Triangulo";

    public Triangular(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public static String getNomeForma() {
        return nomeForma;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calculaArea() {
        return (this.base * this.altura)/2;
    }
       
}



