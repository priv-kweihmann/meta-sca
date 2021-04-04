SRC_URI += "https://proxy.golang.org/github.com/jcmturner/rpc/v2/@v/v2.0.3.zip;srcoutput=github.com/jcmturner/rpc/v2;srcinput=github.com/jcmturner/rpc/v2@v2.0.3;downloadfilename=github-com-jcmturner-rpc-v2-2.0.3.zip;name=github-com-jcmturner-rpc-v2"
SRC_URI[github-com-jcmturner-rpc-v2.sha256sum] = "90c595355e5e2c9dc1e1ae71a88491a04c34d8791180098da103217cbf5f5574"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jcmturner/rpc/v2/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-jcmturner-rpc-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
