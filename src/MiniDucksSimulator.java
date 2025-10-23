/*
1. Classes estão bem organizadas.
2. Duck é uma classe abstrata, já que não podemos criar um objeto Duck, só derivados, como Mallard ou o Foguete.
Tanto FlyBehavior quanto QuackBehavior são interfaces, contratos. Mute,Model,Mallard,todos os Fly,With,Quack,Squeak e o
Duck são classes.
3. a) Mallard, Model, Mute herdam do Duck.
   b) Quack, Mute e Squeak implementam do QuackBehavior. FlyNoWay, RocketPowered e o WithWings implementam de FlyBehavior.
   c)
4.
*/
public class MiniDucksSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
