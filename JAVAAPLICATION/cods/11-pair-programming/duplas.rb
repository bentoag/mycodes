alunos = %w{Bruno Jefferson Salvador Renan Ariel Regis Matheus Israel Karolina Bento Edson Danielle Yuri Milena Patrick Angel Elieser Julian Francisco Nicholas Joilson}

alunos.shuffle!

p alunos.pop(2) until alunos.empty?
