```groovy
def myMethod(Map params) {
  if (params) { // Check for null
    params.each { key, value ->
      println "$key: $value"
    }
  } else {
    println "Params is null"
  }
}

myMethod(null)
```