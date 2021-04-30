SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-retryablehttp/@v/v0.7.0.zip;srcoutput=github.com/hashicorp/go-retryablehttp;srcinput=github.com/hashicorp/go-retryablehttp@v0.7.0;downloadfilename=github-com-hashicorp-go-retryablehttp-0.7.0.zip;name=github-com-hashicorp-go-retryablehttp"
SRC_URI[github-com-hashicorp-go-retryablehttp.sha256sum] = "a11a3f6c2a5fbaa1b251c4e5ad809eea46c342991cf33ac32ddbc38372dda6b2"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-retryablehttp/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-retryablehttp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-cleanhttp-sources.inc', '', 'github.com-hashicorp-go-cleanhttp-sources.inc', d)}
