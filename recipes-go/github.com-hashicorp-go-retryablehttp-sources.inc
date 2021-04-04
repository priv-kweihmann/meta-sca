SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-retryablehttp/@v/v0.6.8.zip;srcoutput=github.com/hashicorp/go-retryablehttp;srcinput=github.com/hashicorp/go-retryablehttp@v0.6.8;downloadfilename=github-com-hashicorp-go-retryablehttp-0.6.8.zip;name=github-com-hashicorp-go-retryablehttp"
SRC_URI[github-com-hashicorp-go-retryablehttp.sha256sum] = "01d3574d31385b4d7ea639ddddbb471e7eaad6204426cc9cff54974e9bb48f3b"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-retryablehttp/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-retryablehttp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-cleanhttp-sources.inc', '', 'github.com-hashicorp-go-cleanhttp-sources.inc', d)}
