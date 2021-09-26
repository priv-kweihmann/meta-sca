SRC_URI += "https://proxy.golang.org/github.com/andybalholm/cascadia/@v/v1.3.1.zip;srcoutput=github.com/andybalholm/cascadia;srcinput=github.com/andybalholm/cascadia@v1.3.1;downloadfilename=github-com-andybalholm-cascadia-1.3.1.zip;name=github-com-andybalholm-cascadia"
SRC_URI[github-com-andybalholm-cascadia.sha256sum] = "735e7163f7774254cd4f96ad380b5ea8ccf702dac5399dbe30dd0387172c5a51"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/andybalholm/cascadia/LICENSE;md5=fd61b1ebe511f46d0dfcbbcc3f7d083a \
"

GOSRC_INCLUDEGUARD += "github.com-andybalholm-cascadia-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
