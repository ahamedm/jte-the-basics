@Validate
void call(context){
    // define library configuration parameters
    String error_msg = """
    The parameters library needs keyword additionalParams to be defined in Jenkins Template:
        keywords{
            additionalParams = []
        }
    """
    try {
        additionalParams.getClass()
    } catch (exc) {
        error error_msg
    }
}