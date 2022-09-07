SRC_URI += "https://proxy.golang.org/golang.org/x/exp/shiny/@v/v0.0.0-20220907003533-145caa8ea1d0.zip;srcoutput=golang.org/x/exp/shiny;srcinput=golang.org/x/exp/shiny@v0.0.0-20220907003533-145caa8ea1d0;downloadfilename=golang-org-x-exp-shiny-0.0.0-20220907003533-145caa8ea1d0.zip;name=golang-org-x-exp-shiny"
SRC_URI[golang-org-x-exp-shiny.sha256sum] = "f5c2f3394bf0eb8d6751ae9ea29ce1ff4b6aee4b4b276a29392215b09ef1eefa"

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
