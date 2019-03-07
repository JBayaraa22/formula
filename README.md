# Томъёоны эмхтгэл
### Backend app : 
Python , Django дээр хөгжүүлсэн REST API.
[Git repo](https://github.com/JBayaraa22/formula-app-backend) 
* Python 3.7.2  , virtualenv  хэрэгтэй
* Git-с project - оо татаж авна.
* Virtual environment үүсгээд requirement.txt файл дээрх сангуудыг суулгана. 
``` 
pip install -r requirement.txt 
```
* Дээрхи коммандыг ажиллуулахаасаа өмнө virtual environment activate хийсэн байх ёстой.

* Хүссэн өгөгдлийн сангаа ашиглаж болно .
 1. MySQL
 2. POSTGRE
 3. SQLITE 
 4. MSSQL
 
 **setttings.py** - дээр тохиргоогоо өөрчлөөд migration ажиллуулаад өгөгдлийн сан үүснэ
 
 ``` python manage.py makemigration ```
  ``` python manage.py migrate ``` гэж үүсгэнэ.
 
 * Migration ажиллуулсаны дараа  ``` python manage.py runserver ``` ажиллуулж серверээ асаана
 
 *And Good luck!
 

### Frontend application
AngularJS  , Angular material ашигласан
[Git repo](https://github.com/JBayaraa22/formula-front-end)
* NodeJS суулгана [NodeJS web](https://nodejs.org/en/) LTS (Long term support) version-г татаж суулгаарай. Recommended
* Angular CLI суулгана ``` npm i @angular/cli ```
* Git-с pull хийж аваад ```npm update``` гэж сангуудыг татна.
* Татсаны дараа ``` ng serve ``` гэж серверээ асааж ашиглана.
