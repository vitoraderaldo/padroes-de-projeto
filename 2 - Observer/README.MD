## 1 - Weather

### Contexto:

Implementar um sistema que informa os dados metereológicos, como: temperatura, humidade, pressão.

### Aplicação do Padrão:

WeatherStation: É responsável por captar os dados metereológicos e informa-los a WeatherData.

WeatherData: É uma classe que implementa um Subject, ou seja, ela informa aos Observers os dados que foram alterados.
Neste caso notifica os dados: temperatura, humidade e pressão.

CurrentConditionsDislay: É uma classe que implementa um Observer, ou seja, esta classe é notificada quando os os dados
da classe WeatherData são alterados e então exibe automaticamente na tela para o usuário.

## 2 - Climate

### Contexto:

Mesmo contexto do Weather, entretanto foram utilizados as interfaces/classes padrão do Java para lidar com _Observer_ e _Subject_. Assim conseguimos diminuir ainda mais o código. O _Subject_ se tornou _Observable_.

#### Oque foi alterado ?

**WeatherData:**

1. Foi importados _java.util.Observable_.
2. Foi trocado **implements Subject** por **extends Observable**.
3. Foi retirado os métodos _registerObserver_, _removeObserver_ e _notifyObservers_. A classe _Observable_ do JAVA fica responsável por realizar esses métodos.
4. Foi retirado o código do método construtor.
5. Criamos _getters_ para temperature, humidity e pressure.

**CurrentConditionsDisplay:**

1. Foi importado _import java.util.Observer_ e _java.util.Observable_.
2. Foi alterado o método construtor.
3. Foi alterado o método update para ser compatível com o que o _Observer_ padrão do Java espera.
