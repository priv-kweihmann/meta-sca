SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.33.0.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.33.0;downloadfilename=golang-org-x-text-0.33.0.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "f01cdf85f6a597aa4526d68b5c2e5a3470a6f162b96bb9867af37f059b96db5a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/text/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
