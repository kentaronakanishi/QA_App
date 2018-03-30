package jp.techacademy.kentaro.nakanishi.qa_app;

import java.io.Serializable;

public class Answer implements Serializable {
    private String mBody;
    private String mName;
    private String mUid;
    private String mAnswerUid;
    private String mFav;

    public Answer(String body, String name, String uid, String answerUid, String fav) {
        mBody = body;
        mName = name;
        mUid = uid;
        mAnswerUid = answerUid;
        mFav = fav;
    }

    public String getBody() {
        return mBody;
    }

    public String getName() {
        return mName;
    }

    public String getUid() {
        return mUid;
    }

    public String getAnswerUid() {
        return mAnswerUid;
    }

    public String getmFav() {
        return mFav;
    }
}