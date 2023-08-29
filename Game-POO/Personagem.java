class Personagem {

  String nome;

  String tipo;

  int nivel;
  
  protected int id;

 
  // Construtor da classe Personagem
  public Personagem(int ID) {

    this.id = ID;

    this.nome = "indefinido";

    this.tipo = "indefinido";

    this.nivel = 0;

  }
 
  // Função para imprimir dados das classes
  public void imprimeDados() {

    System.out.println("Personagem do tipo "+this.tipo+ " com ID = "+this.id);

    System.out.println("Possui nivel "+this.nivel+" e se chama  "+this.nome);

    

  }
  
  public void atuar(int codigo) {
    System.out.println("Vai executar uma atividade do tipo " + codigo);
    // Inclusão de condicionais para atividade realizada
    if (codigo == 0){
      System.out.println("-= Esperar =-");
    }
    else if (codigo == 1) {
      System.out.println("-= Atacar =-");
    }
    else if (codigo == 2) {
      System.out.println("-= Defender =-");
    }
  }
}