SRC_URI += "https://proxy.golang.org/github.com/fatih/color/@v/v1.12.0.zip;srcoutput=github.com/fatih/color;srcinput=github.com/fatih/color@v1.12.0;downloadfilename=github-com-fatih-color-1.12.0.zip;name=github-com-fatih-color"
SRC_URI[github-com-fatih-color.sha256sum] = "956287958f170cadf7172a8700aae854221a6e6e7e2a55c216fa98f8024d4551"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fatih/color/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a \
"

GOSRC_INCLUDEGUARD += "github.com-fatih-color-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
