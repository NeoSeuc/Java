package paterns;

public class Factory {
    public  AbstractItem getItem(ItemTypes type) throws Exception {
        AbstractItem toReturn = null;

        switch (type) {
            case TYPE1: toReturn = new SpecificItem1(); break;
            case TYPE2: toReturn = new SpecificItem2(); break;
            case TYPE3: toReturn = new SpecificItem3(); break;
            default: throw new Exception("Invalid Type");
        }

        return toReturn;
    }
}

//maximum abstractness :)
abstract class AbstractItem {
    abstract void getAbstractionValue();
}

enum ItemTypes {
    TYPE1, TYPE2, TYPE3
}

class SpecificItem1 extends AbstractItem {

    @Override
    void getAbstractionValue() {
        System.out.println( "Value of object 1");
    }
}

class SpecificItem2 extends AbstractItem {

    @Override
    void getAbstractionValue() {
        System.out.println( "Value of object 2");
    }
}

class SpecificItem3 extends AbstractItem {

    @Override
    void getAbstractionValue() {
        System.out.println( "Value of object 3");
    }
}
class FactoryApp {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        AbstractItem item1 = factory.getItem(ItemTypes.TYPE1);
        AbstractItem item2 = factory.getItem(ItemTypes.TYPE2);
        AbstractItem item3 = factory.getItem(ItemTypes.TYPE3);

        item1.getAbstractionValue();
        item2.getAbstractionValue();
        item3.getAbstractionValue();
    }
}
