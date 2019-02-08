pipeline {
   agent any
 stages {
    stage('Bulid') {
      steps {
        withMaven(maven : 'mav') {
        sh 'mvn clean complie'
        }
      }
    }
 
 }

}
