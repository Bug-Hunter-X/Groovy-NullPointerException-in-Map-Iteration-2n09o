```groovy
def myMethod(Map params) {
  params.each { key, value ->
    println "$key: $value"
  }
}

myMethod(null)
```