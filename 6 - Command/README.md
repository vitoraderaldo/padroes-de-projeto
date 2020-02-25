## 1 - RemoteControl

### Contexto:

Temos que programar um controle remoto que administre diversos dispositivos da casa, como, por exemplo: luzes, porta da garagem e ventilador.

### Aplicação do Padrão:

Para isso, o padrão _Command_ foi introduzido com o objetivo de desacoplar o vínculo de pressionamentos de botões com a lógica de controlar os dispositivos.

Para isso foi criado a interface _Command_ que é responsável por estabelecer o padrão de como os comportamentos dos dispositivos podem ser chamados.

Com isso conseguimos criar a classe _LightOnCommand_ que herda _Command_. Esta classe é responsável por colocar toda a lógica de como ligar uma lâmpada na função _execute()_.

Isso mostra que os métodos dos dispotivios físicos (ventilador, luz e etc) foram encapsulados e não fazem parte do _RemoteControl_.

Desa maneira, a classe _RemoteControl_ não precisa saber as regras de como ligar ou desligar um equipamento, ela apenas relaciona uma ação com seu comando.

Basicamente, este padrão desconecta o objeto que faz uma solicitação do dispositivo que realmente sabe processa-la. Além disso, foi implementado a função _undo()_ na interface _Command_, com o objetivo de obrigar as classes que a implementam informar as regras de como desfazer tal ação.
