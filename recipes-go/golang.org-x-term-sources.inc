SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.41.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.41.0;downloadfilename=golang-org-x-term-0.41.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "91ca75a3f454d5ddede1f58c3e4fc8e169c6f3c037223ac0ac76e78234d22828"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
