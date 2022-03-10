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

//                 sh 'chmod +x gradlew'
//                 sh './gradlew run'
//                 script {
//                     scripts=load "app/src/main/groovy/Download.groovy"
//                 }
//                 sh 'git checkout'
                 sh 'git checkout master'
                 sh 'git add files/.'
                 sh 'git commit -m "added files"'

//                 sh 'git push https://<GITHUB_ACCESS_TOKEN>@github.com/<GITHUB_USERNAME>/<REPOSITORY_NAME>.git'
//                 sh 'git push https://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@github.com/BohdanChernov/alarm.git HEAD:master'
//                 sh 'git push https://github.com/BohdanChernov/alarm.git'
//                 sh 'git remote set-url origin https://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@github.com/BohdanChernov/alarm.git'

//                 sh 'git push origin master'
                 echo 'Hello World Download Finish'
             }
        }
    }
}