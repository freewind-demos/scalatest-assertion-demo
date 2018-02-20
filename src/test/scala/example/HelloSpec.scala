package example

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest._

class HelloSpec extends FunSuite with TypeCheckedTripleEquals {

  test("string === string") {
    assert(Hello.hello("Scala") === "Hello, Scala!")
  }

  test("int === int") {
    assert(1 + 1 === 2)
  }

  // can't compile
  //  test("string === int") {
  //    assert(1 === "abc")
  //  }
}
