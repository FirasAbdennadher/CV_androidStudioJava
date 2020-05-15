package iit.tn.mycv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BioFragment extends Fragment implements View.OnClickListener {
    private Button linkedin;
View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        view=inflater.inflate(R.layout.fragment_bio,container,false);
        linkedin=(Button)view.findViewById(R.id.linkedin);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.linkedin:
                ouvirLinkedIn();
        }
    }

    private void ouvirLinkedIn() {
        String profile_url = "https://www.linkedin.com/in/firas-abdennadher/";
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url));
            intent.setPackage("com.linkedin.android");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url)));
        }

    }
}
