SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.25.0.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.25.0;downloadfilename=golang-org-x-text-0.25.0.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "3f218b1dd9a690036d1226f46f142fc7ae3cc9cd4f28610b96bb8080b7e194c9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/text/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
