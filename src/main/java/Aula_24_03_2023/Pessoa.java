package Aula_24_03_2023;
/**
 * @author rafael.fgoulart1
 * @author vinicius.soliveira63
 */
public class Pessoa {
    public int diaHoje = 24;
    public int mesHoje = 3;
    public int anoHoje = 2023;
    
    private String nome;
    private double idade;
    private int dia;
    private int mes;
    private int anoNasc;

    public Pessoa(String nome, double idade, int dia, int mes, int anoNasc) {
        this.nome = nome;
        this.idade = idade;
        this.dia = dia;
        this.mes = mes;
        this.anoNasc = anoNasc;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public double calculaIdade(int dia, int mes, int ano) {
        double calc = (dia / 365) + (mes / 12) + ano;
        double X = calc() - calc;
        
        return X;
    }
    
    public double calc() {
        double calc = (diaHoje / 365) + (mesHoje / 12) + anoHoje;
        return calc;
    }
    
    public void informaIdade() {
        System.out.println(idade);
    }
    
    public void informaNome() {
        System.out.println(nome);
    }
    
    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        
        this.dia = dia;
        this.mes = mes;
        this.anoNasc = ano;
    }
}