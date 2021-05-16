SRC_URI += "https://proxy.golang.org/github.com/fatih/color/@v/v1.11.0.zip;srcoutput=github.com/fatih/color;srcinput=github.com/fatih/color@v1.11.0;downloadfilename=github-com-fatih-color-1.11.0.zip;name=github-com-fatih-color"
SRC_URI[github-com-fatih-color.sha256sum] = "049e2a87f074ac15168b906f26119c7e818484842a3f820a209b88b1c58e9c53"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fatih/color/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a \
"

GOSRC_INCLUDEGUARD += "github.com-fatih-color-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
