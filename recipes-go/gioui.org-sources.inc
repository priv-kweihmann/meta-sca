SRC_URI += "https://proxy.golang.org/gioui.org/@v/v0.0.0-20220924144830-24eb1a4fc5fd.zip;srcoutput=gioui.org;srcinput=gioui.org@v0.0.0-20220924144830-24eb1a4fc5fd;downloadfilename=gioui-org-0.0.0-20220924144830-24eb1a4fc5fd.zip;name=gioui-org"
SRC_URI[gioui-org.sha256sum] = "906c2642357956b4a5a2b949c79b094a1fc53f2c62088bc8a17f10da6d207d8e"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/gioui.org/LICENSE;md5=dde5f9fd8ce48e8651e625128022e572 \
"

GOSRC_INCLUDEGUARD += "gioui.org-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-cpu-sources.inc', '', 'gioui.org-cpu-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-shader-sources.inc', '', 'gioui.org-shader-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-benoitkugler-textlayout-sources.inc', '', 'github.com-benoitkugler-textlayout-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gioui-uax-sources.inc', '', 'github.com-gioui-uax-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-text-typesetting-sources.inc', '', 'github.com-go-text-typesetting-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-shiny-sources.inc', '', 'golang.org-x-exp-shiny-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
