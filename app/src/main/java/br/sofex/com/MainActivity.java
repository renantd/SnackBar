package br.sofex.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button Btn_Executar;
    Button BtnUp;
    Button BtnDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BtnUp = findViewById(R.id.BtnUp);
        BtnDown = findViewById(R.id.BtnDonw);
        BtnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SnacbarMsg("Error !" , "#268FAC" , "#FFFFFF" ,1);
            }
        });
        BtnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SnacbarMsg("Error !" , "#268FAC" , "#FFFFFF" ,0);
            }
        });


        Btn_Executar = findViewById(R.id.Btn_Executar);
        Btn_Executar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //SnacbarMsgSucesso("Operação Realizada Com Sucesso !" , "#268FAC" , "#FFFFFF");
                SnacbarMsg("Error !" , "#268FAC" , "#FFFFFF" ,0);
            }
        });

    }
    public void SnacbarMsg(String Mensagem , String CorTextoCode , String CorBackgroundCode , int UpOrDownSide){
        Snackbar snackbar = Snackbar.make(MainActivity.this.findViewById(android.R.id.content), Mensagem, Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.BLUE);

        // Change the Snackbar default text color
        View snackbarView = snackbar.getView();
        TextView tv = snackbarView.findViewById(com.google.android.material.R.id.snackbar_text);

        //Acrescenta Icone
        //tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.delete_icon, 0, 0, 0);
            //FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)snackbarView.getLayoutParams();
            //params.gravity = Gravity.TOP;
            //snackbarView.setLayoutParams(params);

        if(UpOrDownSide == 1){
            FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)snackbarView.getLayoutParams();
            params.gravity = Gravity.TOP;
            snackbarView.setLayoutParams(params);

            tv.setTextColor(Color.parseColor(CorTextoCode));
            tv.setTextSize(18);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            // Change the Snackbar default background color
            snackbarView.setBackgroundColor(Color.parseColor(CorBackgroundCode));
            snackbar.show();
        }else{
            tv.setTextColor(Color.parseColor(CorTextoCode));
            tv.setTextSize(18);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            // Change the Snackbar default background color
            snackbarView.setBackgroundColor(Color.parseColor(CorBackgroundCode));
            snackbar.show();
        }

    }
    public void SnacbarMsgErro(String Mensagem , String CorTextoCode , String CorBackgroundCode){
        Snackbar snackbar = Snackbar.make(MainActivity.this.findViewById(android.R.id.content), Mensagem, Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.BLUE);

        // Change the Snackbar default text color
        View snackbarView = snackbar.getView();
        TextView tv = snackbarView.findViewById(com.google.android.material.R.id.snackbar_text);

        //Acrescenta Icone
        tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.delete_icon, 0, 0, 0);

        tv.setTextColor(Color.parseColor(CorTextoCode));
        tv.setTextSize(18);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        // Change the Snackbar default background color
        snackbarView.setBackgroundColor(Color.parseColor(CorBackgroundCode));
        snackbar.show();
    }
    public void SnacbarMsgSucesso(String Mensagem , String CorTextoCode , String CorBackgroundCode){
        Snackbar snackbar = Snackbar.make(MainActivity.this.findViewById(android.R.id.content), Mensagem, Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.BLUE);

        // Change the Snackbar default text color
        View snackbarView = snackbar.getView();
        TextView tv = snackbarView.findViewById(com.google.android.material.R.id.snackbar_text);

        //Acrescenta Icone
        tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ok_icon, 0, 0, 0);

        tv.setTextColor(Color.parseColor(CorTextoCode));
        tv.setTextSize(18);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        // Change the Snackbar default background color
        snackbarView.setBackgroundColor(Color.parseColor(CorBackgroundCode));
        snackbar.show();
    }
}