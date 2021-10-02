SRC_URI += "https://proxy.golang.org/github.com/xdg-go/stringprep/@v/v1.0.2.zip;srcoutput=github.com/xdg-go/stringprep;srcinput=github.com/xdg-go/stringprep@v1.0.2;downloadfilename=github-com-xdg-go-stringprep-1.0.2.zip;name=github-com-xdg-go-stringprep"
SRC_URI[github-com-xdg-go-stringprep.sha256sum] = "4f4d7c8ba09ab5fa288ff86902c2f4000f3a85cd55d9ff75a04ade18c8e33ad9"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg-go/stringprep/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-go-stringprep-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
