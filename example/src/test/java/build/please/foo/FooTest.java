package build.please.foo;

import build.please.foo.Foo;
import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
  @Test
  public void testFoo() {
    Foo foo = new Foo();
    assertEquals("Foo", foo.foo());
  }
}