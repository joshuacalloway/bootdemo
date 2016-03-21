#!/usr/bin/env sh

appname=bootdemo
rm -f ~/.aws/${appname}.pem
docker rm -f ${appname} || echo ""
docker run --name ${appname} -v ~/.aws:/root/.aws $appname $1
