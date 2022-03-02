SRC_URI += "https://proxy.golang.org/github.com/xdg-go/stringprep/@v/v1.0.3.zip;srcoutput=github.com/xdg-go/stringprep;srcinput=github.com/xdg-go/stringprep@v1.0.3;downloadfilename=github-com-xdg-go-stringprep-1.0.3.zip;name=github-com-xdg-go-stringprep"
SRC_URI[github-com-xdg-go-stringprep.sha256sum] = "515150cab19dedebd979f6298f64d29e3b6e45e55d645a0f32d9f72997e3b2ed"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg-go/stringprep/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-go-stringprep-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
