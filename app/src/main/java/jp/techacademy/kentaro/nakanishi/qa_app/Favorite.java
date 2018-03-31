package jp.techacademy.kentaro.nakanishi.qa_app;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by world_000 on 2018/03/31.
 */



public class Favorite {
    //お気に入りを保存する


    //何をしているか不明。dataを定義する
    Map<String, String> data = new HashMap<String, String>();

    public void saveFav(String name) {

        //クリックしたお気に入りボタンのユーザーidを取得する
        String userId = null;
        FirebaseAuth mAuth;
        FirebaseUser user = mAuth.getCurrentUser();
        String muid = user.get("uid");
        userId = muid;

        //クリックしたお気に入りボタンの質問idを取得する
        String questionId = null;
        Fire

        String uid = this.get("uid");
        questionId = uid;

        //クリックしたお気に入りボタンのユーザーと質問idを記載する
        DatabaseReference dataBaseReference = FirebaseDatabase.getInstance().getReference();
        DatabaseReference favRef = dataBaseReference.child(Const.FavoritePATH).child(String.valueOf(userId)).child(String.valueOf(questionId));
        favRef.push().setValue(data, this);


    }
}
