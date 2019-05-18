
node {
    
    stage "checkout"
    	checkout scm
    
    stage "build"
            	
        sh "pack set-default-builder cloudfoundry/cnb:bionic"
            	
        sh "pack build shkrishnamoorthy/pksimages:simplebookservice --publish"
    
}