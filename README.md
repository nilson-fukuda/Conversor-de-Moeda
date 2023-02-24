# Conversor-de-Moeda

Descrição do seu projeto;
    Challenger ONE - conversor de moeda
    Este é um dos sprint solicitados pelo curso da Alura da Turma 4 Beck End.
    Segue descrição do Trello
        História

        Nesta oportunidade foi solicitado para nós Devs a criação de um conversor de moeda utilizando a linguagem Java. As características solicitadas por nosso cliente são as seguintes:

        O conversor de moeda deverá:- Converter de Reais a Dólar- Converter de Reais a Euro- Converter de Reais a Libras Esterlinas- Converter de Reais a Peso argentino- Converter de Reais a Peso Chileno

        Lembrando que deve ser possível também converter de forma inversa ou seja:

                - Converter de Dólar a Reais
                - Converter de Euro a Reais
                - Converter de Libras Esterlinas a Reais
                - Converter de Peso argentino a  Reais
                - Converter de Peso Chileno a Reais

        Como desafio extra incentivamos vocês a deixar fluir sua criatividade, se posso converter moedas, será que posso tal vez adicionar a meu programa outro tipo de conversões como temperatura por exemplo?

        É hora de surpreender nosso cliente com uma feature que tal vez nem ele sabia que precisava.



        Temos um período de tempo de duas semanas para desenvolver  o projeto  e vamos trabalhar com o sistema ágil de desenvolvimento utilizando o Trello da seguinte forma:

        A coluna "Pronto pra iniciar" apresenta os cartões com os elementos ainda não desenvolvidos;

        Já na coluna "Desenvolvendo" ficarão os elementos que você estiver desenvolvendo no momento. Ao iniciar uma tarefa, você poderá mover o cartão que contém a tarefa para esta coluna.

        No "Pausado" estarão os elementos que você começou a desenvolver, porém não concluiu ainda. Por exemplo, se você começou a desenvolver a tarefa de um card, mas decidiu pausar para se concentrar primeiro em outra parte do projeto;

        Por fim, a coluna "Concluído" terá os elementos já concluídos.

        O Trello é uma ferramenta de uso individual para você controlar o andamento das suas atividades, mas ela não será avaliada.

        Bom projeto!


Funcionalidades;
    Menu Pincipal
        Esta caixa de diálogo deve permitir que o usuário escolha entre as opções de conversão; 
        Utilizar a classe JOptionPane da biblioteca Javax.swing;
        Utilizar o método showInputDialog como objeto para apresentar mais de uma opção;    
        Esta caixa de diálogo deve permitir que o usuário insira o valor ou quantia de dinheiro que você deseja converter para a moeda previamente escolhida, por exemplo: o usuário digitará a quantidade de reais que quer converter em dólares.
        Nela estão listados os tipos de conversão disponíveis.

    Input do valor
        Entrada valida, não deve aceitar outro tipo de caractere que não seja o tipo numérico.
        Utilizar o método showInputDialog para o usuário inserir um valor.

    Opçoes de Moeda
        Esta caixa de diálogo deve permitir que o usuário escolha entre as diferentes moedas à qual ele quer converter seu dinheiro.
        Utilizar a classe JOptionPane da biblioteca Javax;
        Utilizar o método showInputDialog como objeto para apresentar mais de uma opção para conversão;
        
        Neste preferi utilizar duas caixas de diálogo, sendo uma a entrada e a outra a saída;

    Calculo
        Criei uma classe que apresenta as caixas de diálogo me retornando as unidade de entrada e saida;
        De acordo com tipo de conversão, é efeuado o calculo correto de conversão da unidade de entrada para a unidade de saída.
    
    Mensagem do valor
        Para mostrar para o nosso usuário o valor da conversão realizada.
        Utilizar o método showMessageDialog para apresentar o valor da conversão.

    Tratamento de erro
        Na caixa de dialogo especificamos que outros tipos de caracteres que não são números não devem ser permitidos, agora se o usuário digitar em letras ou caracteres especiais e pressionar OK deve ser mostrado uma mensagem apontando que o valor não é válido.
        Utilizar o método showMessageDialog para fazer validação no input para que não sejam aceitos caracteres.
    
    Deseja continuar?
        Nosso cliente quer que nosso usuário decida que ele quer fazer depois de executar a primeira conversão. Apresentamos as seguintes opções:
        Yes:  deve trazer nosso usuário novamente para o menu principal.
        No:  Você deve mostrar uma mensagem "Programa finalizado"
        Cancel:  Você deve mostrar uma mensagem de "Programa concluído"
        Utilizar o método showConfirmDialog para o usuário que deseja seguir no programa.

Como os usuários podem utilizá-lo;
    Ao executar a aplicação selecione um dos tipos de convesão disponíveis.
    No momento tenho apenas:
        1- conversor de moeda;
        2- conversor de temperatura;
        3- conversor de comprimento;
        4- conversor de área;
        5- conversor de volume;
        6- conversor de massa; 
    Informe o valor a ser convertido, caso digite algo que não seja número e apresentará uma mensagem informando que o valor não é válido.
    Caso tenha a: 
    opção 1
        Estarão disponível para conversão as moedas em: Real, Dólar, Euro, Libra, Yene, Franco Suiço, Dólar Canadense, Dólar Australiano.
    opção 2
        Estarão disponíveis para conversão as temperaturas em: Celsius, Fahrenheit, Kelvin.
    opção 3
        Estarão disponíveis para conversão os comprimentos em: km, hm, dam, m, dm, cm, mm.
    opção 4
        Estarão disponíveis para conversão as áreas em: km², hm², dam², m², dm², cm², mm².
    opção 5
        Estarão disponíveis para conversão os volumes em: km³, hm³, dam³, m³, dm³, cm³, mm³.
    opção 6
        Estarão disponíveis para conversão as massas em: kg, hg, dag, g, dg, cg, mg.
    Será apresentada uma caixa de mensagem informando o valor da unidade de entrada e seu equivalente valor convertido e a unidade de saida.
    Após pressionar o botão OK.
    Será apresentada uma nova mensagem perguntando se deseja continuar, caso yes ele reinicia o aplicativo, caso no ele finaliza com uma mensagem e caso cancel ele finaliza com outra mensagem.  

Autores do projeto.
    Nilson Noboru Fukuda    