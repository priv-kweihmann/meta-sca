SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.27.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.27.0;downloadfilename=golang-org-x-term-0.27.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "a4cf3d2cab860c5aad555d58c2545ebced118c1610d854fdb302b9c2866d858e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
