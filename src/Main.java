import edu.java.stream.LambdaInterface;
import edu.java.stream.Person;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {

        //invocando interface lambda.
        LambdaInterface lambdaInterface = (int x) -> x * x;
        //usando o método abstrato interface lambda.
        System.out.println(lambdaInterface.getSquare(2));

        //criando uma lista de array dos objetos Person.
        List<Person> personList = new ArrayList<Person>();

        //atribuindo valores aos objetos.
        personList.add(new Person(1,"Mary"));
        personList.add(new Person(2, "Jhon"));
        personList.add(new Person(3, "Peter"));

        //criou uma nova lista, onde filtra os objetos pessoa com id > 1, coleta estes para nova lista.
        personList = personList.stream().filter(person -> person.getId() > 1).collect(Collectors.toList());
        System.out.println(personList.size());

        //criou uma nova lista que coleta um mapa dos objetos pessoa, pelo id.
        List<Long> idList = personList.stream().map(person -> person.getId()).collect(Collectors.toList());
        System.out.println(idList);


        //****************************************************************************************************

        Integer[] array = new Integer[5];
        //exception -- System.out.println(array[3]); // ocorre uma exception: NullPointerException

        array[3] = 5;

        //verifica valor null
        Optional<Integer> optional = Optional.ofNullable(array[3]);

        if (optional.isPresent()){
            System.out.println(array[3].toString());
        }

        //****************************************************************************************************

        //criando um objeto de StringJoiner com delimitador
        StringJoiner name = new StringJoiner(",","[","]");

        //atribuindo valores
        name.add("Julia");
        name.add("Lisa");
        name.add("Carlos");

        //criando um novo objeto com outros delimitador
        StringJoiner country = new StringJoiner(";","{","}");
        country.add("Brazil");
        country.add("USA");
        country.add("México");

        //Juntando os dois objetos em merge.
        StringJoiner merged = name.merge(country);

        //será impresso uma lista unica.
        System.out.println(merged.toString());


    }
}