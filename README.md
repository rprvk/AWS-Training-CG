# AWS-Training-CG
#how to install Apache

sudo -i
yum install httpd
service httpd start
service httpd status
chkconfig httpd on
sh -c "echo 'Hello from gopal webserver' > /var/www/html/index.html"
cat /var/www/html/index.html
curl localhost
#how to add a external web page
 cd /var/www/html
wget https://www.free-css.com/assets/files/free-css-templates/download/page275/hangover.zip
ls
unzip hangover.zip
ls

#explanation
#we are going to install a packgae in linux
 yum install httpd
 #once i install the apache web server
 #i need to start the service
 service httpd start
 #to check the service
 service httpd status
 #to put the service in startup once you stop the server and start the service will be started autoamticatal
 chkconfig httpd on
 #we create an small web page
 sh -c "echo 'Hello from gopal webserver' > /var/www/html/index.html"
 #to check the content of webpage
 cat /var/www/html/index.html
 #to verfy the webpage using command line
 curl localhost
