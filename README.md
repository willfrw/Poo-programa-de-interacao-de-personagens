# Programa de Interação de Personagens

Este é um programa de interação de personagens desenvolvido em Java. Ele simula a interação entre um herói, um dragão e um personagem genérico em um cenário de combate. O programa utiliza a orientação a objetos para criar instâncias de diferentes tipos de personagens e permite que o usuário escolha ações para o herói.

## Funcionalidades

- Criação de instâncias para diferentes tipos de personagens: Herói, Dragão e Personagem Genérico.
- Definição de níveis para os personagens.
- Simulação de ações de ataque, defesa e espera para o herói.
- Simulação de ações para o dragão com base em escolhas aleatórias.
- Interação com o usuário para escolha de ações do herói.

## Classes

### Classe Personagem

- Atributos: nome, tipo, nível e ID.
- Método Construtor: Inicializa os atributos básicos do personagem.
- Método `imprimeDados()`: Imprime informações do personagem, como tipo, ID, nível e nome.
- Método `atuar(int codigo)`: Executa uma atividade com base no código fornecido. As atividades podem ser "Esperar", "Atacar" ou "Defender".

### Classe Herói

- Herança: Herda da classe `Personagem`.
- Atributos adicionais: peso, atividade e ocupado.
- Método Construtor: Inicializa os atributos do herói, incluindo nome, classe e afinidade.
- Método `imprimeInfo()`: Imprime informações específicas do herói, incluindo sua classe e afinidade.
- Método `atuar(int codigo)`: Sobrescreve o método da classe pai para adicionar comportamentos específicos do herói.

## Como Executar

1. Clone ou baixe o repositório para o seu sistema.
2. Compile o código-fonte Java em um ambiente de desenvolvimento Java (por exemplo, JDK).
3. Execute o programa compilado.
4. Siga as instruções no terminal para interagir com o herói e observar a interação com o dragão.

## Teste Agora

Você pode experimentar o Manipulador de Texto através deste ambiente interativo:

[![Run on Replit](https://replit.com/@WILLIAMFREIRE2/AtividadeDeProducao-POO-G23100279)

## Contato

👤 **William Wang**
👋 Sou William Wang, um entusiasta de tecnologia.
🚀 Estudante de programação em busca de aprendizado constante.
🌟 Apaixonado por criar e inovar através do código.
📚 Compartilhando conhecimento e explorando novas fronteiras.

Vamos Conectar:
🌐 [LinkedIn](https://www.linkedin.com/in/william-freire-wang-53b72128a/)
📬 Contato: william.wang_dev@outlook.com

## Licença

Este projeto está licenciado sob a Licença [MIT License](https://www.mit.edu/~amini/LICENSE.md).
