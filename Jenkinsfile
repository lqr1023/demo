node{
	stage('check'){
		echo 'checking out the source'
		checkout scm
	}
	stage('Build'){
		echo 'Building....'
		bat 'mvn --version'
	}
	stage('Test'){
		echo 'Testing....'
	}
	stage('Deploy'){
		echo 'Deploying'
	}
}