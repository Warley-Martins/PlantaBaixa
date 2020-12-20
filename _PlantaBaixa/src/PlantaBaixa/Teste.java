package PlantaBaixa;
import java.util.Scanner;
public class Teste {
    static Scanner input = new Scanner(System.in);
    static final int opcaoEncerraPrograma = 0;
    static final int quantidadeFuncionalidadesPrograma = 4;
    public static void main(String[] args) {
        menuApresentacaoPrograma();
        int opcaoFuncionalidadePrograma;
        var plantaBaixa = new PlantaBaixa();
        do{
            do{
                opcaoFuncionalidadePrograma=atribuirInt(menuFuncionalidadesPrograma());
            }while(opcaoFuncionalidadePrograma < opcaoEncerraPrograma
                || opcaoFuncionalidadePrograma > quantidadeFuncionalidadesPrograma);
            switch(opcaoFuncionalidadePrograma){
                case 1 -> plantaBaixa.setBases(instanciarBaseQuadrada());
                case 2 -> plantaBaixa.setBases(instanciarBaseCircular());
                case 3 -> plantaBaixa.setBases(instanciarBaseTriangular());
                case 4 -> calculaAreaTotal(plantaBaixa);
                case 0 -> encerraPrograma();
            }
        }while(opcaoFuncionalidadePrograma != opcaoEncerraPrograma);
    }
    private static void menuApresentacaoPrograma() {
        System.out.println("\tPrograma Planta Baixa"
                         + "\n\tWarley Júnio Martins Vieira"
                         + "\n\tProgramação de Computadores 2");
    }
    private static String menuFuncionalidadesPrograma(){
        return "\nDigite a opção desejada:"
             + "\n(1). Inciciar uma base quadrada        (2). Inciciar uma base circular"
             + "\n(3). Inciciar uma base triangular      (4). Calcular area de um item"
             + "\n(0). Encerrar"
             + "\nopção desejada: ";
    }
    private static Triangular instanciarBaseTriangular() {
        var mensagemAltura = "\nDigite a altura do triangulo: ";
        var mensagemBase = "\nDigite a base do triangulo: ";
        float alturaTriangulo;
        float baseTriangulo;
        Triangular baseTriangular = null;
        do{
            try{
                do{
                    alturaTriangulo = atribuirFloat(mensagemAltura);
                    baseTriangulo = atribuirFloat(mensagemBase);
                }while(alturaTriangulo <= 0 
                    || baseTriangulo <= 0);
                baseTriangular = new Triangular(baseTriangulo, alturaTriangulo);
                return baseTriangular;
            }
            catch(Exception e){
                System.out.println("Exeção lançada: "+e.getMessage());
            }
        }while(true);
    }
    private static Circular instanciarBaseCircular() {
        var mensagemRaio = "\nDigite o raio do circulo: ";
        float raioCirculo;
        Circular baseCircular = null;
        do{
            try{
                do{
                    raioCirculo = atribuirFloat(mensagemRaio);
                }while(raioCirculo <= 0);
                baseCircular = new Circular(raioCirculo);
                return baseCircular;
            }
            catch(Exception e){
                System.out.println("Exeção lançada: "+e.getMessage());
            }
        }while(true);
    }
    private static Quadrada instanciarBaseQuadrada() {
        var mensagemLado = "\nDigite o lado do quadrado: ";
        float ladoQuadrado;
        Quadrada baseQuadrada = null;
        do{
            try{
                do{
                    ladoQuadrado = atribuirFloat(mensagemLado);
                }while(ladoQuadrado <= 0);
                baseQuadrada = new Quadrada(ladoQuadrado);
                return baseQuadrada;
            }
            catch(Exception e){
                System.out.println("Exeção lançada: "+e.getMessage());
            }
        }while(true);
    }
    private static void calculaAreaTotal(PlantaBaixa plantaBaixa) {
        float areaTotal = plantaBaixa.CalculaAreaTotal();;
        System.out.println("\nA area total de todas as bases adicionadas é: "+areaTotal+"u.c.!");
    }   
    private static int atribuirInt(String mensagem) {
        int valorAtribuido;
        do{
            try{
                System.out.print(mensagem);
                valorAtribuido = Integer.parseInt(input.nextLine());
                return valorAtribuido;
            }
            catch(Exception e){
                System.out.println("Exeção lançada: " + e.getMessage());
            }
        }while(true);
    } 
    private static float atribuirFloat(String mensagem) {
        float valorAtribuido;
        do{
            try{
                System.out.print(mensagem);
                valorAtribuido = Integer.parseInt(input.nextLine());
                return valorAtribuido;
            }
            catch(Exception e){
                System.out.println("Exeção lançada: " + e.getMessage());
            }
        }while(true);
    }
    private static void encerraPrograma() {
        System.out.println("\nPrograma Encerrado!\n");
    }
}



























