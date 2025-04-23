# 🌦️ Kotlin Weather App

A simple weather application built with Kotlin and Retrofit for Android. This app allows users to enter a city name and retrieve the current weather data from the OpenWeatherMap API.

## 🚀 Features
- Fetch current temperature and weather condition
- Clean, minimal UI using Android XML layouts
- Retrofit and Gson integration for REST API calls
- Easy-to-read Kotlin code with basic MVVM structure

---

## 🧰 Prerequisites

- [Android Studio](https://developer.android.com/studio) installed
- Kotlin 1.9+ and SDK 34
- An API Key from [OpenWeatherMap](https://home.openweathermap.org/api_keys)

---

## 🔧 Installation Steps

1. **Clone or Download this repository**

   ```bash
   git clone https://github.com/yourusername/Kotlin-WeatherApp.git
   cd Kotlin-WeatherApp
   ```

2. **Open the project in Android Studio**
   - Click **"Open"**, select the root `WeatherApp` folder

3. **Add your OpenWeatherMap API Key**
   - In `MainActivity.kt`, replace:
     ```kotlin
     private val apiKey = "YOUR_API_KEY"
     ```
     with your actual API key:
     ```kotlin
     private val apiKey = "abc123yourrealapikey"
     ```

4. **Build and run the app**
   - Click **Run ▶️** in Android Studio
   - Enter a city name like "Mumbai"
   - Tap "Get Weather" to view live data

---

## 📁 Project Structure

```
WeatherApp/
├── app/
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/com/example/weatherapp/
│           │   └── MainActivity.kt
│           └── res/layout/
│               └── activity_main.xml
├── build.gradle (Project)
└── app/build.gradle
```

---

## 🛠️ Built With

- [Kotlin](https://kotlinlang.org/)
- [Retrofit](https://square.github.io/retrofit/)
- [Gson](https://github.com/google/gson)
- [OpenWeatherMap API](https://openweathermap.org/api)

---


## 📜 License

This project is open-source and free to use for educational purposes.

---

> Made with ❤️ using Kotlin
