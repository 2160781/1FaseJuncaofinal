# 1FaseJuncaofinal

Na primeira fase do projeto de forma a obter uma Spike de integração das Spikes efetuadas ao longo desta fase, 
decidiu-se implementar um sistema que permite ao utilizador navegar pela informação apresentada em cinco 
janelas de informação.
A primeira e a segunda janelas, apresentam duas imagens distintas e dois botões, na primeira o botão diz
“SIGUIENTE” e na segunda o botão diz “SIGUIENTE2”. Nestas janelas é possível a navegação, através dos botões 
digitais e dos botões do som do android, para passar da primeira janela para a segunda e da segunda para a
terceira o utilizador pode premir o respetivo botão digital ou botão de aumentar o som; por outro lado se 
o utilizador decidir voltar à janela anterior deverá premir o botão de diminuir o som, ao premir este na 
primeira janela, nada acontece.
A terceira, apresenta uma imagem e permite, através dos botões do som do android, a passagem entre janelas 
de informação. Esta é feita da mesma forma referida anteriormente.
Na quarta janela, são apresentados uma imagem e um texto, este tem como objetivo indicar ao utilizador
como deverá proceder de forma a efetuar a leitura do QR Code. Nesta janela foi implementada uma nova 
função do botão de diminuir o som, que deixou de servir como botão de navegação e passou a ser o botão 
de ativação da câmara e do Scanner, entrando na quinta janela, de forma a possibilitar a leitura do QR Code. 
Por outro lado, o botão de aumentar o som continua a fazer a passagem desta janela para a sexta.
A sexta janela, corresponde ao reconhecimento da voz do utilizador. Nesta é possível a obtenção de qualquer 
frase ou palavra dita pelo utilizador. Este reconhecimento é feito ao premir o botão de aumentar o som, 
sendo também possível a passagem desta janela para a primeira com o premir do botão de diminuir o som. 
Com a passagem da sexta janela para a primeira é possível efetuar este processo, diversas vezes e sem interrupção.
