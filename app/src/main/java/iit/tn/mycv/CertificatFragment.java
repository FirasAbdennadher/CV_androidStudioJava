package iit.tn.mycv;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses.BiCertif;
import iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses.Python_Certif;
import iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses.TensorCertif;
import iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses.angularCertif;
import iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses.dockerCertif;
import iit.tn.mycv.iit.tn.mycv.ImageView.iit.tn.mycv.CertifClasses.nvidiaCertif;

public class CertificatFragment extends Fragment {
View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_certificat,container,false);
        LinearLayout py =(LinearLayout) view.findViewById(R.id.img_python);
        LinearLayout angular =(LinearLayout) view.findViewById(R.id.img_angular);
        LinearLayout bi =(LinearLayout) view.findViewById(R.id.img_bi);
        LinearLayout nvidia =(LinearLayout) view.findViewById(R.id.img_nvidia);
        LinearLayout docker =(LinearLayout) view.findViewById(R.id.img_docker);
        LinearLayout tensor =(LinearLayout) view.findViewById(R.id.img_tensor);

        angular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        docker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), dockerCertif.class);
                startActivity(intent);

            }
        });

        tensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TensorCertif.class);
                startActivity(intent);

            }
        });

        angular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), angularCertif.class);
                startActivity(intent);
            }
        });


        nvidia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), nvidiaCertif.class);
                startActivity(intent);
            }
        });


        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BiCertif.class);
                startActivity(intent);

            }
        });




        py.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), Python_Certif.class);
            startActivity(intent);

        }
    });

        return view;
    }
}
