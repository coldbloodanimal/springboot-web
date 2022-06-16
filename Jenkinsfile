pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
                sh 'chmod +x springboot-web-0.0.1-SNAPSHOT.jar'
                sh 'nohup java -jar springboot-web-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}
