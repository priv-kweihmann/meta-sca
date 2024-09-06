SRC_URI += "https://proxy.golang.org/github.com/muesli/cancelreader/@v/v0.2.2.zip;srcoutput=github.com/muesli/cancelreader;srcinput=github.com/muesli/cancelreader@v0.2.2;downloadfilename=github-com-muesli-cancelreader-0.2.2.zip;name=github-com-muesli-cancelreader"
SRC_URI[github-com-muesli-cancelreader.sha256sum] = "f0654e7f8f8a49b02ff10a75ccaa0eb08a65aaacbc45f5ba93305276e2ac7f61"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/muesli/cancelreader/LICENSE;md5=ab12cc3eb7227b30073651c468c85f68 \
"

GOSRC_INCLUDEGUARD += "github.com-muesli-cancelreader-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
