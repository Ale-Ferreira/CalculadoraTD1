pipeline {
  agent any
  options {
    skipDefaultCheckout(true)
  }
  stages {
    stage('Cloning from SCM') {
      steps {
        git(branch: 'master', url: 'ssh://git@github.com/JCastillo07/Romanos.git', credentialsId: 'Github')
        sh '''
          git checkout ${BRANCH_NAME}
          cd $(ls -d */|head -n 1)
          git pull
        '''
      }
    }

    stage('Build') {
      steps {
        sh '''chmod +x gradlew && ./gradlew clean build jacocoTestReport'''
      }
    }

    stage('Unit Test') {
      steps {        
        sh './gradlew test'
        sh 'touch build/test-results/test/*.xml'
      }
    }

    stage('SonarQube analysis') {
      steps {
        script{
          scannerHome = tool 'SonarQube Scanner'
        }
        withSonarQubeEnv('SonarQube Scanner') {
        sh "${scannerHome}/bin/sonar-scanner"
      }
      }
    }

  }
      post {
        always {
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/test-results/test/*.xml'
        }
    }
}
