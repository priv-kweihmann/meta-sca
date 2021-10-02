SRC_URI += "https://proxy.golang.org/github.com/xdg-go/scram/@v/v1.0.2.zip;srcoutput=github.com/xdg-go/scram;srcinput=github.com/xdg-go/scram@v1.0.2;downloadfilename=github-com-xdg-go-scram-1.0.2.zip;name=github-com-xdg-go-scram"
SRC_URI[github-com-xdg-go-scram.sha256sum] = "c7846f2609f2efc1d248301c2f261ff6cb1be971fa77de5790bda1fcd14fcceb"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg-go/scram/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-go-scram-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-go-pbkdf2-sources.inc', '', 'github.com-xdg-go-pbkdf2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-go-stringprep-sources.inc', '', 'github.com-xdg-go-stringprep-sources.inc', d)}
