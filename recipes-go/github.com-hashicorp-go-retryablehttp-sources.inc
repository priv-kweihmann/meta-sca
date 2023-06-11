SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-retryablehttp/@v/v0.7.4.zip;srcoutput=github.com/hashicorp/go-retryablehttp;srcinput=github.com/hashicorp/go-retryablehttp@v0.7.4;downloadfilename=github-com-hashicorp-go-retryablehttp-0.7.4.zip;name=github-com-hashicorp-go-retryablehttp"
SRC_URI[github-com-hashicorp-go-retryablehttp.sha256sum] = "00f6d85c5c8b327f56d49ad48ef1d2df94affea340ca46ce827415ba75db4712"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-retryablehttp/LICENSE;md5=bffc21c92b5f3adcbbb06f8e0067e786 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-retryablehttp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-cleanhttp-sources.inc', '', 'github.com-hashicorp-go-cleanhttp-sources.inc', d)}
