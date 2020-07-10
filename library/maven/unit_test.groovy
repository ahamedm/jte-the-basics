void call(){
   stage("Maven: Unit Test"){
        println "Unit testing the java software"
        docker.withServer('tcp://192.168.0.140:2375') {
            docker.image('maven:3.6-adoptopenjdk-8').inside("--entrypoint=\'\' -v /home/ahamedm/.m2:/root/.m2") {
                /* do things */
                    sh 'mvn clean test'
            }        
        }
        execution_context["unit_tested"] = true
    }
}
