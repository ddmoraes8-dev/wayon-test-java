CREATE TABLE taxa
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    dias_de         INT            NOT NULL,
    dias_ate        INT            NOT NULL,
    taxa_fixa       DECIMAL(15, 2) NOT NULL,
    taxa_percentual DECIMAL(5, 2)  NOT NULL
);