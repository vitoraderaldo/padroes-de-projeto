## 1 - Animals

### Contexto:

Temos um programa com interfaces para animais, como, por exemplo _Tigger_. Todo o código da aplicação está feito para funcionar para a interface _Tigger_, entretanto, surgiu a necessidade de criarmos uma interface para Gatos, chamada _Cat_, já que o sistema terá que abranger essa categoria também.

### Aplicação do Padrão:

Para isso, o padrão _Adapter_ foi introduzido com o objetivo de trabalharmos os Gatos como se fossem Tigres. Isto mesmo, não vamos precisar alterar a lógica nem as classes existentes, apenas criar mais classes.

Para isso foi criada a classe _CatAdapter_ que é responsável por fazer uma ponte entre as interfaces Gato e Tigre. Esta classe implementa um _Tigger_ e recebe no construtor um _Cat_. Com isso conseguimos mapear todos os comportamentos de um gato para os equivalentes de um tigre.
