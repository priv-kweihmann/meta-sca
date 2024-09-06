SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.18.0.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.18.0;downloadfilename=golang-org-x-text-0.18.0.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "09da08281c6854e695cdffb25569df0abf53fe545c6610be09d58294728e81e5"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/text/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
