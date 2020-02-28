package springbootwebmongo.registro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "factura")
public class factura {
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

}
