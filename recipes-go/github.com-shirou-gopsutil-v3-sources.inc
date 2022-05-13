SRC_URI += "https://proxy.golang.org/github.com/shirou/gopsutil/v3/@v/v3.22.4.zip;srcoutput=github.com/shirou/gopsutil/v3;srcinput=github.com/shirou/gopsutil/v3@v3.22.4;downloadfilename=github-com-shirou-gopsutil-v3-3.22.4.zip;name=github-com-shirou-gopsutil-v3"
SRC_URI[github-com-shirou-gopsutil-v3.sha256sum] = "1d39611d6f49e1487b213f4f221e4f544b26ccae38f9c242169baf239af5164a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shirou/gopsutil/v3/LICENSE;md5=ae6de3dee02712a1e55b280671be53bf \
"

GOSRC_INCLUDEGUARD += "github.com-shirou-gopsutil-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lufia-plan9stats-sources.inc', '', 'github.com-lufia-plan9stats-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-power-devops-perfstat-sources.inc', '', 'github.com-power-devops-perfstat-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-tklauser-go-sysconf-sources.inc', '', 'github.com-tklauser-go-sysconf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yusufpapurcu-wmi-sources.inc', '', 'github.com-yusufpapurcu-wmi-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
