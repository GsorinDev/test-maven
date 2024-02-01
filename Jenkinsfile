node{
    agent any
    stage('Get from git project')
    {
        git 'https://github.com/GsorinDev/test-maven.git'
    }
    
    stage('Compile then package')
    {
        sh 'mvn package'
    }
}