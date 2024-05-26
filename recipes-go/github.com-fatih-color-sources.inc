SRC_URI += "https://proxy.golang.org/github.com/fatih/color/@v/v1.16.0.zip;srcoutput=github.com/fatih/color;srcinput=github.com/fatih/color@v1.16.0;downloadfilename=github-com-fatih-color-1.16.0.zip;name=github-com-fatih-color"
SRC_URI[github-com-fatih-color.sha256sum] = "8719f3f5443d387546316e98105b5793d9c378dbdb9f4d60728ac4477d5aeadf"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/fatih/color/LICENSE.md;md5=316e6d590bdcde7993fb175662c0dd5a \
"

GOSRC_INCLUDEGUARD += "github.com-fatih-color-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
