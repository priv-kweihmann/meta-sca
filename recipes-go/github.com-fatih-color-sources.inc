SRC_URI += "https://proxy.golang.org/github.com/fatih/color/@v/v1.14.1.zip;srcoutput=github.com/fatih/color;srcinput=github.com/fatih/color@v1.14.1;downloadfilename=github-com-fatih-color-1.14.1.zip;name=github-com-fatih-color"
SRC_URI[github-com-fatih-color.sha256sum] = "e4938e4f8e9ece6f5e95aaa25dc0fe7753718e041584333a17d102a6447e0331"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fatih/color/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a \
"

GOSRC_INCLUDEGUARD += "github.com-fatih-color-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
