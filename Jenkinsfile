pipeline {

	environment {
    	registry = "shkrishnamoorthy/pksimages"
    	registryCredential = ‘DockerHub’
  	}
  	
    agent any
	
	stages {
    	stage('Checkout code') {
        	steps {
            	checkout scm
            	
            	/*sh "sudo docker login -u 'shkrishnamoorthy' -p 'Un1que234\$' " */
            	
        	}
        
        stage('Push image') {
        
			withCredentials([usernamePassword( credentialsId: 'DockerHub', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {

				sh "sudo docker login -u ${USERNAME} -p ${PASSWORD}"
			}
    	}
    }
    
}