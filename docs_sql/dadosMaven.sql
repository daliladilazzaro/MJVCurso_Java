CREATE TABLE public.tab_cliente(
	id serial NOT NULL,
	nome varchar NOT NULL,
	telefone numeric NOT NULL
);

INSERT INTO public.tab_cadastro (nome,telefone)	VALUES ('Lila Linda',11975263695);


UPDATE public.tab_cadastro SET nome=?,telefone=? WHERE id=? AND nome=? AND telefone=?;


CREATE TABLE tab_cliente (
	id serial NOT null PRIMARY KEY,
	pf_pj char(1) NOT NULL,
	nome varchar (50) NOT NULL,
	cpf_cnpj varchar (14) NOT null, 
	telefone1 numeric (11) NOT NULL,
	telefone2 numeric (11) NULL,
	email varchar (50) NOT NULL,
	area_atuacao varchar (10) not null,
	cep char(8) NOT NULL,
	estado  char(2) NOT NULL,
	cidade varchar (50) NOT NULL,
	rua varchar (50) NOT NULL,
	numero varchar (6) NOT null,
	complemento varchar (10) NOT NULL,
	bairro varchar (20) NOT NULL,
	site_instagram varchar (50) not null,
	observacao text not null);

-- Auto-generated SQL script #202106261627
INSERT INTO public.tab_cliente (pf_pj,nome,cpf_cnpj,telefone1,email,area_atuacao,cep,estado,cidade,rua,numero,complemento,bairro,site_instagram,observacao)
	VALUES ('PJ','Empresa Cia','15478965472365',12547896547,'empresa@gmail','Bebidas','75218965','AC','Acre','Rua do Acre','78','n/a','São do Acre','n/a','Empresa Ficticia');
INSERT INTO public.tab_cliente (pf_pj,nome,cpf_cnpj,telefone1,telefone2,email,area_atuacao,cep,estado,cidade,rua,numero,complemento,bairro,site_instagram,observacao)
	VALUES ('PF','Pessoa Santos','78541265478',45789654125,78541265987,'pessoal@email','Vendedor','78965412','MA','Maranhao','Rua do Maranhao','96','AP 3','São cristovao','pessoaLegal','Pessoa Ficticia');


-- Drop table

-- DROP TABLE public.tbl_cadastro;

CREATE TABLE public.tbl_cadastro (
	id serial NOT NULL,
	area_atuacao varchar(50) NULL,
	bairro varchar(15) NULL,
	cep varchar(8) NULL,
	cidade varchar(20) NULL,
	complemento varchar(10) NULL,
	cpf_cnpj varchar(14) NULL,
	email varchar(50) NULL,
	estado varchar(2) NULL,
	nome varchar(50) NULL,
	numero varchar(6) NULL,
	observacao varchar(255) NULL,
	pf_pj varchar(2) NULL,
	rua varchar(40) NULL,
	site_instagram varchar(50) NULL,
	telefone1 int8 NULL,
	telefone2 int8 NULL,
	CONSTRAINT tbl_cadastro_pkey PRIMARY KEY (id)
);

Hibernate: 
    insert 
    into
        tbl_cadastro
        (area_atuacao, bairro, cep, cidade, complemento, cpf_cnpj, email, estado, nome, numero, observacao, pf_pj, rua, site_instagram, telefone1, telefone2) 
    values
        (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)



Hibernate: 
    select
        cadastro0_.id as id1_0_0_,
        cadastro0_.area_atuacao as area_atu2_0_0_,
        cadastro0_.bairro as bairro3_0_0_,
        cadastro0_.cep as cep4_0_0_,
        cadastro0_.cidade as cidade5_0_0_,
        cadastro0_.complemento as compleme6_0_0_,
        cadastro0_.cpf_cnpj as cpf_cnpj7_0_0_,
        cadastro0_.email as email8_0_0_,
        cadastro0_.estado as estado9_0_0_,
        cadastro0_.nome as nome10_0_0_,
        cadastro0_.numero as numero11_0_0_,
        cadastro0_.observacao as observa12_0_0_,
        cadastro0_.pf_pj as pf_pj13_0_0_,
        cadastro0_.rua as rua14_0_0_,
        cadastro0_.site_instagram as site_in15_0_0_,
        cadastro0_.telefone1 as telefon16_0_0_,
        cadastro0_.telefone2 as telefon17_0_0_ 
    from
        tbl_cadastro cadastro0_ 
    where
        cadastro0_.id=?
Hibernate: 
    update
        tbl_cadastro 
    set
        area_atuacao=?,
        bairro=?,
        cep=?,
        cidade=?,
        complemento=?,
        cpf_cnpj=?,
        email=?,
        estado=?,
        nome=?,
        numero=?,
        observacao=?,
        pf_pj=?,
        rua=?,
        site_instagram=?,
        telefone1=?,
        telefone2=? 
    where
        id=?

Hibernate: 
    select
        cadastro0_.id as id1_0_0_,
        cadastro0_.area_atuacao as area_atu2_0_0_,
        cadastro0_.bairro as bairro3_0_0_,
        cadastro0_.cep as cep4_0_0_,
        cadastro0_.cidade as cidade5_0_0_,
        cadastro0_.complemento as compleme6_0_0_,
        cadastro0_.cpf_cnpj as cpf_cnpj7_0_0_,
        cadastro0_.email as email8_0_0_,
        cadastro0_.estado as estado9_0_0_,
        cadastro0_.nome as nome10_0_0_,
        cadastro0_.numero as numero11_0_0_,
        cadastro0_.observacao as observa12_0_0_,
        cadastro0_.pf_pj as pf_pj13_0_0_,
        cadastro0_.rua as rua14_0_0_,
        cadastro0_.site_instagram as site_in15_0_0_,
        cadastro0_.telefone1 as telefon16_0_0_,
        cadastro0_.telefone2 as telefon17_0_0_ 
    from
        tbl_cadastro cadastro0_ 
    where
        cadastro0_.id=?
Hibernate: 
    delete 
    from
        tbl_cadastro 
    where
        id=?



Hibernate: 
    select
        cadastro0_.id as id1_0_,
        cadastro0_.area_atuacao as area_atu2_0_,
        cadastro0_.bairro as bairro3_0_,
        cadastro0_.cep as cep4_0_,
        cadastro0_.cidade as cidade5_0_,
        cadastro0_.complemento as compleme6_0_,
        cadastro0_.cpf_cnpj as cpf_cnpj7_0_,
        cadastro0_.email as email8_0_,
        cadastro0_.estado as estado9_0_,
        cadastro0_.nome as nome10_0_,
        cadastro0_.numero as numero11_0_,
        cadastro0_.observacao as observa12_0_,
        cadastro0_.pf_pj as pf_pj13_0_,
        cadastro0_.rua as rua14_0_,
        cadastro0_.site_instagram as site_in15_0_,
        cadastro0_.telefone1 as telefon16_0_,
        cadastro0_.telefone2 as telefon17_0_ 
    from
        tbl_cadastro cadastro0_
"id: 2
pf_pj: F
nome: Lila
Cpf_cnpj: 254.786.975-30
telefone1: (12)75698-7423
telefone2: (12)99698-7423
email: dalila@dalila.com
area_atuacao: Dev e Adm
cep: 45.697-521
estado: SP
cidade: São Paulo
rua: Av Brasil
numero: 479
complemento: APTO1 BL2
bairro: Jardins
site_instagram: @dilazzaro
observacao: Gosto de tocar violao."