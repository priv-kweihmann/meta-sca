SRC_URI += "https://proxy.golang.org/gioui.org/@v/v0.0.0-20230323230841-d7b1c7c33b33.zip;srcoutput=gioui.org;srcinput=gioui.org@v0.0.0-20230323230841-d7b1c7c33b33;downloadfilename=gioui-org-0.0.0-20230323230841-d7b1c7c33b33.zip;name=gioui-org"
SRC_URI[gioui-org.sha256sum] = "55e12c50ca1c9b5758913ae6f4e3e4433856890729f8df2ede9257654e514dfa"

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
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-text-typesetting-sources.inc', '', 'github.com-go-text-typesetting-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-shiny-sources.inc', '', 'golang.org-x-exp-shiny-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
