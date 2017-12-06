node{
	stage('checkaaa'){
		echo 'checking out the source'
		bat 'git clone https://github.com/lqr1023/demo.git'
	}
	stage('Bbb'){
		echo 'Building....'
		bat 'mvn clean'
		bat 'mvn compile'
	}
	stage('Test'){
		echo 'Testing....'
		bat 'mvn test'
	}
	stage('Deploy'){
		if(currentBuild.result == null || currentBuild.result == 'SUCCESS'){
			echo 'Deploying'
			bat 'mvn package'
			bat 'mvn tomcat7:undeploy tomcat7:deploy'
		}
	}
}