execution_context = [:]
node ("master") {
    git.checkout()
    unit_test()
    static_security_test()
    package_software()
}