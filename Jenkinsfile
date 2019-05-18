pipeline {

	environment {
    	registry = "shkrishnamoorthy/pksimages"
    	registryCredential = "DockerHub"
  	}
  	
    agent any
	
	stages {
    	stage('Checkout code') {
        	steps {
            	checkout scm
            	
            	//sh "sudo docker login -u 'shkrishnamoorthy' -p 'Un1que234\$' " 
            	
            	sh "pack set-default-builder cloudfoundry/cnb:bionic"
            	
            	sh "pack build shkrishnamoorthy/pksimages:simplebookservice --publish"
            	
        	}
        }
    }
    
}