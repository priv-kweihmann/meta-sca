SRC_URI_append = " https://proxy.golang.org/github.com/alexkohler/nakedret/@v/v1.0.0.zip;srcoutput=github.com/alexkohler/nakedret;srcinput=github.com/alexkohler/nakedret@v1.0.0;downloadfilename=github-com-alexkohler-nakedret-1.0.0.zip;name=github-com-alexkohler-nakedret"
SRC_URI[github-com-alexkohler-nakedret.sha256sum] = "49085b54732ebb40eead03d29fd46b88a5a2240d90849e3d2ddc85dbf607905e"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/alexkohler/nakedret/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
"
