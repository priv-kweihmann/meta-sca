SRC_URI += "https://proxy.golang.org/github.com/andybalholm/cascadia/@v/v1.2.0.zip;srcoutput=github.com/andybalholm/cascadia;srcinput=github.com/andybalholm/cascadia@v1.2.0;downloadfilename=github-com-andybalholm-cascadia-1.2.0.zip;name=github-com-andybalholm-cascadia"
SRC_URI[github-com-andybalholm-cascadia.sha256sum] = "8cc5679e5070e2076369e2f7a24341cf0ccb139f49cccf153f72902f24876d81"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/andybalholm/cascadia/LICENSE;md5=fd61b1ebe511f46d0dfcbbcc3f7d083a \
"

GOSRC_INCLUDEGUARD += "github.com-andybalholm-cascadia-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
