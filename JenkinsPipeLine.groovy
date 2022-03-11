import java.sql.*;
import groovy.sql.Sql
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Build') {
            steps {
                echo 'Hello World Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello World Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Hello World Deploy'
            }
        }
        stage('Download') {
//            String GITHUB_ACCESS_TOKEN ="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"
//            String GITHUB_USERNAME = "BohdanChernov"
//            String REPOSITORY_NAME = "alarm"
             steps {
                 echo 'Hello World Download'
                 echo '========================='
                 sh 'printenv'
                 echo '========================='
//                 sh 'chmod +x gradlew'
//                 sh './gradlew run'
//                 script {
//                     scripts=load "app/src/main/groovy/Download.groovy"
//                 }
//                 sh 'git checkout'

                 sh 'echo $GIT_TOKEN'
                 /*
                 sh 'sudo git checkout master'
                 sh 'sudo git pull'
                 sh 'sudo git add files/.'
                 sh 'sudo git commit -m "added files"'
                 sh 'sudo git push https://BohdanChernov:$GIT_TOKEN@github.com/BohdanChernov/alarm.git --all'
                  */

                 echo 'Hello World Download Finish'
             }
        }
    }
}