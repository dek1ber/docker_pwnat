FROM 2stacks/vyos:1.2.0-rc11
RUN sed -i s,"nr_inodes","",g /usr/libexec/vyos/init/vyos-router
RUN echo "export TERM=xterm" >> tee /etc/skel/.bashrc
RUN mkdir -p /var/log/vyatta/
RUN touch /var/log/vyatta/vyatta-config-loader.log
RUN touch /var/log/vyatta/vyatta-commit.log
RUN chmod ugo+rwX /var/log/vyatta/
RUN chgrp -R vyattacfg /var/log/vyatta/
ADD config.init /config.init
RUN echo "#!/bin/bash" > /usr/libexec/vyos/init/vyos-config
RUN echo "source /opt/vyatta/etc/functions/script-template" >>  /usr/libexec/vyos/init/vyos-config
RUN echo "sg vyattacfg -c '/opt/vyatta/sbin/vyatta-boot-config-loader /config.init'" >> /usr/libexec/vyos/init/vyos-config 

COPY /vyos_routes.sh /vyos_routes.sh
ENTRYPOINT ["/sbin/init"]
