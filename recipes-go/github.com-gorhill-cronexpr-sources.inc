SRC_URI_append = " https://proxy.golang.org/github.com/gorhill/cronexpr/@v/v0.0.0-20180427100037-88b0669f7d75.zip;srcoutput=github.com/gorhill/cronexpr;srcinput=github.com/gorhill/cronexpr@v0.0.0-20180427100037-88b0669f7d75;downloadfilename=github-com-gorhill-cronexpr-0.0.0-20180427100037-88b0669f7d75.zip;name=github-com-gorhill-cronexpr"
SRC_URI[github-com-gorhill-cronexpr.sha256sum] = "742d8957d3f9fe773150fb3164868a755b2af5b705b38c72c45ca5386715c617"

MOD_LICENSE_append = " \
    GPLv3 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/gorhill/cronexpr/GPLv3;md5=f3d2b3f33b4cee4675268fdb8e76ca32 \
"
