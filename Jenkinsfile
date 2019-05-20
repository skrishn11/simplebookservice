
node {
    
    stage "checkout"
    	checkout scm
    
    stage "build"
        
        sh "echo starting build **"	
        sh "pack build shkrishnamoorthy/pksimages:simplebookservice --no-pull --publish"
    
}