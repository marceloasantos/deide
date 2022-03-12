pipeline {

    agent any

    stages {
    
        stage('Prepare environment') {
               
            steps {
                sh'''
                sudo apt update -y
                sudo amazon-linux-extras install docker
                sudo apt install docker
                sudo service docker start
                sudo usermod -a -G docker ec2-user
                '''
                
                sh'''
                sudo chmod 777 /var/run/docker.sock
                '''
               
            }
        }


        stage('Build') {

            steps {
                sh '''
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
