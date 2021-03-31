SRC_URI_append = " https://proxy.golang.org/github.com/cespare/xxhash/v2/@v/v2.1.1.zip;srcoutput=github.com/cespare/xxhash/v2;srcinput=github.com/cespare/xxhash/v2@v2.1.1;downloadfilename=github-com-cespare-xxhash-v2-2.1.1.zip;name=github-com-cespare-xxhash-v2"
SRC_URI[github-com-cespare-xxhash-v2.sha256sum] = "5baa031c72e73e42617f0fd74e7d813344850bd6a6073381b6a4160a5e9cb59e"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/cespare/xxhash/v2/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
"
