 package sylvain.advancedlayoutapp.fr.advancedlayoutapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Fragment;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void onAddFragment(View view) {
        //Instantciation du fragment
        FragmentB fragmentB = new FragmentB();
        //Récupération d'une instance du gestionnaire de fragment
         FragmentManager manager = getFragmentManager();
         //Début de la transaction
         FragmentTransaction transaction = manager.beginTransaction();
         transaction.add(R.id.fragmentContainer, fragmentB);
         transaction.commit();
     }
 }
