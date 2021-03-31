SRC_URI_append = " https://proxy.golang.org/github.com/rivo/uniseg/@v/v0.2.0.zip;srcoutput=github.com/rivo/uniseg;srcinput=github.com/rivo/uniseg@v0.2.0;downloadfilename=github-com-rivo-uniseg-0.2.0.zip;name=github-com-rivo-uniseg"
SRC_URI[github-com-rivo-uniseg.sha256sum] = "3199d94be50284142220662ca3b00e19ddd1debe4e80ddc745ff4203ecb601c0"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/rivo/uniseg/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c \
"
