package com.stephany.graphing;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LineChart mpLineChart;

    int colorArray[] = {R.color.color1, R.color.color2,R.color.color3,R.color.color4};
    int[] colorClassArray = new int[] {Color.BLUE,Color.CYAN, Color.GREEN, Color.MAGENTA};
    String[] legendName = {"Cow", "Dog", "Cat", "Rat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpLineChart=(LineChart) findViewById(R.id.line_chart);

        LineDataSet lineDataSet1 = new LineDataSet(dataValues1(),"First Run");
//        lineDataSet1.setMode(LineDataSet.Mode.CUBIC_BEZIER);
//        lineDataSet1.setCubicIntensity(0.1f);
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);

        mpLineChart.setBackgroundColor(Color.WHITE);
        mpLineChart.setNoDataText("No Data");
        mpLineChart.setNoDataTextColor(Color.BLUE);

        mpLineChart.setDrawGridBackground(true);  //draw grid

        mpLineChart.setDrawBorders(true);  //borders
        mpLineChart.setBorderWidth(2);

        //LINE FORMATTING
        lineDataSet1.setLineWidth(3);
        lineDataSet1.setColor(Color.MAGENTA);
        lineDataSet1.setDrawCircles(false);
        lineDataSet1.setDrawCircleHole(false);
//        lineDataSet1.setCircleColor(Color.BLACK);
//        lineDataSet1.setCircleHoleColor(Color.GRAY);
//        lineDataSet1.setCircleRadius(5);
//        lineDataSet1.setCircleHoleRadius(3);
//        lineDataSet1.setValueTextSize(10);
//        lineDataSet1.setValueTextColor(Color.BLACK);
//        lineDataSet1.enableDashedLine(5,10,0);
//        lineDataSet1.setColors(colorArray,MainActivity.this);

        //LEGEND FORMATTING
        Legend legend = mpLineChart.getLegend();
        legend.setEnabled(true);
        legend.setTextColor(Color.BLACK);
        legend.setTextSize(20);
        legend.setForm(Legend.LegendForm.LINE);   //legend icon
        legend.setFormSize(20);
//        legend.setXEntrySpace(5);  //space between two legends
        legend.setFormToTextSpace(10);  // space between icon and text

//        LegendEntry[] legendEntries = new LegendEntry[4];
//
//        for (int i=0; i<legendEntries.length; i++){
//            LegendEntry entry = new LegendEntry();
//            entry.formColor = colorClassArray[i];
//            entry. label = String.valueOf(legendName[i]);
//            legendEntries[i] = entry;
//        }

//        legend.setCustom(legendEntries);

        //DESCRIPTION
        Description description = new Description();
        description.setText("Direct Pulse Voltammetry");
        description.setTextColor(Color.BLACK);
        description.setTextSize(15);
        mpLineChart.setDescription(description);

        LineData data = new LineData(dataSets);
        mpLineChart.setData(data);

        mpLineChart.animateX(10000);
        mpLineChart.invalidate();
    }

    private ArrayList<Entry> dataValues1()
    {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(-0.0999451f,0.0000970627f));
        dataVals.add(new Entry(-0.0949097f,0.000134745f));
        dataVals.add(new Entry(-0.0898743f,0.000134595f));
        dataVals.add(new Entry(-0.0848389f,0.000133763f));
        dataVals.add(new Entry(-0.0798035f,0.000133063f));
        dataVals.add(new Entry(-0.0747681f,0.000132477f));
        dataVals.add(new Entry(-0.0697327f,0.000132005f));
        dataVals.add(new Entry(-0.0646973f,0.000131441f));
        dataVals.add(new Entry(-0.0596619f,0.00013098f));
        dataVals.add(new Entry(-0.0546265f,0.000130529f));
        dataVals.add(new Entry(-0.0495911f,0.00013006f));
        dataVals.add(new Entry(-0.0445557f,0.000129888f));
        dataVals.add(new Entry(-0.0395203f,0.000129506f));
        dataVals.add(new Entry(-0.0344849f,0.000129136f));
        dataVals.add(new Entry(-0.0294495f,0.000128828f));
        dataVals.add(new Entry(-0.0244141f,0.000128338f));
        dataVals.add(new Entry(-0.0193787f,0.000127938f));
        dataVals.add(new Entry(-0.0143433f,0.000127165f));
        dataVals.add(new Entry(-0.00930786f,0.000126725f));
        dataVals.add(new Entry(-0.00427246f,0.000126278f));
        dataVals.add(new Entry(0.000762939f,0.000126325f));
        dataVals.add(new Entry(0.00579834f,0.000125814f));
        dataVals.add(new Entry(0.0108337f,0.000125543f));
        dataVals.add(new Entry(0.0158691f,0.000124777f));
        dataVals.add(new Entry(0.0209045f,0.00012461f));
        dataVals.add(new Entry(0.0259399f,0.000124147f));
        dataVals.add(new Entry(0.0309753f,0.000123855f));
        dataVals.add(new Entry(0.0360107f,0.000123555f));
        dataVals.add(new Entry(0.0410461f,0.000123412f));
        dataVals.add(new Entry(0.0460815f,0.000123073f));
        dataVals.add(new Entry(0.0511169f,0.000122844f));
        dataVals.add(new Entry(0.0561523f,0.000122859f));
        dataVals.add(new Entry(0.0611877f,0.000122733f));
        dataVals.add(new Entry(0.0662231f,0.000122539f));
        dataVals.add(new Entry(0.0712585f,0.000122298f));
        dataVals.add(new Entry(0.0762939f,0.000122224f));

        return dataVals;
    }
}