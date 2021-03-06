package com.burmesesubtitle.app;

public class Config {

    // copy your api url from php admin dashboard & paste below
    public static final String API_SERVER_URL = "https://app.burmesesubtitles.com/appbackend/rest-api/";

    //copy your api key from php admin dashboard & paste below
    public static final String API_KEY = "mtf32vjgdxqx1r28zre5c8lo";

    //copy your terms url from php admin dashboard & paste below
    public static final String TERMS_URL = "https://app.burmesesubtitles.com/backend/terms/";

    //youtube video auto play
    public static boolean YOUTUBE_VIDEO_AUTO_PLAY = false;

    //enable external button on player
    public static final boolean ENABLE_EXTERNAL_PLAYER = false;

    //default theme
    //default theme
    public static boolean DEFAULT_DARK_THEME_ENABLE = true;

    // First, you have to configure firebase to enable facebook, phone and google login
    // facebook authentication
    public static final boolean ENABLE_FACEBOOK_LOGIN = true;

    //Phone authentication
    public static final boolean ENABLE_PHONE_LOGIN = true;

    //Google authentication
    public static final boolean ENABLE_GOOGLE_LOGIN = true;
}
