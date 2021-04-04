SRC_URI += "https://proxy.golang.org/github.com/alexkohler/noret/@v/v0.0.0-20190804174149-57c4d447ca7a.zip;srcoutput=github.com/alexkohler/noret;srcinput=github.com/alexkohler/noret@v0.0.0-20190804174149-57c4d447ca7a;downloadfilename=github-com-alexkohler-noret-0.0.0-20190804174149-57c4d447ca7a.zip;name=github-com-alexkohler-noret"
SRC_URI[github-com-alexkohler-noret.sha256sum] = "beeea1d58be01a1080c49b62e4decd24c170dce97b697270c8c34688f47a6278"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alexkohler/noret/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
"

GOSRC_INCLUDEGUARD += "github.com-alexkohler-noret-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
