package med.voll.api.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
        @NotBlank(message = "Login é Obrigatório!!!")
        String login,
        @NotBlank(message = "Senha é Obrigatório!!!")
        String senha
) {
}