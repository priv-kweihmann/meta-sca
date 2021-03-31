SRC_URI_append = " https://proxy.golang.org/github.com/pkg/errors/@v/v0.9.1.zip;srcoutput=github.com/pkg/errors;srcinput=github.com/pkg/errors@v0.9.1;downloadfilename=github-com-pkg-errors-0.9.1.zip;name=github-com-pkg-errors"
SRC_URI[github-com-pkg-errors.sha256sum] = "d4c36b8bcd0616290a3913215e0f53b931bd6e00670596f2960df1b44af2bd07"

MOD_LICENSE_append = " \
    BSD-2-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/pkg/errors/LICENSE;md5=6fe682a02df52c6653f33bd0f7126b5a \
"
