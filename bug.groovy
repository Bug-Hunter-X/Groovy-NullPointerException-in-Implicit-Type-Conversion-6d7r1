```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2) // prints 5
println myMethod(2, 5) // prints 5
println myMethod(null, 2) // throws NullPointerException
```