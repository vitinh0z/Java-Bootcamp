<h2>Descrição</h2>
<p>Este projeto simula um sistema bancário simples com duas principais funcionalidades:</p>
<ul>
    <li><strong>Verificação de Conta</strong>: O usuário pode verificar se sua conta bancária existe e visualizar o saldo correspondente.</li>
    <li><strong>Cadastro de Novo Usuário</strong>: Caso o usuário não seja encontrado, ele pode realizar um cadastro e criar sua própria conta.</li>
</ul>
<p>O projeto está dividido em dois arquivos principais:</p>
<ul>
    <li><code>ContaBanco.java</code></li>
    <li><code>CadastroUsuario.java</code></li>
</ul>

<h2>Estrutura do Projeto</h2>

<h3>1. ContaBanco.java</h3>
<p>O arquivo principal do projeto que:</p>
<ul>
    <li>Solicita ao usuário informações como nome, agência e número da conta.</li>
    <li>Verifica se os dados inseridos correspondem a uma conta pré-existente.</li>
    <li>Exibe o saldo da conta caso os dados estejam corretos.</li>
    <li>Redireciona o usuário para o menu de cadastro caso os dados sejam inválidos.</li>
</ul>

<h3>2. CadastroUsuario.java</h3>
<p>Gerencia o cadastro de novos usuários por meio de um menu de seleção:</p>
<ul>
    <li>Oferece as opções <strong>"Fazer Cadastro"</strong> e <strong>"Sair"</strong>.</li>
    <li>Permite ao usuário navegar pelas opções usando as teclas <code>w</code> (para cima) e <code>s</code> (para baixo).</li>
    <li>Coleta informações como email e senha ao iniciar o processo de cadastro.</li>
    <li>Realiza verificação para garantir que o email e a senha sejam confirmados corretamente.</li>
</ul>

<h2>Tecnologias Utilizadas</h2>
<ul>
    <li><strong>Java</strong>: Linguagem de programação utilizada no desenvolvimento do sistema.</li>
    <li><strong>Scanner</strong>: Para coleta de dados do usuário via terminal.</li>
</ul>

<h2>Funcionalidades</h2>

<h3>1. Verificação de Conta Existente</h3>
<ul>
    <li>Solicita nome, agência e número da conta.</li>
    <li>Verifica se os dados inseridos são iguais aos de uma conta pré-cadastrada (<strong>"Mario Andrade"</strong>, agência <strong>"0678"</strong> e número <strong>"1021"</strong>).</li>
    <li>Caso os dados estejam corretos, exibe o saldo da conta.</li>
    <li>Caso os dados estejam incorretos, redireciona o usuário para o menu de cadastro.</li>
</ul>

<h3>2. Cadastro de Novo Usuário</h3>
<ul>
    <li>Oferece um menu de seleção com as opções <strong>"Fazer Cadastro"</strong> e <strong>"Sair"</strong>.</li>
    <li>Permite ao usuário navegar pelo menu usando as teclas <code>w</code> e <code>s</code>.</li>
    <li>Durante o cadastro:
        <ul>
            <li>Solicita email e confirmação do mesmo.</li>
            <li>Solicita senha e confirmação da mesma.</li>
            <li>Verifica se os dados inseridos são consistentes antes de finalizar o cadastro.</li>
        </ul>
    </li>
</ul>

<h2>Como Executar o Projeto</h2>
<ol>
    <li>Compile os arquivos Java utilizando o seguinte comando:</li>
    <pre><code>javac ContaBanco.java CadastroUsuario.java</code></pre>
    <li>Execute o arquivo principal:</li>
    <pre><code>java ContaBanco</code></pre>
    <li>Siga as instruções exibidas no terminal para interagir com o sistema.</li>
</ol>

<h2>Observações</h2>
<ul>
    <li>Certifique-se de que os arquivos <code>ContaBanco.java</code> e <code>CadastroUsuario.java</code> estejam no mesmo diretório antes de compilar.</li>
    <li>Para acessar o saldo pré-configurado, utilize os seguintes dados:</li>
    <ul>
        <li><strong>Nome:</strong> <code>Mario Andrade</code></li>
        <li><strong>Agência:</strong> <code>0678</code></li>
        <li><strong>Número:</strong> <code>1021</code></li>
    </ul>
</ul>

<h2>Melhorias Futuras</h2>
<ul>
    <li>Persistência de dados para manter informações de usuários cadastrados entre execuções.</li>
    <li>Implementação de uma interface gráfica para melhorar a experiência do usuário.</li>
    <li>Expansão do sistema com funcionalidades como transferências e consulta de histórico bancário.</li>
</ul>
