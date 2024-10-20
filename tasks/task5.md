Выложить историю команд в терминале ubuntu

```
cat > "Домашние животные" <<EOL
Собаки
Кошки
Хомяки
EOL
```
```
cat > "Вьючные животные" <<EOL
Лошади
Верблюды
Ослы
EOL
```
```
cat "Домашние животные" "Вьючные животные" > combined
```
```
cat combined
```
```
mv combined "Друзья человека"
```
```
mkdir nursery && mv ./"Друзья человека" ./nursery/ && cd nursery
```
```
sudo wget -c https://dev.mysql.com/get/mysql-apt-config_0.8.33-1_all.deb
```
```
sudo dpkg -i mysql-apt-config_0.8.33-1_all.deb
```
```
sudo apt-get update
```
```
sudo apt-get install mysql-server
```
```
sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_27.3.1-1~ubuntu.22.04~jammy_amd64.deb
```
```
sudo dpkg -i docker-ce-cli_27.3.1-1~ubuntu.22.04~jammy_amd64.deb
```
```
sudo dpkg -r docker-ce-cli
```