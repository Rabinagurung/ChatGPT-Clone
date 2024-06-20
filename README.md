# ChatGPT Clone

**ChatGPT Clone** An advanced Android application that simulates a conversational AI experience similar to OpenAI's ChatGPT. Built with Kotlin and utilizing the MVVM (Model-View-ViewModel) architecture to ensure a clean and scalable codebase.

## Introduction

**ChatGPT Clone**is an Android application designed to provide users with an interactive chatbot experience. This application leverages modern Android development practices and integrates seamlessly with API services to deliver dynamic and responsive conversations. The app is structured using the MVVM architecture to maintain a clear separation of concerns and ensure the app is scalable and easy to maintain.
<p align="center">
  <img src="https://firebasestorage.googleapis.com/v0/b/food-app-9e90b.appspot.com/o/Chatgpt%2Fchat_blank.png?alt=media&token=90cf5866-c8ff-4e77-bc4f-918206028ea8" alt="Chat Screen" width="200" style="margin-right: 10px;" />
  <img src="https://firebasestorage.googleapis.com/v0/b/food-app-9e90b.appspot.com/o/Chatgpt%2Fchat_typoing.png?alt=media&token=a6f26efe-d460-46ab-bb12-2b3fab8512f5" alt="Chat Send" width="200" style="margin-right: 10px;" />
  <img src="https://firebasestorage.googleapis.com/v0/b/food-app-9e90b.appspot.com/o/Chatgpt%2Fchat.png?alt=media&token=6148e098-aceb-4e0c-a0b5-a06343f5eb25" alt="Ai response" width="200" style="margin-right: 10px;" />
</p>

## Features

**ChatGPT Clone** offers a robust set of features to simulate a chat with an AI model, enhancing the user’s interactive experience:

- **Real-time Conversations:** Engage in seamless and dynamic conversations with the AI, mimicking a real chat experience.
- **API Integration:** Connects with a backend service using Retrofit to fetch responses and handle chat interactions.
- **Local Data Persistence:** Uses Room to store chat history locally, allowing users to revisit previous conversations even when offline.
- **User-friendly Interface:** Designed with an intuitive UI to make interactions with the AI smooth and enjoyable.
- **MVVM Architecture:** Ensures a clean and maintainable codebase by separating the app into distinct layers.

## Technologies Used

- Frontend: Kotlin, Android SDK
- Architecture: MVVM (Model-View-ViewModel)
- Networking: Retrofit for API calls
- Coroutines: For asynchronous programming and handling network calls efficiently.
- Local Database: Room
- UI Components: XML layouts

## Getting Started

To get started with ChatGPT clone, follow these steps:

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/Chatgpt.git
    ```
2. Open the project in Android Studio.

3. Set up API key:
- Obtain an API key from your preferred news API provider.
- Add the API key and baes url to the gradle.properties file:
    ```properties
    API_KEY=your_api_key_here
    BASE_URL=your_api_base_url_here   ## I am using hugging face AI 
    ```
4. Build and Run:
- Sync the project with Gradle files.
- Build and run the app on your Android device or emulator.

##  Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please create a new issue or submit a pull request.

1. Fork the repository.
2. Create a new branch for your feature or bugfix:
    ```bash
    git checkout -b feature/your-feature-name
    ```
3. Commit your changes:
    ```bash
    git commit -m "Add your message here"
    ```
4. Push to the branch:
    ```bash
    git push origin feature/your-feature-name
    ```
5. Open a pull request.
   
## License

This project is licensed under the MIT License. See the LICENSE file for details.

Feel free to customize this template to better fit your project's specifics. The links to images and other placeholders should be replaced with actual content related to your application.
