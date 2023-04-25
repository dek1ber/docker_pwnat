interfaces {
    ethernet eth0 {
        duplex auto
        smp-affinity auto
        speed auto
    }
    ethernet eth1 {
        duplex auto
        smp-affinity auto
        speed auto
    }
    loopback lo {
    }
}
system {
    config-management {
        commit-revisions 100
    }
    host-name vyos
    login {
        user vyos {
            authentication {
                encrypted-password $6$5seQBeBAaK7JnX$glQUvrBxGnYL.IjjKPTrItnW1NR48q98Oxfuv7ZzjT8fAciWS4LwPYWNiYKWOwz8thIvHFA.LR7UOE65GEz9X.
                plaintext-password ""
            }
            level admin
        }
    }
    name-server 8.8.8.8
    ntp {
        server 0.pool.ntp.org {
        }
        server 1.pool.ntp.org {
        }
        server 2.pool.ntp.org {
        }
    }
    syslog {
        global {
            facility all {
                level info
            }
            facility protocols {
                level debug
            }
        }
    }
    time-zone UTC
}


/* Warning: Do not remove the following line. */
/* === vyatta-config-version: "webgui@1:quagga@3:ssh@1:nat@4:conntrack-sync@1:vrrp@2:webproxy@2:mdns@1:qos@1:dhcp-relay@2:cluster@1:l2tp@1:dhcp-server@5:broadcast-relay@1:firewall@5:ntp@1:ipsec@4:config-management@1:conntrack@1:system@9:webproxy@1:zone-policy@1:wanloadbalance@3:pptp@1" === */
/* Release version: 1.2.0-rc11 */
