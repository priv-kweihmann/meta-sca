SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.26.0.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.26.0;downloadfilename=golang-org-x-text-0.26.0.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "c524f4ace2e1f35b75d9e6177b1597cf31736c81064df5978a4d61300d7626c8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/text/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
