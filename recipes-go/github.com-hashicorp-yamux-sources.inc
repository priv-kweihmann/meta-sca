SRC_URI += "https://proxy.golang.org/github.com/hashicorp/yamux/@v/v0.0.0-20210707203944-259a57b3608c.zip;srcoutput=github.com/hashicorp/yamux;srcinput=github.com/hashicorp/yamux@v0.0.0-20210707203944-259a57b3608c;downloadfilename=github-com-hashicorp-yamux-0.0.0-20210707203944-259a57b3608c.zip;name=github-com-hashicorp-yamux"
SRC_URI[github-com-hashicorp-yamux.sha256sum] = "ec3301f9f91fc9af4bb9811d297a8e8cfdcae92fdb00d845d47da49add4d2f8b"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/yamux/LICENSE;md5=2dd1a9ecf92cd5617f128808f9b85b44 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-yamux-sources.inc"

