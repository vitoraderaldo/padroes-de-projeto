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

Mesmo contexto do Weather, entretanto foram utilizados as interfaces padrão do Java para lidar com Observer e Subject.
Ou seja, retiramos as classes "Observer" e "Subject" que fizemos manualmente e substituimos por:
