SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.40.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.40.0;downloadfilename=golang-org-x-term-0.40.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "0db7403b4618db811ee8472fc70fe9d8957070528a4a21c8da2134d11b7d81b7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
