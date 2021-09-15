def call(){
    checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: "${BRANCH_NAME}"]], extensions: [], userRemoteConfigs: [[credentialsId: 'globalservices', url: "${GIT_URL}"]]]

}