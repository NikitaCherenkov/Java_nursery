Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.

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