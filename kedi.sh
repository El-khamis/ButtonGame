#!/bin/bash -e

KEDI=$RANDOM 
echo $KEDI
sudo docker run --name $KEDI ubuntu /bin/bash -c "apt-get update ; apt-get install -y git ; git clone http://github.com/El-khamis/ButtonGame ; cd ButtonGame ; chmod 777 build.sh ; ./build.sh"
sudo docker cp $KEDI:/ButtonGame . 
sudo docker rm $KEDI
