package iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import iit.tn.mycv.R;
import iit.tn.mycv.iit.tn.mycv.ImageView.ImageAdapterDocker;
import iit.tn.mycv.iit.tn.mycv.ImageView.ImageAdapterPython;

public class dockerCertif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docker_certif);
        ViewPager v = findViewById(R.id.sliderDocker);
        ImageAdapterDocker img = new ImageAdapterDocker(this);
        v.setAdapter(img);

    }
}
