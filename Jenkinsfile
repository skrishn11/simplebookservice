pipeline {

    agent any
	
	stages {
    	stage('Checkout code') {
        	steps {
            	checkout scm
            	sh "echo pack build-push complete"
        	}
        }
    }
    
}