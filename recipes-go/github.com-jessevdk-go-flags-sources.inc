SRC_URI += "https://proxy.golang.org/github.com/jessevdk/go-flags/@v/v1.5.0.zip;srcoutput=github.com/jessevdk/go-flags;srcinput=github.com/jessevdk/go-flags@v1.5.0;downloadfilename=github-com-jessevdk-go-flags-1.5.0.zip;name=github-com-jessevdk-go-flags"
SRC_URI[github-com-jessevdk-go-flags.sha256sum] = "9886379a8c31f9021ce68490e2a21bdbea7e5fe95533229650e1ac1571dcd78a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jessevdk/go-flags/LICENSE;md5=808b70f61299cac3989a0b3f6162c93d \
"

GOSRC_INCLUDEGUARD += "github.com-jessevdk-go-flags-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
