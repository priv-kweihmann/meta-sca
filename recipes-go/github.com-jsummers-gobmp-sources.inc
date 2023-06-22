SRC_URI += "https://proxy.golang.org/github.com/jsummers/gobmp/@v/v0.0.0-20230614200233-a9de23ed2e25.zip;srcoutput=github.com/jsummers/gobmp;srcinput=github.com/jsummers/gobmp@v0.0.0-20230614200233-a9de23ed2e25;downloadfilename=github-com-jsummers-gobmp-0.0.0-20230614200233-a9de23ed2e25.zip;name=github-com-jsummers-gobmp"
SRC_URI[github-com-jsummers-gobmp.sha256sum] = "e0d7e249d24cc85736529e7984ed2a7ac1579acef570efdc5114456928371b69"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jsummers/gobmp/COPYING.txt;md5=b156ef4e909264ec48e97d428e830c20 \
"

GOSRC_INCLUDEGUARD += "github.com-jsummers-gobmp-sources.inc"

