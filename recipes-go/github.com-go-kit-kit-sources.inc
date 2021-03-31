SRC_URI_append = " https://proxy.golang.org/github.com/go-kit/kit/@v/v0.10.0.zip;srcoutput=github.com/go-kit/kit;srcinput=github.com/go-kit/kit@v0.10.0;downloadfilename=github-com-go-kit-kit-0.10.0.zip;name=github-com-go-kit-kit"
SRC_URI[github-com-go-kit-kit.sha256sum] = "dbdc933092b036483ca332f8c7c13e8b7d029192e79354d4f5a581ef3c364816"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/go-kit/kit/LICENSE;md5=8e845ab50365175be4ee5d9703dbe45e \
    file://src/github.com/go-kit/kit/log/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"
