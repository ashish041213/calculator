terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "4.22.0"
    }
  }
}

provider "aws" {
  region = "us-east-2"
}

resource "aws_instance" "app_server" {
  ami           = "ami-02d1e544b84bf7502"
  instance_type = "t2.micro"

  tags = {
    Name        =  var.instance_name
    Environment =  "Dev"
    Project     =  "FT"
  }
}

