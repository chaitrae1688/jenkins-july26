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
        
        stage('checkout') {
            steps {
                gitCheckout('main', 'https://github.com/chaitrae1688/jenkins-july26.git')
            }
        }
        
        stage('Build Image') {
            steps {
                // Calling the custom step from vars/buildDocker.groovy
                buildDocker('my-webapp', 'v1.0.0')
            }
        }

         stage('Build Java App') {
            steps {
                buildMaven()
            }
        }
    }
    
    post {
        always {
            logMessage('Pipeline execution finished.')
        }
    }
}