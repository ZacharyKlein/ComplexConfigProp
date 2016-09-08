#Demonstration of issue with complex map keys in Grails config

Application will create a map with instances of `PropObject` as keys, and `PropValue` as values. Map is retrieved via `config.getProperty` in `Bootstrap.groovy`. The value and class name of each entry is printed out to stdout. Expected behavior is for the class names of the keys to be `com.ociweb.PropObject`, rather than `java.lang.String` (which is the current behavior).
 
It appears that the map keys' `toString` method is being called on all keys in `application.groovy`. 