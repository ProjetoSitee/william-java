pipeline {
    agent any

    tools {
        jdk 'jdk21'
        maven 'maven3'
    }

    options {
        timestamps()
        disableConcurrentBuilds()
    }

    stages {
        stage('Checkout') {
            steps { checkout scm }
        }
        stage('Testes') {
            steps { sh 'mvn -B clean test' }
            post { always { junit 'target/surefire-reports/*.xml' } }
        }
        stage('Pacote') {
            steps { sh 'mvn -B package -DskipTests' }
            post { success { archiveArtifacts artifacts: 'target/*.jar', fingerprint: true } }
        }
        stage('Imagem') {
            when { branch 'main' }
            steps { sh 'docker build -t william-java:${BUILD_NUMBER} .' }
        }
    }

    post {
        success { echo 'Pipeline concluído com sucesso.' }
        failure { echo 'Pipeline falhou. Consulte o estágio destacado.' }
    }
}

