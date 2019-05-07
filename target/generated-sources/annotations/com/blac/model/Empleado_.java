package com.blac.model;

import com.blac.model.DetalleCuentas;
import com.blac.model.RangoEmpleado;
import com.blac.model.RolEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-07T14:17:31")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile CollectionAttribute<Empleado, DetalleCuentas> detalleCuentasCollection;
    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleado, Integer> estadoEmpleado;
    public static volatile SingularAttribute<Empleado, Integer> idUsuario;
    public static volatile SingularAttribute<Empleado, RangoEmpleado> idRangoEmpleado;
    public static volatile SingularAttribute<Empleado, RolEmpleado> idRolEmpleado;

}