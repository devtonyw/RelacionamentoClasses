package entidades;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //metodo construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //metodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        }else if(this.peso<=70.3){
            this.categoria = "Leve";
        }else if(this.peso<=80.3){
            this.categoria = "Médio";
        }else if(this.peso<=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }


    //metodos
    public void apresentar(){
        System.out.printf("\nApresentação:\n Lutador: %s\n Origem: %s\n Idade: %d anos\n Altura: %.2f Metros\n Peso: %.2f Kilos\n Ganhou: %d\n Perdeu: %d\n Empatou: %d\n",
                this.getNome(),this.getNacionalidade(), this.getIdade(), this.getAltura(), this.getPeso(), this.getVitorias(),this.getDerrotas(),this.getEmpates());
    }

    public void status(){
        System.out.printf("\nO lutador %s é um peso %s com %d vitorias %d derrotas e %d empates.\n", this.getNome(), this.getCategoria(),this.getVitorias(),this.getDerrotas(),this.getEmpates());
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }


}
