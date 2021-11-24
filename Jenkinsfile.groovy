pipeline {
    agent any 
    stages{
        
        stage("Prapare"){
            echo "Preparing..."
            
        }
        stage("build"){
            echo "Building.."
            
        }
        stage("test"){
            echo "Testing..."
        }
        stage("deploy"){
            echo "Deploying"
            
        }
    }
    
    
}