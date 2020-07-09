void call(){
    stage("Maven: Unit Test"){
        println "Unit testing the java software"
        execution_context["unit_tested"] = true
    }
}
