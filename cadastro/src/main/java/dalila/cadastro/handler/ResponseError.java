package dalila.cadastro.handler;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

/**
 *
 * @author dilaz
 */
public class ResponseError {

    @ApiModelProperty(value = "A data da ocorrência do erro (ANO-MES-DIA HORA:MINUTO:SEGUNDO)", required = true, example = "2019-01-01 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp = LocalDateTime.now();

    @ApiModelProperty(value = "Status sucesso", example = "success")
    private String status = "error";

    @ApiModelProperty(value = "Código de status HTTP", example = "400")
    private int statusCode = 400;

    @ApiModelProperty(value = "A mensagem de erro", example = "Não foi possível processar a operação solicitada..")
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
