SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-cleanhttp/@v/v0.5.2.zip;srcoutput=github.com/hashicorp/go-cleanhttp;srcinput=github.com/hashicorp/go-cleanhttp@v0.5.2;downloadfilename=github-com-hashicorp-go-cleanhttp-0.5.2.zip;name=github-com-hashicorp-go-cleanhttp"
SRC_URI[github-com-hashicorp-go-cleanhttp.sha256sum] = "e9f3dcfcb33172ba499b4f8e888169252d7f1e072082182124a6e2053523f7df"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-cleanhttp/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-cleanhttp-sources.inc"

