def call(){

    sh ''' sudo mkdir ${BACKUP_PATH} && cp ${FROM_PATH} ${BACKUP_PATH} '''

}