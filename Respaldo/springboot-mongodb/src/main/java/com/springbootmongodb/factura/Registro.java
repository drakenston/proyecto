package com.springbootmongodb.factura;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "registro")
public class Registro {

    @Id
    public String _id;
    public String OrderId;
    public String Region;
    public String Country;
    public String ItemType;
    public String SaleChannel;
    public String OrderDate;
    public String ShipDate;
    public String OrderPriority;
    public Double UnitsSold;
    public Double UnitsPrice;
    public Double UnitsCost;
    public Double TotalRevenue;
    public Double TotalCost;
    public Double TotalProfit;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
