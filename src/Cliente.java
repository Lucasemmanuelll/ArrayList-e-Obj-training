public class Cliente {
    private String nome;
    private int idade;
    private String cidade;

    Cliente(String nome, int idade, String cidade){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCidade(){
        return cidade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }

}
