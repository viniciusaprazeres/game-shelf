package games.model;

public abstract class Games {

    private String nome;
    private String descricao;
    private String desenvolvedora;
    private String distribuidora;
    private String dataDeLancamento;
    private float preco;

    public Games(String nome, String descricao, String desenvolvedora, String distribuidora, String dataDeLancamento, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.desenvolvedora = desenvolvedora;
        this.distribuidora = distribuidora;
        this.dataDeLancamento = dataDeLancamento;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
