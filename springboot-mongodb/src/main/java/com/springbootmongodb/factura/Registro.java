package com.springbootmongodb.factura;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "registro")
public class Registro {

    @Id
    private String _id;
    public String orderId;
    public String region;
    public String country;
    public String itemType;
    public String saleChannel;
    public String orderDate;
    public String shipDate;
    public String orderPriority;
    public Number unitsSold;
    public Number unitsPrice;
    public Number unitsCost;
    public Number totalRevenue;
    public Number totalCost;
    public Number totalProfit;

   /* @Override
    public String toString() {
        return "Registro{" +
                "OrderId='" + OrderId + '\'' +
                ", Region='" + Region + '\'' +
                ", Country='" + Country + '\'' +
                ", ItemType=" + ItemType + '\'' +
                ", SaleChannel=" + SaleChannel + '\'' +
                ", OrderDate=" + OrderDate + '\'' +
                ", ShipDate=" + ShipDate + '\'' +
                ", OrderPriority=" + OrderPriority + '\''+
                ", UnitsSold=" + UnitsSold + '\''+
                ", UnitsPrice=" + UnitsPrice + '\'' +
                ", UnitsCost=" + UnitsCost + '\'' +
                ", TotalRevenue=" + TotalRevenue + '\'' +
                ", TotalCost=" + TotalCost + '\''+
                ", TotalProfit=" + TotalProfit +
                '}';
    }*/

}
