public class Livro {
    private String exemplar;
    private String autor;
    private int edicao;
    private int ano;
    private char disponibilidade;

    public Livro(String exemplar, String autor, int edicao, int ano, char disponibilidade) {
        this.exemplar = exemplar;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(char disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
