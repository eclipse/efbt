pipeline {
    agent any
    tools {
        maven 'apache-maven-latest'
        jdk 'temurin-jdk21-latest'
    }
    stages {
        stage('Build') {
            steps {
                sh '''                                     
                    cd regdna/eclipse_model
					mvn install
					cd ../..
					cd regdna/dsl/org.eclipse.efbt.regdna.dsl.parent
					mvn install
					cd ../../..
					cd regpot_desktop/components
					mvn install
					cd ../..  
					cd sirius_ui
					mvn install
					cd ..
					cd regpot_desktop/installation
					mvn install
					cd ../..
					
                '''
            }
        }
        stage('Deploy') {
	      steps {
	        sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
	          sh '''
	            ssh genie.efbt@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/efbt/1.4.0   
	            ssh genie.efbt@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/efbt/1.4.0            	            	         
	            scp -r regpot_desktop/installation/releng/org.eclipse.efbt.repository/target/repository/* genie.efbt@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/efbt/1.4.0
	           '''
	        }
	      }
    }
    }
    post {
        // send a mail on unsuccessful and fixed builds
        unsuccessful { // means unstable || failure || aborted
            emailext subject: 'Build $BUILD_STATUS $PROJECT_NAME #$BUILD_NUMBER!', 
            body: '''Check console output at $BUILD_URL to view the results.''',
            recipientProviders: [culprits(), requestor()], 
            to: 'neil@birdsoftwaresolutions.com'
        }
        fixed { // back to normal
            emailext subject: 'Build $BUILD_STATUS $PROJECT_NAME #$BUILD_NUMBER!', 
            body: '''Check console output at $BUILD_URL to view the results.''',
            recipientProviders: [culprits(), requestor()], 
            to: 'neil@birdsoftwaresolutions.com'
        }
    }
}

