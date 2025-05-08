SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.32.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.32.0;downloadfilename=golang-org-x-term-0.32.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "e31f47c791e37f7dd1c12ad47015cf19f4a1903ac1792dacb724c5607e44c455"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
