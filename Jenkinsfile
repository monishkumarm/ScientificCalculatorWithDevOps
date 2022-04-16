pipeline {
     environment{
        dockerImage =''
    }
    agent any

    stages {
        stage('Git Clone') {
            steps {
                echo 'Cloning from monishkumarm/ScientificCalculatorWithDevOps'
                git 'https://github.com/monishkumarm/ScientificCalculatorWithDevOps'
            }
        }
        stage('Maven Build') {
            steps {
              script{
                  echo 'Maven Build'
                  sh 'mvn clean install'
                }
            }
        }
        stage('Docker Build Image') {
            steps {
                script{
                  dockerImage = docker.build("monishkumarm/scientificcalculatorwithdevops:latest")
                }
            }
        }
        stage('Docker Push Image') {
            steps {
                script{
                    docker.withRegistry('','dockercredentials'){
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Ansible pull docker image'){
            steps{
                ansiblePlaybook becomeUser: null, colorized: true, installation: 'Ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/ScientificCalculatorWithDevOps-deploy.yml', sudoUser: null
            }
        }
    }
}
