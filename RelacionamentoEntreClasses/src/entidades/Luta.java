package entidades;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //metodo construtor


    //metodos getter e setter
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    //metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.setAprovado(true);
            this.desafiado = l1;
            this.desafiante = l2;

        }else{
            this.setAprovado(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(getAprovado()){
            System.out.print("\n$$$ Desafiado $$$\n");
            this.desafiado.apresentar();
            System.out.print("\n$$$ Desafiante $$$\n");
            this.desafiante.apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.print("\nEmpatou\n");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                break;

                case 1:
                    System.out.printf(desafiado.getNome());
                    System.out.print(" Ganhou\n");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                break;

                case 2:
                    System.out.printf(desafiante.getNome());
                    System.out.print(" Ganhou\n");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                break;

            }
        }else{
            System.out.print("Luta não pode acontecer.");
        }
    }
}
