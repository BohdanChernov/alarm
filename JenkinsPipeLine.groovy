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
             steps {
                 echo 'Hello World Download'

//                 sh 'chmod +x gradlew'
//                 sh './gradlew run'
//                 script {
//                     scripts=load "app/src/main/groovy/Download.groovy"
//                 }

                 sh 'git add files/.'
                 sh 'git commit -m "added files"'
                 sh 'git push origin master'
                 echo 'Hello World Download Finish'
             }
        }
    }
}