CREATE TABLE company_details (
  companyId VARCHAR(255)  PRIMARY KEY,
  companyName VARCHAR(255),
  turnover VARCHAR(250),
  ceo VARCHAR(250) NOT NULL,
  boardOfDirectors VARCHAR(250) NOT NULL,
  listedInStockExchanges VARCHAR(250) NOT NULL,
  sector VARCHAR(250) NOT NULL,
  summary VARCHAR(250) NOT NULL,
  stockCode VARCHAR(250) NOT NULL
);