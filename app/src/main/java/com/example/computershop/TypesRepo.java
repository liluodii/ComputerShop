package com.example.computershop;


import java.util.ArrayList;
import java.util.List;

public class TypesRepo {
    //SINGLETON PATTERN
    private static TypesRepo instance = null;
    private List<types> customers = new ArrayList<>();

    private TypesRepo() //constructor
    {
       customers.add(new types(R.drawable.applelogo,1));
       customers.add(new types(R.drawable.delllogo,2));
       customers.add(new types(R.drawable.hplogo1,3));
       customers.add(new types(R.drawable.lenovologo,4));
       customers.add(new types(R.drawable.acerlogo,5));
       customers.add(new types(R.drawable.msilogo,6));
       customers.add(new types(R.drawable.micro,7));
       customers.add(new types(R.drawable.compaclogo,8));
       customers.add(new types(R.drawable.sonylogo,9));

    }
    public static TypesRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new TypesRepo();
        }
        return instance;
    }

    public void addCustomer(types types) {
        this.customers.add(types);
    }

    public List<types> getCustomers() {
        return this.customers;
    }

}
