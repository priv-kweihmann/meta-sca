SRC_URI += "https://proxy.golang.org/github.com/clipperhouse/stringish/@v/v0.1.1.zip;srcoutput=github.com/clipperhouse/stringish;srcinput=github.com/clipperhouse/stringish@v0.1.1;downloadfilename=github-com-clipperhouse-stringish-0.1.1.zip;name=github-com-clipperhouse-stringish"
SRC_URI[github-com-clipperhouse-stringish.sha256sum] = "b64486091fd9c743a51a025c0c171b0d6f43e5a8fbba799e6d3029f79315621f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/clipperhouse/stringish/LICENSE;md5=5650f352443b7675de3495a7be2c7454 \
    file://github.com/clipperhouse/stringish/utf8/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "github.com-clipperhouse-stringish-sources.inc"

