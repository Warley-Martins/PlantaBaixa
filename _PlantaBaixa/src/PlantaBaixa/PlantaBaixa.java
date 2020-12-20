package PlantaBaixa;

import java.util.ArrayList;

public class PlantaBaixa {
    ArrayList<Espaco> bases;

    public PlantaBaixa() {
        this.bases = new ArrayList<Espaco>();
    }
    public ArrayList<Espaco> getBases() {
        return bases;
    }
    public void setBases(Espaco base) {
        this.bases.add(base);
    }
    public float CalculaAreaTotal(){
        float total = 0;
        for(Espaco item : this.bases){
            total += item.calculaArea();
        }
        return total;
    }
}







