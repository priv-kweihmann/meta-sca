SRC_URI += "https://proxy.golang.org/github.com/go-text/typesetting-utils/@v/v0.0.0-20230118084914-08192cce2b12.zip;srcoutput=github.com/go-text/typesetting-utils;srcinput=github.com/go-text/typesetting-utils@v0.0.0-20230118084914-08192cce2b12;downloadfilename=github-com-go-text-typesetting-utils-0.0.0-20230118084914-08192cce2b12.zip;name=github-com-go-text-typesetting-utils"
SRC_URI[github-com-go-text-typesetting-utils.sha256sum] = "6dad3e6445afc514b4cdb81ce42eea079eff2d080e0f0142ab691f0c865eaac4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-text/typesetting-utils/LICENSE;md5=165d8228d73aa036b651190f1fb41a77 \
"

GOSRC_INCLUDEGUARD += "github.com-go-text-typesetting-utils-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
