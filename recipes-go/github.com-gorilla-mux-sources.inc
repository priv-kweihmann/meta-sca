SRC_URI_append = " https://proxy.golang.org/github.com/gorilla/mux/@v/v1.8.0.zip;srcoutput=github.com/gorilla/mux;srcinput=github.com/gorilla/mux@v1.8.0;downloadfilename=github-com-gorilla-mux-1.8.0.zip;name=github-com-gorilla-mux"
SRC_URI[github-com-gorilla-mux.sha256sum] = "7641911e00af9c91f089868333067c9cb9a58702d2c9ea821ee374940091c385"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/gorilla/mux/LICENSE;md5=33fa1116c45f9e8de714033f99edde13 \
"
