<img src="https://raw.githubusercontent.com/JaneRuby/Neils/master/logo.png" width="100px"/> <img src="https://raw.githubusercontent.com/JaneRuby/Neils/master/logo.png" width="100px"/> <img src="https://raw.githubusercontent.com/JaneRuby/Neils/master/logo.png" width="100px"/>

# AskNeil: an app experience

AskNeil combines the IBM Watson Conversation API with original artwork and design to create a Neil Diamond-themed advice app. When opened, the app prompts the user to ask the Neil bot something about love or music. Using cloud-based pre-programming through IBM's Watson service, the bot interprets the question through natural language processing and responds with a Neil Diamond-themed answer. The app displays one of several hand-drawn Neils with the answer, and the user can share the response on social media or return to the original prompt. The user can also view fun facts about Neil Diamond at the prompt screen.

The app provides a kitsch and design-oriented update to AskJeeves, providing a unique and memorably interactive user experience. Based on user reviews, most advice apps are difficult and uninteresting. AskNeil focuses on being fun and funny. So while the user will not get something of depth and substance out of the responses, they may smile or laugh, and share that experience with their friends or family. Beyond a humor-app, AskNeil also works as an art object, communicating artistic nuances to the user.

I built the app in Android Studio, using Picasso for the Neil illustrations, and the IBM Watson Conversation API for the Neil bot. IBM’s Watson technology uses natural language processing to build and train a bot. To simulate conversation with Neil Diamond, I define bot inputs called intents and entities, and bot outputs called dialogs. The Watson technology interprets the user input and sends it to my bot input, which then returns my bot output. For example, I might define an intent for “love”, which the technology might match if the user inputs “heart”; for this intent, I could associate an output from a Neil Diamond quote or lyric, which would return to user.


