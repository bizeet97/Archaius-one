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
       stage ('Deploy'){
            steps{
              withCredentials([usernamePassword(credentialsId: 'XFS_Deployment', passwordVariable: 'pass', usernameVariable: 'userId')]) {
                    sh "cd target;ls"
                    sh label: '', script:'curl -u $userId:$pass  http://ec2-52-66-245-186.ap-south-1.compute.amazonaws.com:8080/manager/text/undeploy?path=/Backend_XFS'
                    sh label: '', script: 'curl -u  $userId:$pass --upload-file target/xfs-0.0.1-SNAPSHOT.war http://ec2-52-66-245-186.ap-south-1.compute.amazonaws.com:8080/manager/text/deploy?config=file:/var/lib/tomcat8/xfs-0.0.1-SNAPSHOT.war\\&path=/Backend_XFS'
            }
        }

    }
}


}

