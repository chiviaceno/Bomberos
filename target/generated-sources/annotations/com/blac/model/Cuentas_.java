package com.blac.model;

import com.blac.model.DetalleCuentas;
import com.blac.model.TipoCuenta;
import com.blac.model.TipoDocumento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-29T16:55:51")
@StaticMetamodel(Cuentas.class)
public class Cuentas_ { 

    public static volatile SingularAttribute<Cuentas, Integer> ingresoPermiso;
    public static volatile SingularAttribute<Cuentas, Date> fecha;
    public static volatile CollectionAttribute<Cuentas, DetalleCuentas> detalleCuentasCollection;
    public static volatile SingularAttribute<Cuentas, Integer> idPermiso;
    public static volatile SingularAttribute<Cuentas, TipoDocumento> idTipoDocumento;
    public static volatile SingularAttribute<Cuentas, Integer> valor;
    public static volatile SingularAttribute<Cuentas, Integer> idCuenta;
    public static volatile SingularAttribute<Cuentas, TipoCuenta> idTipoCuenta;
    public static volatile SingularAttribute<Cuentas, String> totalCuenta;
    public static volatile SingularAttribute<Cuentas, String> detalle;

}