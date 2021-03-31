SRC_URI_append = " https://proxy.golang.org/github.com/mattn/go-colorable/@v/v0.1.8.zip;srcoutput=github.com/mattn/go-colorable;srcinput=github.com/mattn/go-colorable@v0.1.8;downloadfilename=github-com-mattn-go-colorable-0.1.8.zip;name=github-com-mattn-go-colorable"
SRC_URI[github-com-mattn-go-colorable.sha256sum] = "7a488866ca8dbefc2b9e62a9a7ab6de3db4e1b85a9a665908ff03515d365cdc1"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mattn/go-colorable/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"
