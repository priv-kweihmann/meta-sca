SRC_URI += "https://proxy.golang.org/github.com/mattn/go-isatty/@v/v0.0.14.zip;srcoutput=github.com/mattn/go-isatty;srcinput=github.com/mattn/go-isatty@v0.0.14;downloadfilename=github-com-mattn-go-isatty-0.0.14.zip;name=github-com-mattn-go-isatty"
SRC_URI[github-com-mattn-go-isatty.sha256sum] = "6b8f017658d900de873fc567237548ef2054082aed64669655e51beeefee83c7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-isatty/LICENSE;md5=f509beadd5a11227c27b5d2ad6c9f2c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-isatty-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
