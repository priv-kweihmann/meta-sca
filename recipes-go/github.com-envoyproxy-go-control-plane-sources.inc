SRC_URI_append = " https://proxy.golang.org/github.com/envoyproxy/go-control-plane/@v/v0.9.8.zip;srcoutput=github.com/envoyproxy/go-control-plane;srcinput=github.com/envoyproxy/go-control-plane@v0.9.8;downloadfilename=github-com-envoyproxy-go-control-plane-0.9.8.zip;name=github-com-envoyproxy-go-control-plane"
SRC_URI[github-com-envoyproxy-go-control-plane.sha256sum] = "2ee5849552a1a5c794c705b2376e6b8f317d99a577f63743a60a93bfea8a2447"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/envoyproxy/go-control-plane/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"
