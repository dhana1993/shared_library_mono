def call(Map config = [:]){
    emailext body: "Hi team   \n Build is failed in  ${config.FAILED_STAGE} stage \n BUILD URL : ${BUILD_URL}  \n ",
            to: "${config.EMAIL_TO}",
            subject: 'Jenkins build information : $PROJECT_NAME - #$BUILD_NUMBER '
}