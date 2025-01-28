package exercicio02;

public class Principal {
    public static void main(String[] args) {
        Celular cell = new Celular();
        cell.marca = "Samsung";
        cell.modelo = "S24 Ultra";
        cell.anoLancamento = 2024;
        cell.ligado = false;
        cell.carga = 7;
        cell.cor = "Titanium";
        
        cell.fazerChamada();
        cell.historico();
    }
}
