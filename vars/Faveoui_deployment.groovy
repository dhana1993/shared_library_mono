def call(Map config = [:]){
sh'''
    /opt/wildfly/bin/jboss-cli.sh controller=10.91.10.162 -c --user=$WILDFLY_USR --password=$WILDFLY_PSW --commands="deploy dist/NewFaveo.war --force"
'''
}