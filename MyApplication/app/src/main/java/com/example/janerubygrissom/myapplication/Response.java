package com.example.janerubygrissom.myapplication;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Random;

public class Response extends AppCompatActivity {

    TextView textView;
    String text;
    ImageView image;
    Button share;
    Button goBack;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        text = intent.getStringExtra("RobertZimmerman");
        image = (ImageView) findViewById(R.id.neils);

        share = (Button) findViewById(R.id.ic_menu_share);
        share.setBackground(getDrawable(android.R.drawable.ic_menu_share));

        share.setOnClickListener(new View.OnClickListener() {
            //gets text and sends through the intent
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, textView.getText().toString());
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                }
            });

        final Button goBack = (Button) findViewById(R.id.askAgain);


        //when the button is clicked, enters next screen
        goBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(Response.this, MainActivity.class);
                startActivity(i);

            }
        });

        //executes the AsyncTask
        myTask.execute(text);

        Random random = new Random();
        int rn = random.nextInt(16 - 1 + 1) + 1;

        String url = "https://raw.githubusercontent.com/JaneRuby/Neils/master/"+rn+".png";
//        put url to load


        //check if picasso adds margins/padding and remove it

        Picasso.with(this)
                .load(url)
//                .resize(image.getWidth(), 0)
                .into(image);

 }

    AsyncTask<String, Void, String> myTask = new AsyncTask<String, Void, String>() {

        @Override
        protected String doInBackground(String... params) {

            //sends the text to "Watson", and "Watson" sends it back
            ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2016_07_11);
            service.setUsernameAndPassword("031b7c95-f0e9-4b88-95e9-a335fb2d458a", "o6C4mg67W2Xo");

            //"response" is JSON
            //TODO get "text"
            MessageRequest newMessage = new MessageRequest.Builder().inputText(params[0]).build();
            MessageResponse response = service.message("99905804-5260-4318-841f-5566bbd09fa9", newMessage).execute();
            Log.d("It worked", response + "");
            String string = "";

//            android.R.drawable.ic_menu_share

            try {
                JSONObject obj = new JSONObject(response.toString());
                JSONObject output = obj.getJSONObject("output");
                JSONArray array = output.getJSONArray("text");
                string = array.getString(0);
                Log.d("it works!", string);

            } catch (JSONException e) {
                //toast: no_network_connection, try again later
                e.printStackTrace();
            }

            return string;
        }

        @Override
        protected void onPostExecute(String aVoid) {
            super.onPostExecute(aVoid);
            textView.setText(aVoid);



        }
    };

}
