
rm -f ~/.aws/bootdemo.pem
docker run -v ~/.aws:/root/.aws bootdemo $1
