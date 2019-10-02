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
                sh "mvn sonar:sonar -Dsonar.host.url=http://ec2-18-224-155-110.us-east-2.compute.amazonaws.com:9000"
            }
         }
          
    
        }
}
    

    
    




