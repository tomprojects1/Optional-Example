import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class GeneralService {

    public abstract Optional<Person> doSomething();

    public static Supplier<Optional<Person>> createInstance = () -> {

        Person person = new Person();
        person.setName("John");
        return Optional.of(person);
    };

    public static Function<Optional<Person>, Optional<Person>> setDefaultSurname = p -> {

        Person person = p.get();
        person.setSurname("Doe");
        return Optional.of(person);
    };
}
