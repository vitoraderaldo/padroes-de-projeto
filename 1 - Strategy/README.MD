## 1 - Warriors

---

### Contexto:

Existem vários tipos de guerreiros, os quais possuem armas diferentes. Entretanto um guerreiro pode trocar de arma ao decorrer do jogo.

### Aplicação do Padrão:

Foi separado o método _useWeapon()_ de **Warrior**, pois cada tipo de guerreiro possui uma arma diferente.

Desse modo, o comportamento da arma foi atribuído as implementações da Interface _Weapon_.

Assim, o guerreiro X informa qual será sua arma chamando as classes de comportamento em seu método construtor.

Além disso, é possível alterar qual arma usar e tempo de execução com o métodos: _setWeaponBehavior()_.

## 2 - Ducks

---

### Contexto:

Existem vários tipos de patos, os quais voam e grasnam de jeitos diferentes. Existem patos que possuem comportamentos similares e outros não.

### Aplicação do Padrão:

Foram separados os métodos _fly()_ e _quack()_ de **Duck**, pois cada tipo de pato voa e grasna de um jeito diferente.

Desse modo, os comportamentos: voar, nao voar, grasnar e silêncio são separados em classes diferentes (_Behavior_).

Assim, o pato X informa qual será seu jeito de voar ou grasnar chamando as classes acima em seu método construtor.

Além disso, é possível alterar o comportamento em tempo de execução com os métodos: _setFlyBehavior()_ e _setQuackBehavior()_.

**E por que não utilizar uma função abstrata em _fly()_ e _quack()_ ?**
Porque um comportamento pode estar vinculado a mais de um pato. Ou seja vários patos podem voar do mesmo jeito. Assim podemos evitar a duplicação de código e reaproveitar comportamentos que já foram escritos.
