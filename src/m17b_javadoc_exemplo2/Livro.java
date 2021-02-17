package m17b_javadoc_exemplo2;

/**
 * Classe Livro, para instanciar objectos-livros
 * @version 2.0, 17.fev.2021
 * @author joao barbosa
 */
public class Livro {
   /** título do livro */
   private String titulo; 
   /** nome do autor do livro<br>
    *  Caso hajam vários autores fica indicado apenas um.
    */
   private String autor;
   /** número de páginas do livro */
   private int paginas;
   
   
   /**
    * Construtor sem parâmetros, que inicializa os atributos
    * com valores predefinidos conhecidos.
    */
   public Livro(){
      titulo  = "";
      autor   = "";
      paginas = 0;
   }
   
   /**
    * Construtor da classe parametrizado com todos os atributos.
    * @param t título do livro
    * @param a autor do livro
    * @param p número de páginas do livro
    */
   public Livro(String t, String a, int p){
      titulo  = t;
      autor   = a;
      paginas = p;
   }
   
   /**
    * 
    * @return uma string contendo um resumo dos dados do livro
    */
   public String resumo(){
      return "Titulo: "+ titulo+", "+autor+", "+paginas+" páginas.";
   }
   
   /**
    * 
    * @return uma string composta pelos atributos da classe.
    */
   @Override
   public String toString(){
      return "Titulo: "+ titulo+", "+autor+", "+paginas+" páginas.";
   }
   
}