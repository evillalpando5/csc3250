// templated class an arraylist of test objects
// <> templated class template parameter
// arraylist is a generic
// containers are templated so we can store objects of any type

class Test {
    private int _x;
    public Test(){_x = 0;}
    public Test(int n){_x =n;}
    public void set_x(int n){_x = n;}
    public int get_x(){return _x;}
}
class Test2 {
    private int _y;
    public Test2(){_y = 0;}
    public Test2(int n){_y =n;}
    public void set_y(int n){_y = n;}
    public int get_y(){return _y;}
}
class Stuff<T>{
    // private T ensures that its of type whatever they pass in
    private T _thing;
    public Stuff() {_thing = null;}
    public Stuff(T t) {_thing = t;}
    public T getThing(){return _thing;}
    public void setThing(T t){_thing = t;}
    public void print(){
        if(_thing != null) {
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
        }
        else {
            System.out.println("Null member variable ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Test2 t2 = new Test2(4);
        Test t1 = new Test(2);
        // code is using an exiisitng templating class
        // Stuff.add(new Test(3));
        Stuff<Test> testing123 = new Stuff();
        testing123.print();
        testing123.setThing(new Test(5));
        System.out.println(testing123.getThing().get_x());
    }
}