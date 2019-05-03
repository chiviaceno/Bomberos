package com.blac.model;

import com.blac.model.Cuentas;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-03T16:29:33")
@StaticMetamodel(TipoCuenta.class)
public class TipoCuenta_ { 

    public static volatile SingularAttribute<TipoCuenta, String> nombreTipoCuenta;
    public static volatile CollectionAttribute<TipoCuenta, Cuentas> cuentasCollection;
    public static volatile SingularAttribute<TipoCuenta, Integer> idTipoCuenta;

}