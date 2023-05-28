SRC_URI += "https://proxy.golang.org/github.com/googleapis/enterprise-certificate-proxy/@v/v0.2.3.zip;srcoutput=github.com/googleapis/enterprise-certificate-proxy;srcinput=github.com/googleapis/enterprise-certificate-proxy@v0.2.3;downloadfilename=github-com-googleapis-enterprise-certificate-proxy-0.2.3.zip;name=github-com-googleapis-enterprise-certificate-proxy"
SRC_URI[github-com-googleapis-enterprise-certificate-proxy.sha256sum] = "e3a5b32ca7fc4f8bc36274d87c3547975a2b0603b2a1e4b1129530504d9ddeb7"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/googleapis/enterprise-certificate-proxy/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-googleapis-enterprise-certificate-proxy-sources.inc"

