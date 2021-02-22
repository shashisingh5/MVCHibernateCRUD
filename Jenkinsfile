node{
stege('SCM Checkout')
{
git 'https://github.com/shashisingh5/MVCHibernateCRUD'

}
stage('compile-package')
{
def javahome=tool name: 'JAVAHOME', type: 'jdk'
sh "${javahome}/bin/jar -cvf com.hotel.war *"

}



}
