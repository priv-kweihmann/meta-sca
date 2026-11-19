SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.48.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.48.0;downloadfilename=golang-org-x-term-0.48.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "3f6dfe1b6031005d556ad54027c191636299aa4496fd631d1b1dcd23ada8bec7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
