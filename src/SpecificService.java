import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class SpecificService extends GeneralService {

    @Override
    public Optional<Person> doSomething(){

        // Error in .map(...)
        //Optional<Person> person = GeneralService.createInstance.get() // returns a Supplier and then get() returns an Optional<Person>
        //        .map(GeneralService.setDefaultSurname);

        // Correct version
        Optional<Person> person = GeneralService.setDefaultSurname.apply(GeneralService.createInstance.get());
        return person;
    }



}
