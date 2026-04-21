SRC_URI += "https://proxy.golang.org/github.com/fatih/color/@v/v1.19.0.zip;srcoutput=github.com/fatih/color;srcinput=github.com/fatih/color@v1.19.0;downloadfilename=github-com-fatih-color-1.19.0.zip;name=github-com-fatih-color"
SRC_URI[github-com-fatih-color.sha256sum] = "694b4265dc678e2a65b196371d5a6ec4eed3739f12a16021dcd2f0c1355d0ec6"

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
