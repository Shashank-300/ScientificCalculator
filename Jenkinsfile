pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = 'Scientific-Calculator'
        GITHUB_REPO_URL = 'https://github.com/Shashank-300/ScientificCalculator.git'
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        sh 'docker tag Scientific-Calculator Shashank-300/scientific-calculator:latest'
                        sh 'docker push Shashank-300/scientific-calculator:latest'
                    }
                }
            }
        }
        stage('Deploy with Ansible') {
            steps {
                script {
                    sh 'ansible-playbook -i inventory deploy.yml'
                }
            }
        }
    }
}
