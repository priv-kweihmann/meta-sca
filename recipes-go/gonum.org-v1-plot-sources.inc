SRC_URI += "https://proxy.golang.org/gonum.org/v1/plot/@v/v0.13.0.zip;srcoutput=gonum.org/v1/plot;srcinput=gonum.org/v1/plot@v0.13.0;downloadfilename=gonum-org-v1-plot-0.13.0.zip;name=gonum-org-v1-plot"
SRC_URI[gonum-org-v1-plot.sha256sum] = "5ca0d19d4f3587ceb51b78f3450bc53e1c731757c9d36332d958041127de3d2a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/gonum.org/v1/plot/LICENSE;md5=fabff3dab4b5a6c3e29611c973dc3df9 \
"

GOSRC_INCLUDEGUARD += "gonum.org-v1-plot-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-x-sources.inc', '', 'gioui.org-x-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'git.sr.ht--sbinet-gg-sources.inc', '', 'git.sr.ht--sbinet-gg-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-svgo-sources.inc', '', 'github.com-ajstarks-svgo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-andybalholm-stroke-sources.inc', '', 'github.com-andybalholm-stroke-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-fonts-liberation-sources.inc', '', 'github.com-go-fonts-liberation-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-latex-latex-sources.inc', '', 'github.com-go-latex-latex-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-pdf-fpdf-sources.inc', '', 'github.com-go-pdf-fpdf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gonum.org-v1-gonum-sources.inc', '', 'gonum.org-v1-gonum-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'rsc.io-pdf-sources.inc', '', 'rsc.io-pdf-sources.inc', d)}
