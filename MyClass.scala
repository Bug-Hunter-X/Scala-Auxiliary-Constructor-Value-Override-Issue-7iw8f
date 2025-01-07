```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
}

val myInstance = new MyClass()
println(myInstance.value) // Output: 0

val anotherInstance = new MyClass(5)
println(anotherInstance.value) // Output: 5

//Error case
val errorInstance = new MyClass{override val value = 10}
println(errorInstance.value)//Output: 10 (Incorrect)
```