package com.blac.model;

import com.blac.model.Cuentas;
import com.blac.model.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-03T16:29:33")
@StaticMetamodel(DetalleCuentas.class)
public class DetalleCuentas_ { 

    public static volatile SingularAttribute<DetalleCuentas, Empleado> idEmpleado;
    public static volatile SingularAttribute<DetalleCuentas, Integer> idDetalleCuentas;
    public static volatile SingularAttribute<DetalleCuentas, String> valorTotal;
    public static volatile SingularAttribute<DetalleCuentas, String> totalEgreso;
    public static volatile SingularAttribute<DetalleCuentas, Cuentas> idCuenta;
    public static volatile SingularAttribute<DetalleCuentas, String> totalCuenta;

}