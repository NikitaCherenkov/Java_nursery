Установить и удалить deb-пакет с помощью dpkg.

```
sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_27.3.1-1~ubuntu.22.04~jammy_amd64.deb
```
```
sudo dpkg -i docker-ce-cli_27.3.1-1~ubuntu.22.04~jammy_amd64.deb
```
```
sudo dpkg -r docker-ce-cli
```