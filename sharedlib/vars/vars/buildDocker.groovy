// vars/buildDocker.groovy
def call(String imageName, String tag) {
    sh "echo 'Building Docker Image...'"
    sh "docker build -t ${imageName}:${tag} ."
    sh "echo 'Build successful for ${imageName}:${tag}'"
}