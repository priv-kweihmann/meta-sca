SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20221019170559-20944726eadf.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20221019170559-20944726eadf;downloadfilename=golang-org-x-exp-0.0.0-20221019170559-20944726eadf.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "a66acc96216e9f7e20de70b55e5a5ad6faefc4bae384aa723d1cc69abf96512a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
