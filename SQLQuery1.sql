



--alter table project add constraint FK foreign key(teamID) references Team(teamID) on delete no action on update no action
--create table Project	
--(
--projectID  int Identity(1,1) primary key,
--projectName varchar(max),
--  projectDescription varchar(max),
--requiredBudget int,

--projectManager varchar(40) not null,
--teamID int

--)


--create table Team	
--(
--teamID int Identity(1,1) primary key,
--teamName varchar(max),
--projectID int foreign key references Project(projectID) on delete set null on update cascade
--)



--create table Volunteer
--(
--volunteerID int  identity(1,1)primary key,
--volunteerName varchar(max),
--position varchar(max),
--teamID int foreign key references Team(teamID) on delete set null on update cascade
--)


--create Table Donor
--(
--donorID int identity(1,1) primary key,
--donorName varchar(max)
--)

--create table FundCollection
--(
--projectID int foreign key references Project(projectID) on delete set null on update cascade,
--donorID int foreign key references Donor(donorID) on delete set null on update cascade,
--amount int,
--done int
--)


--create table Fund
--(
--fundID int identity(1,1) primary key,
--fundType varchar(20),
--fundAmount int,
--donorID int foreign key references Donor(donorID) on delete set null on update cascade

--)


--create table Pledge
--(
--pledgeID int identity(1,1) primary key,
--pledgeDescription varchar(max),
--pledgeDate varchar(10),
--donorID int foreign key references Donor(donorID) on delete set null on update cascade
--)


--create table [Subject]
--(
--subjectID int identity(1,1) primary key,
--subjectName varchar(max),
--subjectType varchar(30),
--subjectAddress varchar(max),
--subjectPhone varchar(20),
--subjectDOB varchar(10),
--subjectIncome int, 
--)

--create table FundDistribution
--(
--projectID int foreign key references Project(projectID) on delete set null on update cascade,
--subjectID int foreign key references [Subject](subjectID) on delete set null on update cascade,
--done int,

--)

--create table Donated
--(
--projectID int foreign key references Project(projectID) on delete set null on update cascade,
--subjectID int foreign key references [Subject](subjectID) on delete set null on update cascade,
--amount int
--)





--select * from Project
--select * from Team



