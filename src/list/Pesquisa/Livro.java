package list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String atuor;
    private int anoPublicacao;

    public Livro(String titulo, String atuor, int anoPublicacao) {
        this.titulo = titulo;
        this.atuor = atuor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAtuor() {
        return atuor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", atuor='" + atuor + '\'' +
                ", anoPublicacao='" + anoPublicacao + '\'' +
                '}';
    }
}
