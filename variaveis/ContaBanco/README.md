ontaBanco

Descrição

Este projeto simula um sistema bancário simples com duas principais funcionalidades:

Verificação de Conta: O usuário pode verificar se sua conta bancária existe e visualizar o saldo correspondente.

Cadastro de Novo Usuário: Caso o usuário não seja encontrado, ele pode realizar um cadastro e criar sua própria conta.

O projeto está dividido em dois arquivos principais:

ContaBanco.java

CadastroUsuario.java

Estrutura do Projeto

1. ContaBanco.java

O arquivo principal do projeto que:

Solicita ao usuário informações como nome, agência e número da conta.

Verifica se os dados inseridos correspondem a uma conta pré-existente.

Exibe o saldo da conta caso os dados estejam corretos.

Redireciona o usuário para o menu de cadastro caso os dados sejam inválidos.

2. CadastroUsuario.java

Gerencia o cadastro de novos usuários por meio de um menu de seleção:

Oferece as opções "Fazer Cadastro" e "Sair".

Permite ao usuário navegar pelas opções usando as teclas w (para cima) e s (para baixo).

Coleta informações como email e senha ao iniciar o processo de cadastro.

Realiza verificação para garantir que o email e a senha sejam confirmados corretamente.

Tecnologias Utilizadas

Java: Linguagem de programação utilizada no desenvolvimento do sistema.

Scanner: Para coleta de dados do usuário via terminal.

Funcionalidades

1. Verificação de Conta Existente

Solicita nome, agência e número da conta.

Verifica se os dados inseridos são iguais aos de uma conta pré-cadastrada ("Mario Andrade", agência "0678" e número "1021").

Caso os dados estejam corretos, exibe o saldo da conta.

Caso os dados estejam incorretos, redireciona o usuário para o menu de cadastro.

2. Cadastro de Novo Usuário

Oferece um menu de seleção com as opções "Fazer Cadastro" e "Sair".

Permite ao usuário navegar pelo menu usando as teclas w e s.

Durante o cadastro:

Solicita email e confirmação do mesmo.

Solicita senha e confirmação da mesma.

Verifica se os dados inseridos são consistentes antes de finalizar o cadastro.
