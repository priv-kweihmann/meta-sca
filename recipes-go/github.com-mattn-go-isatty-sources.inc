SRC_URI_append = " https://proxy.golang.org/github.com/mattn/go-isatty/@v/v0.0.12.zip;srcoutput=github.com/mattn/go-isatty;srcinput=github.com/mattn/go-isatty@v0.0.12;downloadfilename=github-com-mattn-go-isatty-0.0.12.zip;name=github-com-mattn-go-isatty"
SRC_URI[github-com-mattn-go-isatty.sha256sum] = "07941d24e0894c29dc42bcd29d644815cd7b5ee84e3c14bbe6d51ad13efcbf07"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mattn/go-isatty/LICENSE;md5=f509beadd5a11227c27b5d2ad6c9f2c6 \
"
