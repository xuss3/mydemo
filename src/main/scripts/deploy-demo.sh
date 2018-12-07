#!/bin/bash
SERVICE_NAME=demo
#以覆盖的方式解压文件到指定目录
unzip -o $HOME/upload/demo-0.0.1-SNAPSHOT-dev.zip -d $HOME/app/$SERVICE_NAME
cd $HOME/app/$SERVICE_NAME/scripts
./shutdown.sh
sleep 2
./startup.sh $1

