SRC_URI += "https://proxy.golang.org/github.com/mattn/go-isatty/@v/v0.0.17.zip;srcoutput=github.com/mattn/go-isatty;srcinput=github.com/mattn/go-isatty@v0.0.17;downloadfilename=github-com-mattn-go-isatty-0.0.17.zip;name=github-com-mattn-go-isatty"
SRC_URI[github-com-mattn-go-isatty.sha256sum] = "ed8a984a7931d618b677b6fd6bcc93c58bb57e67b4b3005c4012a8851b49428c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-isatty/LICENSE;md5=f509beadd5a11227c27b5d2ad6c9f2c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-isatty-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
