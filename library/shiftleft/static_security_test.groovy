void call(){
    stage("Shiftleft: Static Security Scan"){
        println "static application security test from the shiftleft library"
        execution_context["sast_scanned"] = true
        execution_context.each{entry -> println "$entry.key: $entry.value"}
    }
}
