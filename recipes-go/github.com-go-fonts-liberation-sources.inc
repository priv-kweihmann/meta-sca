SRC_URI += "https://proxy.golang.org/github.com/go-fonts/liberation/@v/v0.3.0.zip;srcoutput=github.com/go-fonts/liberation;srcinput=github.com/go-fonts/liberation@v0.3.0;downloadfilename=github-com-go-fonts-liberation-0.3.0.zip;name=github-com-go-fonts-liberation"
SRC_URI[github-com-go-fonts-liberation.sha256sum] = "aa657434fcfaef5c461ac683fcb18d125f8991823817d8a18453fd27f9f8172b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    OFL-1.1 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-fonts/liberation/LICENSE-SIL;md5=a43a2b9d114c3c6db11bc4ffe235a9ba \
    file://src/github.com/go-fonts/liberation/LICENSE;md5=d4661c72619114abaed2fa5a27c77d7a \
"

GOSRC_INCLUDEGUARD += "github.com-go-fonts-liberation-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
