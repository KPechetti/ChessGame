package com.example.anil6066.chessgame;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int SIDE =8;
    private ButtonGridAndTextView tttView;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_main);
        Point size = new Point( );
        getWindowManager().getDefaultDisplay( ).getSize( size );
        int w = size.x / SIDE;
        ButtonHandler bh = new ButtonHandler( );
        tttView = new ButtonGridAndTextView( this, w, SIDE, bh );
        //tttView.setStatusText( game.result( ) );
        setContentView(tttView );
    }

    public void highlightKingMove(View v, int crtRow, int crtColumn) {
        //add your code below
        if(v.getTag() == "bk") {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow,crtColumn,Color.BLUE);

            tttView.setButtonColor(crtRow+1,crtColumn-1,Color.GREEN);
            tttView.setButtonColor(crtRow+1,crtColumn+1,Color.GREEN);
            tttView.setButtonColor(crtRow+1,crtColumn,Color.GREEN);
            tttView.setButtonColor(crtRow,crtColumn+1,Color.GREEN);
            tttView.setButtonColor(crtRow,crtColumn-1,Color.GREEN);

        }
        else{
            tttView.resetButtons();
            tttView.setButtonColor(crtRow,crtColumn,Color.BLUE);

            tttView.setButtonColor(crtRow-1,crtColumn-1,Color.GREEN);
            tttView.setButtonColor(crtRow-1,crtColumn+1,Color.GREEN);
            tttView.setButtonColor(crtRow-1,crtColumn,Color.GREEN);
            tttView.setButtonColor(crtRow,crtColumn+1,Color.GREEN);
            tttView.setButtonColor(crtRow,crtColumn-1,Color.GREEN);
        }
    }
    public void highlightQueenMove(View v,int crtRow,int crtColumn)
    {
        //add your code below
        if(v.getTag() == "bq") {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            for(int i=1; i<=7; i++)
                tttView.setButtonColor(i,crtColumn,Color.GREEN);
            for(int i=0; i<=7; i++)
                if(i!=crtColumn)
                tttView.setButtonColor(crtRow,i,Color.GREEN);
            tttView.setButtonColor(crtRow+1,crtColumn-1,Color.GREEN);
            tttView.setButtonColor(crtRow+1,crtColumn+1,Color.GREEN);
            tttView.setButtonColor(crtRow+2,crtColumn-2,Color.GREEN);
            tttView.setButtonColor(crtRow+3,crtColumn-3,Color.GREEN);
            tttView.setButtonColor(crtRow+2,crtColumn+2,Color.GREEN);
            tttView.setButtonColor(crtRow+3,crtColumn+3,Color.GREEN);
            tttView.setButtonColor(crtRow+4,crtColumn+4,Color.GREEN);
        }
        else
        {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            for(int i=0; i<7; i++)
                tttView.setButtonColor(i,crtColumn,Color.GREEN);
            for(int i=0; i<=7; i++)
                if(i!=crtColumn)
                    tttView.setButtonColor(crtRow,i,Color.GREEN);
            tttView.setButtonColor(crtRow-1,crtColumn-1,Color.GREEN);
            tttView.setButtonColor(crtRow-1,crtColumn+1,Color.GREEN);
            tttView.setButtonColor(crtRow-2,crtColumn-2,Color.GREEN);
            tttView.setButtonColor(crtRow-3,crtColumn-3,Color.GREEN);
            tttView.setButtonColor(crtRow-2,crtColumn+2,Color.GREEN);
            tttView.setButtonColor(crtRow-3,crtColumn+3,Color.GREEN);
            tttView.setButtonColor(crtRow-4,crtColumn+4,Color.GREEN);
        }
    }
    public void highlightBishopMove(View v,int crtRow,int crtColumn)
    {
        //add your code below
        if(v.getTag() == "bb") {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            if(crtColumn == 2)
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==1&&j==1) || (i==2&&j==0) || (i==1&&j==3) || (i==2&&j==4) || (i==3&&j==5) || (i==4&&j==6) || (i==5&&j==7))
                        tttView.setButtonColor(i, j, Color.GREEN);
                    }

            else
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==1&&j==4) || (i==2&&j==3) || (i==3&&j==2) || (i==4&&j==1) || (i==5&&j==0) || (i==1&&j==6) || (i==2&&j==7))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }
        }
        else
        {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            if(crtColumn == 2)
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==6&&j==1) || (i==5&&j==0) || (i==6&&j==3) || (i==5&&j==4) || (i==4&&j==5) || (i==3&&j==6) || (i==2&&j==7))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }

            else
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==6&&j==4) || (i==5&&j==3) || (i==4&&j==2) || (i==3&&j==1) || (i==2&&j==0) || (i==6&&j==6) || (i==5&&j==7))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }
        }

    }

    public void highlightKnightMove(View v,int crtRow,int crtColumn)
    {
        //add your code below
        if(v.getTag() == "bn") {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            if(crtColumn == 1)
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==2&&j==0) || (i==2&&j==2) || (i==1&&j==3))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }

            else
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==2&&j==5) || (i==2&&j==7) || (i==1&&j==4))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }
        }
        else
        {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            if(crtColumn == 1)
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==5&&j==0) || (i==5&&j==2) || (i==6&&j==3))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }

            else
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (i==5&&j==5) || (i==5&&j==7) || (i==6&&j==4))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }
        }


    }
    public void highlightRookMove(View v,int crtRow,int crtColumn)
    {
        //add your code below
        if(v.getTag() == "br") {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            if(crtColumn == 0)
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (j==0 || i==0) && !(i==0 && j ==0) )
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }

            else
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (j==7 || i==0) && !(i==0 && j ==7))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }
        }
        else
        {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            if(crtColumn == 0)

                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if ((j == 0 || i == 7) && !(i == 7 && j == 0))
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }
            else
                for (int i = 0; i <= 7; i++)
                    for (int j = 0; j <= 7; j++) {
                        if( (j==7 || i==7) && !(i==7 && j ==7) )
                            tttView.setButtonColor(i, j, Color.GREEN);
                    }
        }

    }
    public void highlightPawnMove(View v,int crtRow,int crtColumn)
    {
        //add your code below
        if(v.getTag() == "bp") {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
                for (int i = 2; i <= 3; i++)
                    tttView.setButtonColor(i, crtColumn , Color.GREEN);
        }
        else
        {
            tttView.resetButtons();
            tttView.setButtonColor(crtRow, crtColumn, Color.BLUE);
            for (int i = 4; i <= 5; i++)
                tttView.setButtonColor(i, crtColumn , Color.GREEN);

        }
    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick( View v ) {
            //add your code below
            for(int row = 0; row < SIDE ; row++) {
                for (int col = 0; col < SIDE; col++) {
                    if(tttView.isButton((ImageButton)v,row,col))
                    {
                        if(v.getTag().toString().equals("bk") || v.getTag().toString().equals("wk"))
                        {
                            highlightKingMove(v,row,col);
                        }

                        if(v.getTag().toString().equals("bq") || v.getTag().toString().equals("wq"))
                        {
                            highlightQueenMove(v,row,col);
                        }

                        if(v.getTag().toString().equals("bp") || v.getTag().toString().equals("wp"))
                        {
                            highlightPawnMove(v,row,col);
                        }

                        if(v.getTag().toString().equals("bb") || v.getTag().toString().equals("wb"))
                        {
                            highlightBishopMove(v,row,col);
                        }

                        if(v.getTag().toString().equals("bn") || v.getTag().toString().equals("wn"))
                        {
                            highlightKnightMove(v,row,col);
                        }

                        if(v.getTag().toString().equals("br") || v.getTag().toString().equals("wr"))
                        {
                            highlightRookMove(v,row,col);
                        }
                    }
                }
            }
        }
        }
    }

    // add more functions if needed

