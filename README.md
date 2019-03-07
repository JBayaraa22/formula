# Томъёоны эмхтгэл
### Backend app : 
Python , Django дээр хөгжүүлсэн REST API.
https://github.com/JBayaraa22/formula-app-backend 
* Python 3.7.2  , virtualenv  хэрэгтэй
* Virtual environment үүсгээд requirement.txt файл дээрх сангуудыг суулгана. 
``` 
pip install -r requirement.txt 
```
* Дээрхи коммандыг ажиллуулахаасаа өмнө virtual environment activate хийсэн байх ёстой.

* Хүссэн өгөгдлийн сангаа ашиглаж болно .
 1. MySQL
 2. POSTGRE
 3. SQLITE 
 
 ** setttings.py** - дээр тохиргоогоо өөрчлөөд migration ажиллуулаад өгөгдлийн сан үүснэ
 
 * ``` python manage.py makemigration ```
 * ``` python manage.py migrate ``` гэж үүсгэнэ.
 
 * Migration ажиллуулсаны дараа
 * ``` python manage.py runserver ``` ажиллуулж серверээ асаана
 
 *And Good luck!
 
