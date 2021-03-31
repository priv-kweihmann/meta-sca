SRC_URI_append = " https://proxy.golang.org/github.com/jmespath/go-jmespath/@v/v0.4.0.zip;srcoutput=github.com/jmespath/go-jmespath;srcinput=github.com/jmespath/go-jmespath@v0.4.0;downloadfilename=github-com-jmespath-go-jmespath-0.4.0.zip;name=github-com-jmespath-go-jmespath"
SRC_URI[github-com-jmespath-go-jmespath.sha256sum] = "d1f77b6790d7c4321a74260f3675683d3ac06b0a614b5f83e870beae0a8b2867"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/jmespath/go-jmespath/LICENSE;md5=9abfa8353fce3f2cb28364e1e9016852 \
"
