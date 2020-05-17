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
        view = inflater.inflate(R.layout.fragment_bio, container, false);
        linkedin = (Button) view.findViewById(R.id.linkedin);
        linkedin.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.linkedin:
                ouvirAccount("https://www.linkedin.com/in/firas-abdennadher/");
                break;
            case R.id.codeforces:
                ouvirAccount("http://codeforces.com/profile/firasabdennadher82");
                break;
            case R.id.github:
                ouvirAccount("https://github.com/FirasAbdennadher/");
                break;
        }
    }

    private void ouvirAccount(String profile_url) {
        //  String profile_url = "https://www.linkedin.com/in/firas-abdennadher/";
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(profile_url)));
    }

  /*  private void ouvirCodeForces() {
        String profile_url = "http://codeforces.com/profile/firasabdennadher82";
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url));
            intent.setPackage("com.codeforces.android");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url)));
        }

    }

    private void ouvirGitHub() {
        String profile_url = "https://github.com/FirasAbdennadher/";
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url));
            intent.setPackage("com.github.android");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url)));
        }

    }*/
}