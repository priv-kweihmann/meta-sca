SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.36.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.36.0;downloadfilename=golang-org-x-term-0.36.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "b6773eb737a1269579913418c72aa4f3195e2a1f63c6f01080cc7435cbe55eac"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
