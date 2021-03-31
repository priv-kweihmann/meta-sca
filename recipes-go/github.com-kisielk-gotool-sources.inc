SRC_URI_append = " https://proxy.golang.org/github.com/kisielk/gotool/@v/v1.0.0.zip;srcoutput=github.com/kisielk/gotool;srcinput=github.com/kisielk/gotool@v1.0.0;downloadfilename=github-com-kisielk-gotool-1.0.0.zip;name=github-com-kisielk-gotool"
SRC_URI[github-com-kisielk-gotool.sha256sum] = "089dbba6e3aa09944fdb40d72acc86694e8bdde01cfc0f40fe0248309eb80a3f"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/kisielk/gotool/LICENSE;md5=fff1ad9eb4a97976f126153f3ad79f2a \
"
