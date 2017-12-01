node{
	stage('check'){
		echo 'checking out the source'
		checkout scm
	}
	stage('Build'){
		echo 'Building....'
		bat 'mvn compile'
		bat 'mvn clean package'
	}
	stage('Test'){
		echo 'Testing....'
	}
	stage('Deploy'){
		echo 'Deploying'
	}
}