SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.24.0.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.24.0;downloadfilename=golang-org-x-text-0.24.0.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "f585335a57a6fa5fa0c0bf319b45f0909e5ff1aba91e8567187ba8e423084c00"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/text/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
