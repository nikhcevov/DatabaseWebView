package com.github.ovchingus.controller;


import com.github.ovchingus.dao.IncomePerMonthViewDAO;
import com.github.ovchingus.model.IncomePerMonthView;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/charts")
public class ChartsController {

    private final IncomePerMonthViewDAO incomePerMonthViewDAO;

    @Autowired
    public ChartsController(IncomePerMonthViewDAO incomePerMonthViewDAO) {
        this.incomePerMonthViewDAO = incomePerMonthViewDAO;
    }

    @RequestMapping(value = "/piechart", method = RequestMethod.GET)
    public void drawPieChart(HttpServletRequest request,
                             HttpServletResponse response) {
        response.setContentType("image/png");
        PieDataset pdSet = createPieDataSet();

        JFreeChart chart = createPieChart(pdSet, "My Pie Chart");

        try {
            ChartUtilities.writeChartAsPNG(response.getOutputStream(), chart,
                    750, 400);
            response.getOutputStream().close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private PieDataset createPieDataSet() {
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("Mac", 20);
        dpd.setValue("Linux", 31);
        dpd.setValue("Window", 40);
        dpd.setValue("Others", 9);
        return dpd;
    }

    private JFreeChart createPieChart(PieDataset pdSet, String chartTitle) {

        JFreeChart chart = ChartFactory.createPieChart3D(chartTitle, pdSet,
                true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;
    }

    private JFreeChart createIncomePerMonthChart(DefaultCategoryDataset dataset, String charTitle) {
        JFreeChart chart = ChartFactory.createLineChart(charTitle,
                "Month", "Income",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 360));
        return chart;
    }

    private DefaultCategoryDataset createIncomePerMonthDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<IncomePerMonthView> list = incomePerMonthViewDAO.getIncomePerMonthView();

        int startMonth;
        if (list.size() > 6) {
            startMonth = list.size() - 6;
        } else startMonth = 0;

        for (int i = startMonth; i < list.size(); i++) {
            dataset.addValue(list.get(i).getIncome(), "Income", list.get(i).getDate());
        }

        return dataset;
    }

    @RequestMapping(value = "/incomepermonth", method = RequestMethod.GET)
    public void drawIncomePerMonthView(HttpServletRequest request,
                                       HttpServletResponse response) {
        response.setContentType("image/png");
        DefaultCategoryDataset dataset = createIncomePerMonthDataset();

        JFreeChart chart = createIncomePerMonthChart(dataset, "Income per last 6 months");

        try {
            ChartUtilities.writeChartAsPNG(response.getOutputStream(), chart,
                    750, 400);
            response.getOutputStream().close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
