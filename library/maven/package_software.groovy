void call(){
    stage("Maven: Package"){
        println "Packaging the Software"
        execution_context.each{entry -> println "$entry.key: $entry.value"}
    }
}
