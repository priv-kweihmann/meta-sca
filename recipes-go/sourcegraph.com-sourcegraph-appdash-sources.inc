SRC_URI_append = " https://proxy.golang.org/sourcegraph.com/sourcegraph/appdash/@v/v0.0.0-20190731080439-ebfcffb1b5c0.zip;srcoutput=sourcegraph.com/sourcegraph/appdash;srcinput=sourcegraph.com/sourcegraph/appdash@v0.0.0-20190731080439-ebfcffb1b5c0;downloadfilename=sourcegraph-com-sourcegraph-appdash-0.0.0-20190731080439-ebfcffb1b5c0.zip;name=sourcegraph-com-sourcegraph-appdash"
SRC_URI[sourcegraph-com-sourcegraph-appdash.sha256sum] = "bd2492d9db05362c2fecd0b3d0f6002c89a6d90d678fb93b4158298ab883736f"

MOD_LICENSE_append = " \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/sourcegraph.com/sourcegraph/appdash/LICENSE;md5=7382694b07abfd90abcab68784334326 \
"
