SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210615171337-6886f2dfbf5b.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210615171337-6886f2dfbf5b;downloadfilename=golang-org-x-term-0.0.0-20210615171337-6886f2dfbf5b.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "adf99d5de981d47f5767a9117bdb4ed8044e98673980dce0beeece7dd1c9c896"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
