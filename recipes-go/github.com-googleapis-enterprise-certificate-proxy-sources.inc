SRC_URI += "https://proxy.golang.org/github.com/googleapis/enterprise-certificate-proxy/@v/v0.1.0.zip;srcoutput=github.com/googleapis/enterprise-certificate-proxy;srcinput=github.com/googleapis/enterprise-certificate-proxy@v0.1.0;downloadfilename=github-com-googleapis-enterprise-certificate-proxy-0.1.0.zip;name=github-com-googleapis-enterprise-certificate-proxy"
SRC_URI[github-com-googleapis-enterprise-certificate-proxy.sha256sum] = "ca1f9b8e2603fa806684476d4ff4d3a85b23c74ede314e613c008f6144b60642"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/googleapis/enterprise-certificate-proxy/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-googleapis-enterprise-certificate-proxy-sources.inc"

