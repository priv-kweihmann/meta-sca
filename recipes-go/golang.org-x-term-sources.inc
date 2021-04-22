SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210422114643-f5beecf764ed.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210422114643-f5beecf764ed;downloadfilename=golang-org-x-term-0.0.0-20210422114643-f5beecf764ed.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "1863f67d2e13b70d6be375d851667ab396930874f1bdfe11bf5ac6d13e3fb586"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
