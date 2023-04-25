#FROM handsonsecurity/seed-ubuntu:large
FROM hdavid0510/ubuntu-desktop-lxde-vnc:latest

RUN apt-get update && apt-get install vim wget -y
COPY /victim_routes.sh /victim_routes.sh
RUN export PS1="victim-192.168.1.50 ~ "
