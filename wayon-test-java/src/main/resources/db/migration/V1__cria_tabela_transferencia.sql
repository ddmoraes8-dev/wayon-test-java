CREATE TABLE transferencia
(
    id                 BIGINT AUTO_INCREMENT PRIMARY KEY,
    conta_origem       VARCHAR(20)    NOT NULL,
    conta_destino      VARCHAR(20)    NOT NULL,
    valor              DECIMAL(15, 2) NOT NULL,
    taxa               DECIMAL(15, 2) NOT NULL,
    data_transferencia DATE           NOT NULL,
    data_agendamento   DATE           NOT NULL
);