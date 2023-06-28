SRC_URI += "https://proxy.golang.org/github.com/googleapis/enterprise-certificate-proxy/@v/v0.2.5.zip;srcoutput=github.com/googleapis/enterprise-certificate-proxy;srcinput=github.com/googleapis/enterprise-certificate-proxy@v0.2.5;downloadfilename=github-com-googleapis-enterprise-certificate-proxy-0.2.5.zip;name=github-com-googleapis-enterprise-certificate-proxy"
SRC_URI[github-com-googleapis-enterprise-certificate-proxy.sha256sum] = "588068f5a98b0fd46b326e2b5925949c85e61722a7f91c4d89c0f7f402d374ec"
GOSRC_REMOVEDIRS += "github.com/googleapis/enterprise-certificate-proxy/internal/signer/darwin"
GOSRC_REMOVEDIRS += "github.com/googleapis/enterprise-certificate-proxy/internal/signer/windows"
GOSRC_REMOVEDIRS += "github.com/googleapis/enterprise-certificate-proxy/windows"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/googleapis/enterprise-certificate-proxy/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-googleapis-enterprise-certificate-proxy-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-pkcs11-sources.inc', '', 'github.com-google-go-pkcs11-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
