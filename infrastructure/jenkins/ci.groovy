pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                sh """
                    cd src
                    test -f index.html
                """
            }
        }
    }
}
