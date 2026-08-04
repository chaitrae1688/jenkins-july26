pipeline {
    agent none
    stages {
        stage('Clone') {
            agent any
            steps {
                echo 'Cloning'
            }
        } 
        stage('Scanning') {
            agent any
            steps {
                echo 'Scanning the code'
            }
        }  
        stage('Build') {
            agent any
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