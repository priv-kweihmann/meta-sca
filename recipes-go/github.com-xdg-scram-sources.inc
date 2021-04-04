SRC_URI += "https://proxy.golang.org/github.com/xdg/scram/@v/v0.0.1.zip;srcoutput=github.com/xdg/scram;srcinput=github.com/xdg/scram@v0.0.1;downloadfilename=github-com-xdg-scram-0.0.1.zip;name=github-com-xdg-scram"
SRC_URI[github-com-xdg-scram.sha256sum] = "d8c7d22432543f707eca9aa7766c81e60fe9f36d3834f65833c60888a0c1b862"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg/scram/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-scram-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-stringprep-sources.inc', '', 'github.com-xdg-stringprep-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
