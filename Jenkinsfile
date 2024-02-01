pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    def mavenHome = tool 'Maven'
                    if (isUnix()) {
                        sh "${mavenHome}/bin/mvn clean test"
                    } else {
                        bat "${mavenHome}\\bin\\mvn clean test"
                    }
                }
            }
        }

        stage('Build JAR') {
            steps {
                script {
                    def mavenHome = tool 'Maven'
                    if (isUnix()) {
                        sh "${mavenHome}/bin/mvn package"
                    } else {
                        bat "${mavenHome}\\bin\\mvn package"
                    }
                }
            }
        }
    }

    post {
        success {
            archiveArtifacts '**/target/*.jar'
        }
    }
}