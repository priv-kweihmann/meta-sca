SRC_URI += "https://proxy.golang.org/github.com/fatih/color/@v/v1.10.0.zip;srcoutput=github.com/fatih/color;srcinput=github.com/fatih/color@v1.10.0;downloadfilename=github-com-fatih-color-1.10.0.zip;name=github-com-fatih-color"
SRC_URI[github-com-fatih-color.sha256sum] = "e1b2da810ca48a16d9ecd808b7aaae757f1c3c906cf1e8ca1d149b8db7cdb91b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fatih/color/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a \
"

GOSRC_INCLUDEGUARD += "github.com-fatih-color-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
