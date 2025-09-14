# 🏭 Simulação de Linha de Produção em Java

[![Java](https://img.shields.io/badge/Java-17+-blue)](https://www.oracle.com/java/) 
[![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)](https://github.com/seuusuario/ProjetoEngProcesso) 
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

---

## 🔹 Visão Geral
Projeto desenvolvido em **Java** aplicando **Programação Orientada a Objetos (POO)** para simular uma linha de produção industrial. Permite:

- Registro de tempos de operações
- Cálculo de eficiência global da linha
- Identificação de gargalos
- Planejamento de mão de obra baseada no volume de produção

Este projeto demonstra habilidades em **herança, polimorfismo e composição de objetos**, simulando situações reais de engenharia de produção.

---

## ⚙️ Funcionalidades Principais

| Módulo | Descrição |
|--------|-----------|
| **Operações & Postos** | Criação de operações e agrupamento em postos de trabalho; cálculo de tempo total |
| **Linha de Produção** | Composição de postos; cálculo de eficiência e identificação de gargalos |
| **Registro & Relatórios** | Registro de tempos observados; geração de médias e tempos padrões |
| **Planejamento de Mão de Obra** | Cálculo de colaboradores necessários conforme volume planejado |
| **POO Aplicada** | Herança (`ElementoProducao`), Polimorfismo (métodos genéricos), Composição (linha → postos → operações) |

---

## 🗂 Estrutura do Projeto

ProjetoEngProcesso/
├── app/ # Classe principal (Testes)
├── model/ # Modelos de domínio (Operacao, PostoDeTrabalho, LinhaDeProducao)
├── service/ # Serviços auxiliares (Cronoanalisador, PlanejadorMaoDeObra)
└── README.md


---

## 🚀 Tecnologias e Conceitos

- Java 17+
- Listas (`java.util.List`)
- POO: **Herança**, **Polimorfismo**, **Composição**
- Conceitos de Engenharia de Produção aplicados à programação
- Boas práticas de **código limpo** e **documentação contextualizada**

---

## 🏃 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seuusuario/ProjetoEngProcesso.git

2. Abra o projeto em sua IDE favorita (IntelliJ, Eclipse, VS Code).

3. Execute a classe principal:
java ProjetoEngProcesso.app.TesteService

4. Confira no console os relatórios de tempos, eficiência da linha e planejamento de mão de obra.

🤝 Contribuição

Pull requests e issues são bem-vindos. Sinta-se à vontade para sugerir melhorias, novas funcionalidades ou correções.

👨‍💻 Autor

Eduardo Fonseca
Desenvolvedor Backend Java | Engenheiro de Produção