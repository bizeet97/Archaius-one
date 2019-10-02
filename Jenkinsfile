pipeline{
    agent any
    tools {
        
        maven 'mymaven' 
    }
    stages{
      stage ('build and test'){
            steps{
                
                    sh "mvn clean install -DskipTests"
                
            }
        }   
        
	    
	           stage('Sonar') 
         {
           environment {
           scannerHome=tool 'sonar scanner'
       }
            steps {
                sh "mvn sonar:sonar -Dsonar.host.url=http://3.14.251.87:9000"
            }
         }
          
    
        }
}
    

    
    




