pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
                sh 'springboot-web-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}