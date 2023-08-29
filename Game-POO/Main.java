// importação da biblioteca random
import java.util.Random;
import java.util.Scanner;

public class Main {
  //Criação de método para imprimir um texto entre linhas
  public void MsgLinha(String msg) {
    if (msg != "") {
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println(msg);
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    else System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");    
  }
  
  public static void main(String[] args) {
    // novo objeto criado para receber mensagem e linhas
    Main mlin = new Main();
    // novo objeto para receber input
    Scanner inputUsuario = new Scanner(System.in);
    int opt;
    String nome;
    // novo objeto criado para randomizar ação de personavem
    Random aleat = new Random();
    
    mlin.MsgLinha("Atividade de produção\nDisciplina: Programação Orientada A Objetos - G23100279\nAluno: William Freire Wang\nMatrícula: 202221378\nLink do código: https://replit.com/@WILLIAMFREIRE2/AtividadeDeProducao-POO-G23100279");
    
    // Criação de uma nova instância para Classe Personagem / novo objeto
    Personagem p = new Personagem(1);
    
    mlin.MsgLinha("");
    p.imprimeDados();
    mlin.MsgLinha("");
    // Criação de uma nova instância para Classe Dragao / novo objeto
    Dragao d1 = new Dragao(2, "Hades", "Fogo");  
    // Definição de nível para o personagem
    d1.nivel = 9;
    mlin.MsgLinha("");
    d1.imprimeInfo();
    //output será feito com base no número aleatório que sair entre 0 e 2
    d1.atuar(aleat.nextInt(3));
    mlin.MsgLinha("");

    System.out.print("Digite o nome do Herói: ");
    nome = inputUsuario.nextLine();
    // Criação de uma nova instância para Classe Heroi / novo objeto
    Heroi h1 = new Heroi(1378, nome, "Guerreiro", "Gelo");
    // Definição de nível para o personagem
    h1.nivel = 10;
    mlin.MsgLinha("");
    h1.imprimeInfo();
    
    // Loop while true que irá quebrar apenas se o usuário colocar opções dentro dos parâmetros ofertados
    while (true) {
      System.out.print("Digite a ação desejada:\n[0] - Esperar\n[1] - Atacar\n[2] - Defender\n");
      opt = inputUsuario.nextInt();
      if (opt < 0 || opt > 2) {
      System.out.println("Erro: opção inválida!");
      }
      else {
        break;
      }
    }
    
    //output será feito com base no número fornecido pelo usuário
    h1.atuar(opt);
    mlin.MsgLinha("Fim do programa!");
  }
}