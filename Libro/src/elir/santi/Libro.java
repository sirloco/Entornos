package elir.santi;

public class Libro {

    @Override
    public String toString() {
        return "El libro "+titulo+" con ISBN "+isbn+" creado por "+autor+" tiene "+pagina+" páginas";
    }

    private String isbn;
    private String titulo;
    private String autor;
    private int pagina;

    public Libro() {

    }

    public Libro(String isbn, String titulo, String autor, int pagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }
}
