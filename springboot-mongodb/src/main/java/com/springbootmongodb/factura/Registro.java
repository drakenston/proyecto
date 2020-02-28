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
    public String _id;
    public String orderId;
    public String region;
    public String country;
    public String itemType;
    public String saleChannel;
    public String orderDate;
    public String shipDate;
    public String orderPriority;
    public Double unitsSold;
    public Double unitsPrice;
    public Double unitsCost;
    public Double totalRevenue;
    public Double totalCost;
    public Double totalProfit;

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
