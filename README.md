# Gerenciamento de Ninjas - Projeto em Java

## Descrição
Projeto simples em Java que permite realizar operações básicas como cadastrar, exibir informações, atualizar e deletar ninjas de uma lista, utilizando classes e conceitos de orientação a objetos.

## Funcionalidades
- **Cadastrar Ninja**: Cadastre um novo ninja na lista.
- **Exibir Informações**: Visualize detalhes dos ninjas cadastrados.
- **Atualizar Habilidade Especial**: Altere a habilidade especial de um ninja existente.
- **Deletar Ninja**: Remova um ninja cadastrado do sistema.
- **Sair**: Encerre o programa.

## Requisitos do Desafio
1. Crie um programa em Java para gerenciar informações de ninjas utilizando herança. Desenvolva uma classe base chamada `Ninja` e uma subclasse chamada `Uchiha`.
2. Na classe `Ninja`, defina os atributos:
   - `nome` (String)
   - `idade` (int)
   - `missao` (String)
   - `nivelDificuldade` (String)
   - `statusMissao` (String)
   
   Adicione um método chamado `mostrarInformacoes()` que exibe todos esses atributos.
3. Crie uma subclasse chamada `Uchiha` que herda de `Ninja`. Adicione:
   - Um atributo adicional `habilidadeEspecial` (String).
   - Um método chamado `mostrarHabilidadeEspecial()` para exibir a habilidade especial do ninja.
4. Sobrescreva o método `mostrarInformacoes()` na classe `Uchiha` para incluir também a habilidade especial.
5. Como desafio adicional, implemente um menu interativo utilizando a classe `Scanner` para permitir ao usuário escolher entre diferentes opções, como:
   - Exibir informações de todos os ninjas.
   - Adicionar novos ninjas.
   - Atualizar as habilidades especiais.

Isso ajudará a praticar o uso de entrada do usuário e controle de fluxo no programa.

---

Divirta-se programando e gerenciando seus ninjas!

