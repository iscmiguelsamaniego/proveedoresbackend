package org.samtech.backendproveedores.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "datosdelsistema")
public class DatosdelSistema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", name = "id")
    private Long id;

    @Column(name = "msg_al_usuario")
    private String msgAlUsuario;

    @Column(name = "version")
    private String version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgAlUsuario() {
        return msgAlUsuario;
    }

    public void setMsgAlUsuario(String msgAlUsuario) {
        this.msgAlUsuario = msgAlUsuario;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
