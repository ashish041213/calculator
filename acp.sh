#!/bin/sh
git add .
read var
git commit -m "$var"
git push origin master

