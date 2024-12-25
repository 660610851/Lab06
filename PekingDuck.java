public class PekingDuck extends Duck {
     PekingDuck(String name) {
        super(name);
    }

    @Override
    void clean(Animal animal) {
        System.out.println(this.name +"พี่แจ็คคคคคค");
    }
}
