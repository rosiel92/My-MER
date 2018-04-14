package br.com.maymer.mymer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class ImagemCom extends Activity{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_imagem_com);


        Intent in = getIntent();
        String tema = in.getStringExtra("tema");
        setTitle(tema);

        PhotoView photoView = (PhotoView) findViewById(R.id.imgCom);
        photoView.setImageResource(in.getIntExtra("imagem", 0));



    }
}
