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
                  withCredentials([usernamePassword(credentialsId: 'bizeet_tomcat', passwordVariable: 'pass', usernameVariable: 'userId')]) {
        
                    // sh 'curl -u  $userId:$pass  http://ec2-13-235-99-141.ap-south-1.compute.amazonaws.com:8080/manager/text/undeploy?path=/Archaius'
                     //sh  'curl -v -u  $userId:$pass --upload-file target/basic-config-1.0.0-SNAPSHOT.war  http://ec2-13-235-99-141.ap-south-1.compute.amazonaws.com:8080/manager/text/deploy?config=file:/opt/tomcat/apache-tomcat-9.0.21/webapps/manager/Archaius/basic-config-1.0.0-SNAPSHOT.war\\&path=/Archaius'
                      
                    // sh 'curl -u  $userId:$pass  http://ec2-13-235-99-141.ap-south-1.compute.amazonaws.com:8080/manager/text/undeploy?path=/Bizeet_SpringBoot1'
                     sh  'curl -u  $userId:$pass --upload-file target/basic-config-1.0.0-SNAPSHOT.war http://ec2-13-235-99-141.ap-south-1.compute.amazonaws.com:8080/manager/text/deploy?config=file:/var/lib/tomcat9/basic-config-1.0.0-SNAPSHOT.war\\&path=/Archaius_1'
                 }
             }
    
         }
    }
         
        }
    

    
    




