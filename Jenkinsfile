pipeline {
    agent none
    stages {
        stage('Clone') {
            agent {
                label 'maven'
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
                echo 'Scanning the code Test'
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
