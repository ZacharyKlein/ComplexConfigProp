import com.ociweb.PropObject
import com.ociweb.PropValue
import grails.core.GrailsApplication

class BootStrap {

    GrailsApplication grailsApplication

    def init = { servletContext ->

        def propMap = grailsApplication.config.getProperty('propMap.contents')

        println propMap.each { k, v ->
            println k.toString() + " " + k.class.name //TODO: This should be com.ociweb.PropObject, not java.lang.String
            println v.toString() + " " + v.class.name
        }

    }
    def destroy = {
    }
}
