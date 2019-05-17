pipeline {

    agent any
	
	stages {
    	stage('Checkout code') {
        	steps {
            	checkout scm
            	
            	sh "sudo docker run hello-world"
            	
            	sh "echo pack build-push complete"
        	}
        }
    }
    
}