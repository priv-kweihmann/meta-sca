SRC_URI += "https://proxy.golang.org/golang.org/x/exp/shiny/@v/v0.0.0-20221019170559-20944726eadf.zip;srcoutput=golang.org/x/exp/shiny;srcinput=golang.org/x/exp/shiny@v0.0.0-20221019170559-20944726eadf;downloadfilename=golang-org-x-exp-shiny-0.0.0-20221019170559-20944726eadf.zip;name=golang-org-x-exp-shiny"
SRC_URI[golang-org-x-exp-shiny.sha256sum] = "c2156da7004efc43bca1184ab90ec72590571175cf8ddbeae3dcaf4b56936cb0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/shiny/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-shiny-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'dmitri.shuralyov.com-gpu-mtl-sources.inc', '', 'dmitri.shuralyov.com-gpu-mtl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', '', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jezek-xgb-sources.inc', '', 'github.com-jezek-xgb-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mobile-sources.inc', '', 'golang.org-x-mobile-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
