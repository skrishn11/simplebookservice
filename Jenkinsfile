
node {
    
    stage "checkout"
    	checkout scm
    
    stage "build"
        
        sh "echo starting build"	
        sh "pack rebase shkrishnamoorthy/pksimages:simplebookservice --no-pull"
    
}