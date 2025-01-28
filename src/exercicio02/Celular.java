package exercicio02;

public class Celular {
    String marca;
    String modelo;
    int anoLancamento;
    String cor;
    boolean ligado;
    int carga;
    
    
    
    void ligado(){
        this.ligado = true;
    }
    
    void desligado(){
        this.ligado = false;
    }
    
    void historico(){
        System.out.println("**********FICHA TÉCNICA**********");
        System.out.println("MARCA: "+ this.marca);
        System.out.println("MODELO: "+ this.modelo);
        System.out.println("COR: "+ this.cor);
        System.out.println("ANO DE LANÇAMENTO: "+ this.anoLancamento);
        System.out.println("CARGA BATERIA: "+ this.carga);
        System.out.println("LIGADO: "+ this.ligado);
        System.out.println("**********************************");
        
    }    
        
    void fazerChamada(){
        if(this.ligado == false){
            System.out.println("Não é possível realizar a chamda. Ligue o celular");
        }else if(this.carga <=5){
            System.out.println("Atenção o celular vai desligar, pois a carga está acabando");
        }else{
            System.out.println("Realizando ligação");
        }
    }
}
