/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author adrian.glapinski
 */
@Named(value = "chartBean")
@RequestScoped
public class ChartBean {

    private final LineChartModel lineChartModel;

    /**
     * Creates a new instance of ChartBean
     */
    public ChartBean() {
        lineChartModel = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Sine");

        for (int i = 0; i <= 360; i += 10) {
            series1.set(i, sin(Math.toRadians(i)));
        }

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Cosine");

        for (int i = 0; i <= 360; i += 10) {
            series2.set(i, cos(Math.toRadians(i)));
        }

        lineChartModel.addSeries(series1);
        lineChartModel.addSeries(series2);
        lineChartModel.setTitle("Sine and Cosine");
        lineChartModel.setLegendPosition("e");
        lineChartModel.setZoom(true);

        Axis xAxis = lineChartModel.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(360);
        xAxis.setTickInterval("10");

        Axis yAxis = lineChartModel.getAxis(AxisType.Y);
        yAxis.setMin(-1);
        yAxis.setMax(1);
    }

    /**
     * @return the model
     */
    public LineChartModel getLineChartModel() {
        return lineChartModel;
    }

}
