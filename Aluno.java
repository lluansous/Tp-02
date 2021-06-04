
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome = "Random";
    public String getNome(){
        return nome;
    }

    /**
     * Construtor para objetos da classe Aluno
     */
    public String alteraNome;
    public void alteraNome(String novoNome){
    
    {
        nome = novoNome;
        System.out.println(nome);// inicializa variáveis de instância
    
    }
}
    private int id;
    public int getId(){ 
        return id;

    }
    public void aletraId(int novoId){
        id = novoId;
        System.out.println(id);
    }
    
    private double media;
    protected double nota1;
    protected double nota2;
    
    private double calculaMedia(double nota1, double nota2, double media){
        media = (nota1+nota2)/2;
        return media;
    }
    
    public void passou (double media){
        if(media >=7){
            System.out.println("Aprovado");
        } else if (media<7){
            System.out.println("Reprovado");
        }
    }
}

