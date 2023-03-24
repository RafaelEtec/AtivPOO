package Aula_24_03_2023;
/**
 * @author rafael.fgoulart1
 * @author vinicius.soliveira63
 */
public class Main {
    public static void main(String[] args) {
        Pessoa Einstein = new Pessoa("Einstein", 0,14, 03, 1879);
        Pessoa Newton = new Pessoa("Newton", 0, 4, 1, 1643);
        
        Einstein.setIdade(Math.round(Einstein.calculaIdade(14, 03, 1879)));
        Newton.setIdade(Math.round(Newton.calculaIdade(4, 1, 1643)));
        
        Einstein.informaNome();
        Einstein.informaIdade();
        
        Newton.informaNome();
        Newton.informaIdade();
    }
}