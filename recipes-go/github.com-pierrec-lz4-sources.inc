SRC_URI_append = " https://proxy.golang.org/github.com/pierrec/lz4/@v/v2.6.0+incompatible.zip;srcoutput=github.com/pierrec/lz4;srcinput=github.com/pierrec/lz4@v2.6.0+incompatible;downloadfilename=github-com-pierrec-lz4-2.6.0+incompatible.zip;name=github-com-pierrec-lz4"
SRC_URI[github-com-pierrec-lz4.sha256sum] = "3442d00156073088858844e4e25753b683ef1d39a5ff9f912079f7f8a1d72a61"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"
