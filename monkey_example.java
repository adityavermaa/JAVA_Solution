class monkey{

    public void jump(){
        System.out.println("Monkey is Jumping");
    }
    public void bite(){
        System.out.println("Dont touch monkey he will bite");
    }
}
interface basicAnimal{
        void eat();
        void sleep();
}
class human extends monkey implements basicAnimal{
    @Override
    public void eat(){
        System.out.println("having food!");
    }
    @Override
    public void sleep(){
        System.out.println("having a sleep!");
    }
}
public class monkey_example{
    public static void main(String[] args){

    }
}