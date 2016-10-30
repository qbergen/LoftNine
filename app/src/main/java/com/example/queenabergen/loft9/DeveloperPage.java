package com.example.queenabergen.loft9;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DeveloperPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_page);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.move_up);
        ImageView imageView = (ImageView) findViewById(R.id.developer_anim);
        imageView.setImageResource(R.drawable.splashscreen);
        imageView.setAnimation(anim);

        final ImageView queenaphoto = (ImageView) findViewById(R.id.Queenas_Photo);
        Picasso.with(getApplicationContext()).load(R.drawable.cueforfranklin).into(queenaphoto);
    }
}
