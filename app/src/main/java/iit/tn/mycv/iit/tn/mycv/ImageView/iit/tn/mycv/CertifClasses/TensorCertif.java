package iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import iit.tn.mycv.R;
import iit.tn.mycv.iit.tn.mycv.ImageView.ImageAdapterPython;
import iit.tn.mycv.iit.tn.mycv.ImageView.ImageAdapterTensor;

public class TensorCertif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tensor_certif);
        ViewPager v = findViewById(R.id.sliderTensor);
        ImageAdapterTensor img = new ImageAdapterTensor(this);
        v.setAdapter(img);

    }
}
