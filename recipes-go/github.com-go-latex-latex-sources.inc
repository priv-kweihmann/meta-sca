SRC_URI += "https://proxy.golang.org/github.com/go-latex/latex/@v/v0.0.0-20230307184459-12ec69307ad9.zip;srcoutput=github.com/go-latex/latex;srcinput=github.com/go-latex/latex@v0.0.0-20230307184459-12ec69307ad9;downloadfilename=github-com-go-latex-latex-0.0.0-20230307184459-12ec69307ad9.zip;name=github-com-go-latex-latex"
SRC_URI[github-com-go-latex-latex.sha256sum] = "b61ffef542287b4694f0c8c29da809ed025057aab9cb042457e2bdb07db97e70"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-latex/latex/LICENSE;md5=30599fc891e7586b4bc8dda5cb7712e6 \
"

GOSRC_INCLUDEGUARD += "github.com-go-latex-latex-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fogleman-gg-sources.inc', '', 'github.com-fogleman-gg-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-pdf-fpdf-sources.inc', '', 'github.com-go-pdf-fpdf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
