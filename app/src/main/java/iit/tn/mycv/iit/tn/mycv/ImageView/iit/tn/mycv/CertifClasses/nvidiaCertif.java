package iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import iit.tn.mycv.R;
import iit.tn.mycv.iit.tn.mycv.ImageView.ImageAdapterNvidia;
import iit.tn.mycv.iit.tn.mycv.ImageView.ImageAdapterPython;

public class nvidiaCertif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvidia_certif);
        ViewPager v = findViewById(R.id.sliderNvidia);
        ImageAdapterNvidia img = new ImageAdapterNvidia(this);
        v.setAdapter(img);

    }
}
