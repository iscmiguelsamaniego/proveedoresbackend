package org.samtech.backendproveedores.dto;

public class DatosdelSistemaDto {
    private Long id;

    private String msgalusuario;

    private String version;

    public DatosdelSistemaDto(Long id, String msgalusuario, String version) {
        this.id = id;
        this.msgalusuario = msgalusuario;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgalusuario() {
        return msgalusuario;
    }

    public void setMsgalusuario(String msgalusuario) {
        this.msgalusuario = msgalusuario;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
