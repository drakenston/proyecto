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
@Document(collection = "facturas")
public class factura {
    @Id
    public String _id;
    @NotNull
    public String OrderId;
    @NotNull
    public String Region;
    @NotNull
    public String Country;
    @NotNull
    public String ItemType;
    @NotNull
    public String SaleChannel;
    @NotNull
    public String OrderDate;
    @NotNull
    public String ShipDate;
    @NotNull
    public String OrderPriority;
    @NotNull
    public Double UnitsSold;
    @NotNull
    public Double UnitsPrice;
    @NotNull
    public Double UnitsCost;
    @NotNull
    public Double TotalRevenue;
    @NotNull
    public Double TotalCost;
    @NotNull
    public Double TotalProfit;

}
