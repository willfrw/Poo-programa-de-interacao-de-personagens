// Herança da classe Personagem - Classe Heroi
  
class Heroi extends Personagem {

  int peso;

  int atividade;
  
  boolean ocupado;

  String classe;

  String afinidade;

 
  // Construtor da classe Heroi
  public Heroi(int ID) {

    super(ID);

    this.tipo = "heroi";
    
    this.nome = "indefinido";

    this.classe = "indefinido";

    this.afinidade = "indefinido";

    this.atividade = 0;

    this.ocupado = false;

  }

 

  public Heroi(int ID, String nome, String classe, String afinidade) {

    super(ID);

    this.tipo = "Heroi";

    this.nome = nome;

    this.classe = classe;

    this.afinidade = afinidade;

    this.atividade = 0;

    this.ocupado = false;

  }

 

  public void imprimeInfo(){
    // Chamada do método imprimeDados() da classe pai
    this.imprimeDados();

    System.out.println("Possui a classe " + this.classe + " e afinidade com o elemento " + this.afinidade);

  }

}