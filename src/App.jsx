import "./App.css";
import cameraImg from "./assets/Instalacao-de-Cameras-de-Seguranca.jpg";

function App() {
  // Descrição dos serviços prestados 
  const servicos = [
    {
      titulo: "Formatação de Computadores",
      descricao:
        "Melhoramos o desempenho da sua máquina com instalação e configuração completa do sistema.",
    },
    {
      titulo: "Instalação de Câmeras",
      descricao:
        "Instalação e configuração de câmeras de segurança para residências e empresas.",
    },
    {
      titulo: "Suporte em Sistemas",
      descricao:
        "Atendimento para correção de erros, configuração de programas e suporte técnico remoto ou presencial.",
    },
    {
      titulo: "Manutenção e Assistência",
      descricao:
        "Manutenção preventiva e corretiva para computadores, notebooks e equipamentos de tecnologia.",
    },
    {
      titulo: "Venda de equipamento de informatica e acessorios",
      descricao: " trabalhamos com venda de pelicula, capinha, fomes de ouvido e peças para computador.",
    },
  ];
 // painel principal 
  return (
    <div className="app">
      <header className="header">
        <div className="logo">ULTRATECH</div>

        <nav className="nav">
          <a href="#inicio">Início</a>
          <a href="#servicos">Serviços</a>
          <a href="#sobre">Sobre</a>
          <a href="#contato">Contato</a>
        </nav>
      </header>

      <main>
        <section className="hero" id="inicio">
          <div className="hero-texto">
            <h1>Soluções em tecnologia para sua casa e seu negócio</h1>
            <p>
              A <strong>ULTRATECH</strong> oferece suporte técnico, formatação
              de máquinas, instalação de câmeras e serviços de manutenção com
              qualidade e confiança.
            </p>

            <div className="hero-botoes">
              <a href="#servicos" className="btn btn-primary">
                Ver Serviços
              </a>
              <a href="#contato" className="btn btn-secondary">
                Solicitar Orçamento
              </a>
            </div>
          </div>

          <div className="hero-card">
            <h3>Atendimento rápido</h3>
            <p>Suporte para problemas técnicos do dia a dia.</p>

            <h3>Serviço confiável</h3>
            <p>Trabalho com compromisso, agilidade e atenção ao cliente.</p>

            <h3>Para casa e empresa</h3>
            <p>Soluções personalizadas para diferentes necessidades.</p>
          </div>
        </section>

        <section className="servicos" id="servicos">
          <h2>Nossos Serviços</h2>
          <p className="secao-descricao">
            Conheça algumas das soluções que a ULTRATECH oferece.
          </p>

          <div className="cards">
            {servicos.map((servico, index) => (
              <div className="card" key={index}>
                <h3>{servico.titulo}</h3>
                <p>{servico.descricao}</p>
              </div>
            ))}
          </div>
        </section>

        <section className="sobre" id="sobre">
          <div className="sobre-box">
            <h2>Sobre a ULTRATECH</h2>
            <p>
              A ULTRATECH nasceu com o objetivo de oferecer serviços de
              tecnologia com praticidade, confiança e bom atendimento.
            </p>
            <p>
              Trabalhamos com manutenção de computadores, instalação de
              equipamentos, suporte em sistemas e soluções para melhorar a
              segurança e o desempenho do seu ambiente.
            </p>
            <p>
              Nosso foco é ajudar clientes residenciais e empresas a resolverem
              problemas técnicos com eficiência.
            </p>
          </div>
        </section>

        <section className="contato" id="contato">
          <h2>Entre em Contato</h2>
          <p className="secao-descricao">
            Solicite um orçamento e fale com a ULTRATECH.
          </p>

          <div className="contato-container">
            <form className="form-contato">
              <input type="text" placeholder="Seu nome" />
              <input type="email" placeholder="Seu e-mail" />
              <input type="text" placeholder="Seu telefone" />
              <textarea
                placeholder="Descreva o serviço que você precisa"
                rows="5"
              ></textarea>
                <a
                  className="instagran-btn"
                  href="https://www.instagram.com/ultra_tech062/"
                  target="_blank"
                  rel="noreferrer"
                  
                >
                  Instagram
                </a>
            </form>

            <div className="info-contato">
              <h3>Informações</h3>
              <p>
                <strong>Empresa:</strong> ULTRATECH
              </p>
              <p>
                <strong>Serviços:</strong> Formatação, Câmeras, Suporte em
                Sistemas, Manutenção
              </p>
              <p>
                <strong>Atendimento:</strong> Residencial e Empresarial
              </p>

              <a
                className="whatsapp-btn"
                href="https://w.app/ultratech062"
                target="_blank"
                rel="noreferrer"
              >
                Falar no WhatsApp
              </a>
            </div>
          </div>
        </section>
      </main>

      <footer className="footer">
        <p>© 2026 ULTRATECH - Todos os direitos reservados.</p>
      </footer>
    </div>
  );
}
export default App;