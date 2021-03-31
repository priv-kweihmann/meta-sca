SRC_URI_append = " https://proxy.golang.org/github.com/mgechev/revive/@v/v1.0.5.zip;srcoutput=github.com/mgechev/revive;srcinput=github.com/mgechev/revive@v1.0.5;downloadfilename=github-com-mgechev-revive-1.0.5.zip;name=github-com-mgechev-revive"
SRC_URI[github-com-mgechev-revive.sha256sum] = "c7c78dee16f96878938e49c1e5c160135d3295d5384407852ff57d9815d1a967"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mgechev/revive/LICENSE;md5=6898b1ee52bce3bd296aba3dff3fffb0 \
"
