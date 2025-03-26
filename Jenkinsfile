pipeline{
    agent any
    stages{
        stage('clone repository'){
            steps{
                git branch: 'main' , url: "https://github.com/SidduGogi/skilltest2.git"
            }
        }
        stage('compile java'){
            steps{
                bat 'javac student_enroll.java'
            }
        }
        stage('run java'){
            steps{
                bat 'java student_enroll'
            }
        }
    }
}