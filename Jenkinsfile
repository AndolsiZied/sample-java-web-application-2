pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B --fail-never clean test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn -B clean package -DskipTests'
                // archiveArtifacts artifacts: 'target/**.war', fingerprint: true, onlyIfSuccessful: true
            }
        }
    }
}
