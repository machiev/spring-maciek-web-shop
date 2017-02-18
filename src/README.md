Maven - debugging Jetty process
export MAVEN_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n"

TODO:
 * Add basket to a session
 * Add handling logic
    - add login visibility to views
    - add/remove from basket
    - add checkout logic
 * Add logout, add automatic redirection from login page to main page when user is already logged-in
 * Add DB
 * JSP interaction with servlet
 * bootstrap template
