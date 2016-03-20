
rm -f ~/.aws/bootdemo.pem
docker run -v ~/.aws:/root/.aws bootdemo
#docker run -e TF_VAR_appname=bootdemo -v ~/.aws:/root/.aws bootdemo
