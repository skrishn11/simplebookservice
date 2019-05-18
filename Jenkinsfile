
node {
    
    stage "checkout"
    	checkout scm
    
    stage "build"
        
        sh "echo starting"
        sh 'docker login -u "shkrishnamoorthy" -p "Un1que234\$" '  	
        sh "pack build shkrishnamoorthy/pksimages:simplebookservice"
    
}