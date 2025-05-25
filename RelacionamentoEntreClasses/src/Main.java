import entidades.Luta;
import entidades.Lutador;

public class Main {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];

        l[0] = new Lutador("Poatan", "Brasil", 23, 1.69f, 69.0f, 10, 2, 3);
        l[1] = new Lutador("Brasizs", "Alemanha", 32, 1.76f, 74.3f, 12, 3, 1);
        l[2] = new Lutador("Brs", "Australia", 30, 1.72f, 83.1f, 11, 2, 1);
        l[3] = new Lutador("Jon", "França", 24, 1.80f, 92.0f, 12, 5, 2);
        l[4] = new Lutador("Jove", "Alemanha", 25, 1.76f, 78.0f, 15, 3, 1);
        l[5] = new Lutador("Bron", "Brasil", 30, 1.90f, 100.0f, 17, 7, 6);

        l[3].ganharLuta();
        l[3].perderLuta();
        l[3].apresentar();

        Luta briga = new Luta();
        briga.marcarLuta(l[2],l[3]);
        briga.lutar();

        l[2].status();
        l[3].status();

        //Continuar com informações que quiser

    }
}
