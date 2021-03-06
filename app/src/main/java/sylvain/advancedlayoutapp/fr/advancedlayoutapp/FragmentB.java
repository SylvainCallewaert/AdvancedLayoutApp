package sylvain.advancedlayoutapp.fr.advancedlayoutapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sylvain.advancedlayoutapp.fr.advancedlayoutapp.model.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    private Fragment myself = this;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_b2, container, false);
        Button btDelete = view.findViewById(R.id.btFragmentDelete);
        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getFragmentManager().beginTransaction().remove(myself).commit();
            }
        });

        //Affichage du nom de l'utilisateur
        TextView myTextVieux = view.findViewById(R.id.textViewFragmentB);
        //definition du texte  dans le fragment
        DrawerActivity parent = (DrawerActivity) getActivity();
        myTextVieux.setText(parent.getUser().getUsername());

        return view;
    }

}
