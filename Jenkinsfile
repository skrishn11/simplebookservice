
node {
    
    stage 'checkout'
    	checkout scm
    
    stage build
    	sh "sudo docker login -u 'shkrishnamoorthy' -p 'Un1que234\$' " 
            	
        sh "pack set-default-builder cloudfoundry/cnb:bionic"
            	
        sh "pack build shkrishnamoorthy/pksimages:simplebookservice --publish"
    
}