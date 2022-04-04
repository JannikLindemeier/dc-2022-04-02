public class Apple extends Lebensmittel implements Obst, Essbar{
    @Override
    public void essen() {

    }

    @Override
    public void schneiden() {
        System.out.println("cut......");
    }

    /*@Override
    public void test(){
        System.out.println("test");
    }*/
}
