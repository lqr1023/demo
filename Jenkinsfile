node{
	stage('check'){
		echo 'checking out the source'
		checkout scm
	}
	stage('Build'){
		echo 'Building....'
		bat 'mvn compile'
	}
	stage('Test'){
		echo 'Testing....'
		bat 'mvn test'
	}
	stage('Deploy'){
		if(currentBuild.result == null || currentBuild.result == 'SUCCESS'){
			echo 'Deploying'
		}
	}
}