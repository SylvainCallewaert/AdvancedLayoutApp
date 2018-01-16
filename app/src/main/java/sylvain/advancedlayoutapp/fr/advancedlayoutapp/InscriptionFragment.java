package sylvain.advancedlayoutapp.fr.advancedlayoutapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class InscriptionFragment extends Fragment {
    DrawerActivity parentActivity;
    EditText userNameEditText;


    public InscriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inscription, container, false);

        //récuperation d'une reference au champ formulaire
        userNameEditText = view.findViewById(R.id.userNameEditText);


        //Récupération d'une reference de l'activité
        parentActivity = (DrawerActivity) getActivity();

        //Gestion du clic sur le bouton valider
        Button btValid = view.findViewById(R.id.buttonInscription);
        btValid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Récupération de la saisi de l'utilisateur
                String userName = userNameEditText.getText().toString();
                //Récupération de l'utilisateur et modification du nom de l'utilisateur
                parentActivity.getUser().setUsername(userName);

                //Naviguer vers FragmentB en passant par l'activité parente
                parentActivity.goToFragmentB();
            }
        });
     return  view;
    }

}
