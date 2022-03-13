pipeline {

    agent any

    stages {
    
        stage('Prepare environment') {
               
            steps {
                sh'''
                sudo apt-get update
                sudo apt-get install docker.io -y
                sudo systemctl start docker
                sudo usermod -a -G docker ubuntu
                '''
                
                sh'''
                sudo chmod 777 /var/run/docker.sock
                '''
               
            }
        }


        stage('Build') {

            steps {
                sh '''
                    mvn clean install
                    docker build -t springio/gs-spring-boot-docker .
                    '''
            }

        }
        
        
        stage('Deploy') {

            steps {
                sh '''
                    docker run springio/gs-spring-boot-docker
                    '''
            }

        }


    }

}
