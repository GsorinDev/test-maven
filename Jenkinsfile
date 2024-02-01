pipeline {
    agent any

    tools {
        maven 'Maven' // Assuming 'Maven' is the name you configured in Jenkins Global Tool Configuration
    }

    stages {
        stage('Run test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
    }
}