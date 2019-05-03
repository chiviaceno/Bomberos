package com.blac.model;

import com.blac.model.DetalleInspeccion;
import com.blac.model.Permisos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-03T16:29:33")
@StaticMetamodel(DetallePermiso.class)
public class DetallePermiso_ { 

    public static volatile SingularAttribute<DetallePermiso, DetalleInspeccion> idDetalleInspeccion;
    public static volatile SingularAttribute<DetallePermiso, Permisos> idPermiso;
    public static volatile SingularAttribute<DetallePermiso, Date> fechaExpiracion;
    public static volatile SingularAttribute<DetallePermiso, Integer> idDetallePermiso;

}