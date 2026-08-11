pipeline {
    agent {
        docker {
            image 'java-jdk17'
        }
    }
    stages {
        stage('Clone') {
            agent {
                docker {
                    image 'java-jdk17'
                }
            }
            steps {
                echo 'Cloning'
            }
        } 
        stage('Scanning') {
            agent {
                label 'java'
            }
            steps {
                echo '${env.BUILD_NUMBER}'
            }
        }  
        stage('Build') {
            agent {
                label 'maven'
            }
            steps {
                echo 'Building the code'
            }
        } 
        stage('Deploy') {
            agent any
            steps {
                echo 'Deploying the code'
            }
        } 
    }
}