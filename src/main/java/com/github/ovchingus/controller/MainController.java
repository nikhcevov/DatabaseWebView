package com.github.ovchingus.controller;

import com.github.ovchingus.dao.*;
import com.github.ovchingus.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    private final EmployeesDAO employeesDAO;

    private final EmployeesInfoDAO employeesInfoDAO;

    private final CustomersDAO customersDAO;

    private final OrderDetailsDAO orderDetailsDAO;

    private final OrdersDAO ordersDAO;

    private final ProductsDAO productsDAO;

    private final ProductDetailsDAO productDetailsDAO;

    private final StocksDAO stocksDAO;


    @Autowired
    public MainController(EmployeesDAO employeesDAO, EmployeesInfoDAO employeesInfoDAO,
                          CustomersDAO customersDAO, OrderDetailsDAO orderDetailsDAO,
                          OrdersDAO ordersDAO, ProductsDAO productsDAO,
                          ProductDetailsDAO productDetailsDAO, StocksDAO stocksDAO) {
        this.employeesDAO = employeesDAO;
        this.employeesInfoDAO = employeesInfoDAO;
        this.customersDAO = customersDAO;
        this.orderDetailsDAO = orderDetailsDAO;
        this.ordersDAO = ordersDAO;
        this.productsDAO = productsDAO;
        this.productDetailsDAO = productDetailsDAO;
        this.stocksDAO = stocksDAO;
    }

    @RequestMapping("/employees")
    public String showEmployees(Model model) {

        List<Employees> employees = employeesDAO.getEmployees();
        model.addAttribute("employees", employees);
        return "employees";
    }

    @RequestMapping("/employeesinfo")
    public String showEmployeesInfo(Model model) {
        List<EmployeesInfo> employeesInfo = employeesInfoDAO.getEmployeesInfo();
        model.addAttribute("employeesInfo", employeesInfo);
        return "employeesInfo";
    }

    @RequestMapping("/customers")
    public String showCustomers(Model model) {
        List<Customers> customers = customersDAO.getCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @RequestMapping("/orderdetails")
    public String showOrderDetails(Model model) {
        List<OrderDetails> orderDetails = orderDetailsDAO.getOrderDetails();
        model.addAttribute("orderDetails", orderDetails);
        return "orderDetails";
    }

    @RequestMapping("/orders")
    public String showOrders(Model model) {
        List<Orders> orders = ordersDAO.getOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @RequestMapping("/productdetails")
    public String showProductDetails(Model model) {
        List<ProductDetails> productDetails = productDetailsDAO.getProductDetails();
        model.addAttribute("productDetails", productDetails);
        return "productDetails";
    }

    @RequestMapping("/products")
    public String showProducts(Model model) {
        List<Products> products = productsDAO.getProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @RequestMapping("/stocks")
    public String showStocks(Model model) {
        List<Stocks> stocks = stocksDAO.getStocks();
        model.addAttribute("stocks", stocks);
        return "stocks";
    }


}
