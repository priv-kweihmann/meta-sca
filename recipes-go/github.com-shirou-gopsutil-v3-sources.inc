SRC_URI += "https://proxy.golang.org/github.com/shirou/gopsutil/v3/@v/v3.21.5.zip;srcoutput=github.com/shirou/gopsutil/v3;srcinput=github.com/shirou/gopsutil/v3@v3.21.5;downloadfilename=github-com-shirou-gopsutil-v3-3.21.5.zip;name=github-com-shirou-gopsutil-v3"
SRC_URI[github-com-shirou-gopsutil-v3.sha256sum] = "56392096d339524233ecc0d5ec070a87d76136d0ba59dd6c5eb141ad518448ac"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shirou/gopsutil/v3/LICENSE;md5=ed7522382cec5b7a6d6ebb8e30eed40e \
"

GOSRC_INCLUDEGUARD += "github.com-shirou-gopsutil-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stackexchange-wmi-sources.inc', '', 'github.com-stackexchange-wmi-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-tklauser-go-sysconf-sources.inc', '', 'github.com-tklauser-go-sysconf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
