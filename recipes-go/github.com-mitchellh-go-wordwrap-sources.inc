SRC_URI_append = " https://proxy.golang.org/github.com/mitchellh/go-wordwrap/@v/v1.0.1.zip;srcoutput=github.com/mitchellh/go-wordwrap;srcinput=github.com/mitchellh/go-wordwrap@v1.0.1;downloadfilename=github-com-mitchellh-go-wordwrap-1.0.1.zip;name=github-com-mitchellh-go-wordwrap"
SRC_URI[github-com-mitchellh-go-wordwrap.sha256sum] = "5f96426c4b3b3e90a9b7471568cb1d61d6a306744f5d4765a30fa8a61e1c0b47"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mitchellh/go-wordwrap/LICENSE.md;md5=56da355a12d4821cda57b8f23ec34bc4 \
"
