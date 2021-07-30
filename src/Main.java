import java.util.Optional;

public class Main {

    public static void main (String[] args){

        GeneralService service = new SpecificService();

        Person person = service.doSomething().get();

        System.out.println(person.getName());
        System.out.println(person.getSurname());
    }
}
