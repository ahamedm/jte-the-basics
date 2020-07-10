allow_scm_jenkinsfile = false
skip_default_checkout = true
keywords{
    additionalParams = []
}
libraries{
    merge=true
    git
    shiftleft
    maven{
        override=true
        dockerServer='tcp://192.168.0.140:2375'
    }
}
