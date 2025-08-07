# Книжный интернет-магазин «Москва» <a href="https://www.moscowbooks.ru"> 
<img src="images/logo.png" width="200" >

## 📔 Содержание:
- Технологии и инструменты
- Реализованные проверки
- Сборка в Jenkins
- Запуск автотестов
- Allure отчет
- Уведомления в Telegram
- Видео выполнения тестов на Selenoid

## 🛠 Технологии и инструменты: 

| Java | IntelliJ <br> Idea | GitHub | JUnit <br> 5 | Gradle | Selenide | Selenoid | Alurre <br> Report | Jenkins | Telegram | TestOps |
|------|--------------------|--------|--------------|--------|----------|----------|--------------------|---------|----------|---------|
|[<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="50" height="50" />](https://www.java.com) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="50" height="50" />](https://www.jetbrains.com/idea/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="50" height="50" />](https://github.com) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="50" height="50" />](https://junit.org/junit5/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="50" height="50" />](https://gradle.org) | [<img src="images/Selenide.svg" width="50" height="50" />](https://selenide.org) | [<img src="images/Selenoid.svg" width="50" height="50" />](https://aerokube.com/selenoid/) | [<img src="images/Allure_Report.svg" width="50" height="50" />](https://docs.qameta.io/allure/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" />](https://www.jenkins.io) | [<img src="images/Telegram.svg" width="50" height="50" />](https://telegram.org) | [<img src="images/TestOps.svg" width="50" height="50" />](https://telegram.org) |
          
## ☑️ Реализованные проверки:

- Проверка заголовка на главной странице  
- Проверка раздела "О компании"
- Проверка раздела "Разработка ПО"
- Проверка раздела "Работа у нас"
- Проверка вакансии "Тестировщик ПО"
- Проверка раздела "Филиалы"
- Проверка филиала "Москва"

## <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" /> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/HomeWork14/)
<p align="center">
<img src="images/screenshot_jenkins.png">
</p> 

### Параметры сборки в Jenkins:
- browser (браузер chrome)
- browser_version (версия браузера 127.0)
- screen_resolution (разрешение экрана 1920x1080)

## ▶️ Запуск автотестов

### Запуск тестов из терминала

```bash
gradle clean test
```

### Запуск тестов на удаленном браузере

```bash
-Dbrowser=${BROWSER}
-Dscreen_resolution=${SCREEN_RESOLUTION}
-Dbrowser_version=${BROWSER_VERSION}
```

## <img src="images/Allure_Report.svg" width="50" height="50" /> [Allure Report](https://jenkins.autotests.cloud/job/HomeWork14/allure/)
### Overview
<p align="center">  
<img src="images/Jenkins.png">
</p>  

### Тест-кейсы
<p align="center">  
<img src="images/screenshort_allureReport.png">
</p>  

## <img src="images/Telegram.svg" width="40" height="40" /> Уведомления в Telegram с использованием бота
<p align="center">  
<img src="images/telegramBot.png" width="500">
</p>  

## <img src="images/Selenoid.svg" width="50" height="50" /> Примеры видео выполнения тестов на Selenoid
<p align="center">  
<img src="images/video.gif" width="900">
</p>
