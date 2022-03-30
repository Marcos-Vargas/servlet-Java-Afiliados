<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="sweetalert2.min.css">
</head>
<body>
    <div id="container1">
        <h4>Gestion de afiliados</h4>
        <div class="row">
            <div class="col-6">
                <label for="firstNames">Nombres</label>
                <input type="text" id="firstNames">
            </div>
            <div class="col-6">

                <label for="lastNames">Apellidos</label>
                <input type="text" id="lastNames">
            </div>
        </div>

        <div class="row">
            <div class="col-6">
                <label for="birthday">Fecha de nacimiento</label>
                <input type="date" id="birthday">
            </div>
            <div class="col-6">
                <label for="typeDoc">Tipo de documento</label>
                <select name="" id="typeDoc">
                    <option value="0">Seleccione el tipo de documento</option>
                    <option value="CC">CC</option>
                    <option value="TI">TI</option>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label for="numDoc">Numero de identificacion</label>
                <input type="text" id="numDoc">
            </div>

            <div class="col-6">
                <label for="department">Departamento</label>
                <select name="" id="department">
                    <option value="0">Elija un departamento</option>
                </select>
            </div>
        </div>

        <div class="row">
            <div class="col-6">
                <label for="town">Ciudad</label>
                <select name="" id="town">
                    <option value="0">Elija una ciudad</option>
                </select>
            </div>
            <div class="col-6">
                <label for="phone">Celular</label>
                <input type="text"  id="phone">
            </div>
        </div>
        <div class="row mt-3 mb-3  ">
            <div class="col-4 ">
                <button type="submit" id="submitbtn1">Agregar</button>
            </div>
            <div class="col-4">
                <button type="submit" id="btn-delete-affiliate">Eliminar</button>
            </div>
            <div class="col-4">
                <button type="submit" id="btn-update-affiliate">Actualizar</button>
            </div>
        </div>

    </div>
    <div id="container2">
        <h4>Gestion de equipos</h4>
        <div class="row">
            <div class="col col-6">
                <label for="teamName">Nombre del equipo</label>
                <input type="text" id="teamName">
            </div>
        </div>
        <div class="row">
            <div class="col col-6">
                <button type="button" id="btn-register-team">Registrar</button>
            </div>
            <div class="col col-6">
                <button type="button" id="btn-delete-team">Eliminar</button>
            </div>
            
        </div>
    </div>

    <div id="container3">
        <h4>Agregar personas a equipo</h4>
        <div class="row">
            <div class="col">
                <label for="idAffiliate">No de identificacion</label>
                <input type="text" id="idAffiliate">
            </div>
            <div class="col">
                <label for="teamChoose">Elija el equipo</label>
                <select name="" id="teamChoose">
                    <option value="0">Elija un equipo</option>
                </select>
            </div>
        </div>
        <div class="row">

        </div>
        <div class="row">
            <div class="col">
                <button type="submit" id="btn-enroll-affiliate-team">Registrar</button>
            </div>
            <div class="col">
                <button type="submit" id="btn-delete-affiliate-team">Eliminar registro</button>
            </div>
        </div>


    </div>

    <div id="container4">
        <h4>Gestion de eventos</h4>

        <div class="row">
            <div class="col col-6">
                <label for="eventName-c4">Nombre del evento</label>
                <input type="text" id="eventName-c4">
            </div>

            <div class="col col-6">
                <label for="select-ge-discipline">Seleccione la disciplina</label>
                <select name="" id="select-ge-discipline">
                    <option value="">Seleccione una disciplina</option>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="col col-6">
                <button id="btn-addEvent">Agregar</button>
            </div>

            <div class="col col-6">
                <button id="btn-deleteEvent" >Eliminar</button >
            </div>
           
        </div>

        
    </div>

    <div id="container5">
        <h4>Agregar equipos/participante a evento</h4>
        <div class="row">
            <div class="col col-6">
                <label for="select-eventDiscipline">Elija disciplina</label>
                <select name="" id="select-eventDiscipline">
                    <option value="">Elija una disciplina</option>
                </select>
            </div>
            <div class="col col-6">
                <label for="eventName">Nombre del evento</label>
                <select name="" id="name-event-results2">
                    <option value="">Seleccione el nombre del evento</option>
                </select>
            </div>
        </div>

        <div class="row">
            <div class="col col-12">
                <label for="nameTeam-enroll-event">Elija un equipo/integrante</label>
                <select name="" id="nameTeam-enroll-event">
                    <option value="">Elija el equipo</option>
                </select>
            </div>
            <div class="col col-12" >
                <label for="id-affiliate-enroll-event">No identificacion</label>
                <input type="text" id="id-affiliate-enroll-event">
            </div>
        </div>
 

        <div class="row">
            <div class="col col-6">
                <button type="submit" id="btn-add-team-person">Agregar</button>
            </div>
            <div class="col col-6">
                <button type="submit" id="btn-delete-team-person">Delete</button>
            </div>

        </div>
    </div>

    <div id="container6" >
        <h4>Asignacion de resultados</h4>
        <div class="row">
            <div class="col col-4">
                <label for="name-event-results">Evento</label>
                <select name="" id="name-event-results">
                    <option value="">Elija el evento</option>
                </select>
            </div>
            <div class="col col-4">
                <label for="name-team-results">Equipo/Integrante</label>
                <select name="" id="name-team-results">
                    <option value="">Elija el equipo/integrante</option>
                </select>
            </div>
            <div class="col col-4">
                <label for="rank-team-results">Puesto</label>
                <select name="" id="name-rank-results">
                    <option value="">Elija el puesto</option>
                </select>
            </div>

        </div>

        <div class="row">
            <div class="col col-6">
                <button type="button" id="btn-finish-results" > Terminar</button>
            </div>
            <div class="col col-6">
                <button type="button" id="btn-assign-results" > Asginar</button>
            </div>
        </div>
    </div>

    <div id="container7">
        <h4>Ver trayectoria</h4>
        <table>
            <thead>
                <h4>Tabla de resultados</h4>
                <tr>
                    <td><strong>Evento</strong></td>
                    <td><strong>Equipo</strong></td>
                    <td><strong>Puesto</strong></td>
                </tr>
            </thead>
            <tbody>

            </tbody>
            <tfoot></tfoot>
        </table>
    </div>
    <script src="./js/jQuery_3.4.1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="sweetalert2.all.min.js"></script>
    <script src="index.js"></script>

</body>
</html>