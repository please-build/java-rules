package build.please;

import build.please.foo.Foo;

public class Main {
  public static void main(String... args) {
    System.out.println(new Foo().foo());
  }
}