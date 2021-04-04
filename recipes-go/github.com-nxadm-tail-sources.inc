SRC_URI += "https://proxy.golang.org/github.com/nxadm/tail/@v/v1.4.8.zip;srcoutput=github.com/nxadm/tail;srcinput=github.com/nxadm/tail@v1.4.8;downloadfilename=github-com-nxadm-tail-1.4.8.zip;name=github-com-nxadm-tail"
SRC_URI[github-com-nxadm-tail.sha256sum] = "70bf6e142f90694059792f7d5b31a915df989e8a6a554a836de36fa075377ff9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/nxadm/tail/LICENSE;md5=0bdce43b16cd5c587124d6f274632c87 \
    file://src/github.com/nxadm/tail/ratelimiter/Licence;md5=59075d8b0d75f67d94831ca1373d3ce7 \
"

GOSRC_INCLUDEGUARD += "github.com-nxadm-tail-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fsnotify-fsnotify-sources.inc', '', 'github.com-fsnotify-fsnotify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-tomb.v1-sources.inc', '', 'gopkg.in-tomb.v1-sources.inc', d)}
