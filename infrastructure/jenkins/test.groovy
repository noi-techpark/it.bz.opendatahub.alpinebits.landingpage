pipeline {
    agent any
    options {
        ansiColor('xterm')
    }
    environment {
        AWS_ACCESS_KEY_ID = credentials('aws_secret_key_id')
        AWS_SECRET_ACCESS_KEY = credentials('aws_secret_access_key')
        AWS_S3_BUCKET = "alpinebits.lp-test"
        LOCAL_PATH = "./src"
    }
    stages {
        stage('Test') {
            steps {
                sh """
                    cd $LOCAL_PATH
                    test -f index.html
                """
            }
        }
        stage('Upload') {
            steps {
                s3Upload(bucket: "${AWS_S3_BUCKET}", acl: 'PublicRead', file: "${LOCAL_PATH}")
            }
        }
    }
}
