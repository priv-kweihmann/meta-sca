SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-retryablehttp/@v/v0.7.2.zip;srcoutput=github.com/hashicorp/go-retryablehttp;srcinput=github.com/hashicorp/go-retryablehttp@v0.7.2;downloadfilename=github-com-hashicorp-go-retryablehttp-0.7.2.zip;name=github-com-hashicorp-go-retryablehttp"
SRC_URI[github-com-hashicorp-go-retryablehttp.sha256sum] = "b128c874900be42e952d9e9ad5e0a380e0ced1f9d50465b4129006bd74f1b05b"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-retryablehttp/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-retryablehttp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-cleanhttp-sources.inc', '', 'github.com-hashicorp-go-cleanhttp-sources.inc', d)}
