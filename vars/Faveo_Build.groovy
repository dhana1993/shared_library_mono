def call(){
    sh ''' sudo npm run build && cd dist && jar -cvf NewFaveo.war *  '''
}