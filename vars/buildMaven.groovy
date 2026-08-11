// vars/buildMaven.groovy
def call(String golas = 'clean install' boolean skipTests = true) {
    echo "Starting maven building process........"

    String mvnCommand = "mvn ${goals}"
    if (skipTests) {
        mvnCommand  += " -DskipTests"
    }
    
    sh mvnCommand

    echo "Maven build completed successfully with goals: ${goals}"
}