package com.blac.model;

import com.blac.model.DetalleInspeccion;
import com.blac.model.EstadoSolicitud;
import com.blac.model.Servicio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-03T16:29:33")
@StaticMetamodel(SolicitudInspeccion.class)
public class SolicitudInspeccion_ { 

    public static volatile SingularAttribute<SolicitudInspeccion, String> latitud;
    public static volatile SingularAttribute<SolicitudInspeccion, String> longitud;
    public static volatile SingularAttribute<SolicitudInspeccion, Integer> idSolicitudInspeccion;
    public static volatile SingularAttribute<SolicitudInspeccion, Date> fechaSolicitud;
    public static volatile SingularAttribute<SolicitudInspeccion, Integer> idUsuario;
    public static volatile SingularAttribute<SolicitudInspeccion, Servicio> idServicio;
    public static volatile CollectionAttribute<SolicitudInspeccion, DetalleInspeccion> detalleInspeccionCollection;
    public static volatile SingularAttribute<SolicitudInspeccion, EstadoSolicitud> idEstadoSolicitud;

}