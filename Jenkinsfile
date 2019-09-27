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

              stage ('Deploying War File'){
             steps{
                  withCredentials([usernamePassword(credentialsId: 'ashish_tomcat', passwordVariable: 'pass', usernameVariable: 'userId')]) {
        
                     sh 'curl -u  $userId:$pass  http://ec2-13-233-78-62.ap-south-1.compute.amazonaws.com:8080/manager/text/undeploy?path=/superemp'
                     sh  'curl -u  $userId:$pass --upload-file target/my-car-shop-${BUILD_NUMBER}.war http://ec2-13-233-78-62.ap-south-1.compute.amazonaws.com:8080/manager/text/deploy?config=file:/var/lib/tomcat8/my-car-shop-${BUILD_NUMBER}.war\\&path=/superemp'
                 }
             }
    
         }
    }
         
        }
    
    }
    
    




