@Library('chaitra-shared-library') _

pipeline {
    agent any
    
    stages {
        stage('Initialization') {
            steps {
                // Calling the custom step from vars/logMessage.groovy
                logMessage('Pipeline has started!')
            }
        }
        
        stage('Build Image') {
            steps {
                // Calling the custom step from vars/buildDocker.groovy
                buildDocker('my-webapp', 'v1.0.0')
            }
        }
    }
    
    post {
        always {
            logMessage('Pipeline execution finished.')
        }
    }
}