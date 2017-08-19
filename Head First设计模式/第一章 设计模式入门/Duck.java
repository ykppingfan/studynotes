public abstract class Duck {
    public void quack() { //所有鸭子都会呱呱叫
        System.out.println("quack");
    }

    public void swim() { //所有鸭子都会游泳
        System.out.println("swim");
    }

    public abstract void display(); //每个鸭子具有不同的外观，所以用抽象方法
}
