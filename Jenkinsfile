pipeline {
   agent any
 stages {
    stage('Bulid') {
      steps {
        withMaven(maven : 'maven_3_6_0') {
        sh 'mvn clean complie'
        }
      }
    }
 
 }
}
