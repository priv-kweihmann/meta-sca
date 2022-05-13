SRC_URI += "https://proxy.golang.org/github.com/power-devops/perfstat/@v/v0.0.0-20220216144756-c35f1ee13d7c.zip;srcoutput=github.com/power-devops/perfstat;srcinput=github.com/power-devops/perfstat@v0.0.0-20220216144756-c35f1ee13d7c;downloadfilename=github-com-power-devops-perfstat-0.0.0-20220216144756-c35f1ee13d7c.zip;name=github-com-power-devops-perfstat"
SRC_URI[github-com-power-devops-perfstat.sha256sum] = "5d08f1483095e59981a0f6a78c90542cff1b0c5ddfe5ebc898c5b19cd5a602f9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/power-devops/perfstat/LICENSE;md5=ab1971aa83cccbf1e3dd0a4979fd9231 \
"

GOSRC_INCLUDEGUARD += "github.com-power-devops-perfstat-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
