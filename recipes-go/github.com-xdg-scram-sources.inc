SRC_URI += "https://proxy.golang.org/github.com/xdg/scram/@v/v1.0.3.zip;srcoutput=github.com/xdg/scram;srcinput=github.com/xdg/scram@v1.0.3;downloadfilename=github-com-xdg-scram-1.0.3.zip;name=github-com-xdg-scram"
SRC_URI[github-com-xdg-scram.sha256sum] = "56875f465f0ed3170846db4d300328b9c769c35a3c59a479c8b9ac659765e48c"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg/scram/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-scram-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-stringprep-sources.inc', '', 'github.com-xdg-stringprep-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
