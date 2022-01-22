SRC_URI += "https://proxy.golang.org/github.com/xdg-go/scram/@v/v1.1.0.zip;srcoutput=github.com/xdg-go/scram;srcinput=github.com/xdg-go/scram@v1.1.0;downloadfilename=github-com-xdg-go-scram-1.1.0.zip;name=github-com-xdg-go-scram"
SRC_URI[github-com-xdg-go-scram.sha256sum] = "ae24ee0f4c854fc017ea3b4168fb49c1d2dda5896ce917b448b1f9fda9fffac7"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg-go/scram/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-go-scram-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-go-pbkdf2-sources.inc', '', 'github.com-xdg-go-pbkdf2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-go-stringprep-sources.inc', '', 'github.com-xdg-go-stringprep-sources.inc', d)}
