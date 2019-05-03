package com.blac.model;

import com.blac.model.DetallePermiso;
import com.blac.model.EstadoInspeccion;
import com.blac.model.Inspeccion;
import com.blac.model.SolicitudInspeccion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-29T16:55:51")
@StaticMetamodel(DetalleInspeccion.class)
public class DetalleInspeccion_ { 

    public static volatile SingularAttribute<DetalleInspeccion, Date> fechaInspeccion;
    public static volatile SingularAttribute<DetalleInspeccion, SolicitudInspeccion> idSolicitudInspeccion;
    public static volatile SingularAttribute<DetalleInspeccion, Integer> idDetalleInspeccion;
    public static volatile SingularAttribute<DetalleInspeccion, Inspeccion> idInspeccion;
    public static volatile SingularAttribute<DetalleInspeccion, EstadoInspeccion> idEstadoInspeccion;
    public static volatile CollectionAttribute<DetalleInspeccion, DetallePermiso> detallePermisoCollection;

}