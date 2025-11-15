SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.31.0.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.31.0;downloadfilename=golang-org-x-text-0.31.0.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "10d76a358ae35fae9523ffef7b378ec30f2e73bc3f99ba40e46a6cb722ad888a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/text/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
