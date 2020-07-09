void call(){
    stage("Maven: Unit Test"){
        println "Unit testing the java software"
        sh 'mvn clean test'
    }
}
