SRC_URI_append = " https://proxy.golang.org/honnef.co/go/tools/@v/v0.1.3.zip;srcoutput=honnef.co/go/tools;srcinput=honnef.co/go/tools@v0.1.3;downloadfilename=honnef-co-go-tools-0.1.3.zip;name=honnef-co-go-tools"
SRC_URI[honnef-co-go-tools.sha256sum] = "4607c8c642126be0632ce8b1e82b34f04404bb40c62e5982bf4572e3e08d0751"

MOD_LICENSE_append = " \
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/honnef.co/go/tools/LICENSE-THIRD-PARTY;md5=310cf4b1e8d243f332294d0ac2c88d97 \
    file://src/honnef.co/go/tools/LICENSE;md5=ca0492e2abd2c12b3f3c25d6e33972ad \
    file://src/honnef.co/go/tools/go/gcsizes/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/honnef.co/go/tools/go/ir/LICENSE;md5=5ec8b64b7997364598d73f2d1e94f474 \
    file://src/honnef.co/go/tools/internal/gosmith/LICENSE;md5=34371deb29bfed5ca2285fbe4b9df6f5 \
"
