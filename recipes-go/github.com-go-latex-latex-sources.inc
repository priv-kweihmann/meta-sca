SRC_URI += "https://proxy.golang.org/github.com/go-latex/latex/@v/v0.0.0-20210823091927-c0d11ff05a81.zip;srcoutput=github.com/go-latex/latex;srcinput=github.com/go-latex/latex@v0.0.0-20210823091927-c0d11ff05a81;downloadfilename=github-com-go-latex-latex-0.0.0-20210823091927-c0d11ff05a81.zip;name=github-com-go-latex-latex"
SRC_URI[github-com-go-latex-latex.sha256sum] = "c58be686b31679ad0a51a5d70e60df92fb4bb50a16727caa58b4a67b33f16509"

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
