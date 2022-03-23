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
                 echo 'Hello World Download1'

                 echo "env.BRANCH_NAME"
                 echo 'BUILD_NUMBER: ${BUILD_NUMBER}'
                 echo 'BRANCH_NAME: ${env.BRANCH_NAME}'
                 echo 'BRANCH: ${BRANCH}'

                 echo 'Hello World Download2'


                 sh 'sudo git checkout master'
                 sh 'sudo git pull'

//                 sh 'chmod +x gradlew'
//                 sh './gradlew run'

//                 sh 'java -jar app.jar'
                 sh './gradlew -v'

                 sh 'the_world_is_flat=true\n' +
                         '# ...do something interesting...\n' +
                         'if [ "$the_world_is_flat" = true ] ; then\n' +
                         '    echo \'Be careful not to fall off!\'\n' +
                         'fi'


                 sh 'sudo git add files/.'
//                 sh 'sudo git commit -m "added files"'
                 sh 'sudo git diff --quiet && sudo git diff --staged --quiet || sudo git commit -am \'Added license headers\''
                 sh 'sudo git push https://BohdanChernov:$GIT_TOKEN@github.com/BohdanChernov/alarm.git --all'
//                 sh 'sudo git checkout master'
//                 sh 'sudo git pull'


                 echo 'Hello World Download Finish'
             }
        }
    }
}