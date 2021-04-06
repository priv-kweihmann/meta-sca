SRC_URI += "https://proxy.golang.org/github.com/xdg/stringprep/@v/v1.0.3.zip;srcoutput=github.com/xdg/stringprep;srcinput=github.com/xdg/stringprep@v1.0.3;downloadfilename=github-com-xdg-stringprep-1.0.3.zip;name=github-com-xdg-stringprep"
SRC_URI[github-com-xdg-stringprep.sha256sum] = "7cb9711fd7b3c1518e1fbd4e39be11737d7006a5e4a59f1ceb4ba9c205eb90fa"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg/stringprep/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-stringprep-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
