package mixt.runner;

import com.javaWork.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MixtWorkTest {
    @Test
public void method() {

    String[] s = {"Bird", "cow", "frog"};
    int[] a = {20, 70, 6, 9, 8, 7};
    Encapsulation en = new Encapsulation();
    IfElseStatement st = new IfElseStatement();
    Mix m = new Mix();
    WhileLoop whileLoop = new WhileLoop();
    ForEachLoop forEachLoop = new ForEachLoop();
    CollectionClass cs = new CollectionClass();
    //  System.out.println( en.getPrice());
    // System.out.println( en.getRete());
    // System.out.println( en.getInterest());
    // System.out.println( m.getA());
    //  System.out.println(m.getB());
    //  System.out.println(whileLoop.m2());
    // System.out.println(whileLoop.a);
    //  System.out.println(whileLoop.b);
    // System.out.println(forEachLoop.method());
    ArrayList c = new ArrayList();
    c.add("pen");
    c.add("Book");
    c.add("Pencil");
    c.add(true);
    c.remove(s[0]);
    c.add(s[1]);
    c.add(s[2]);
    System.out.println("***************");
    for (int i = 0; i < c.size(); i++) {
        System.out.println(c.get(i));
    }
    System.out.println("***************");
    Iterator<Object> it = c.iterator();
    while (it.hasNext()) {

        System.out.println(it.next());
    }
    System.out.println("****     ******");
    c.stream().forEach(el -> {
        System.out.println(el);

    });
    System.out.println("***************");
    ArrayList list = new ArrayList(Arrays.asList(20, 6, 5, 9, 34, 7));
    System.out.println(list);
    // System.out.println(c);
    //  System.out.println(c.get(1));

}


}
