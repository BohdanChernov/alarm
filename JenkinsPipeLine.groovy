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

                 sh 'sudo git checkout master'
                 sh 'sudo git pull'

//                 sh 'chmod +x gradlew'
//                 sh './gradlew run'

                 sh 'java -jar app.jar'


                 sh 'sudo git add files/.'
                 sh 'sudo git commit -m "added files"'
                 sh 'sudo git push https://BohdanChernov:$GIT_TOKEN@github.com/BohdanChernov/alarm.git --all'
                 sh 'sudo git checkout master'
                 sh 'sudo git pull'


                 echo 'Hello World Download Finish'
             }
        }
    }
}