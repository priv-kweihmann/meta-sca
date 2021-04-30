SRC_URI += "https://proxy.golang.org/github.com/klauspost/compress/@v/v1.12.2.zip;srcoutput=github.com/klauspost/compress;srcinput=github.com/klauspost/compress@v1.12.2;downloadfilename=github-com-klauspost-compress-1.12.2.zip;name=github-com-klauspost-compress"
SRC_URI[github-com-klauspost-compress.sha256sum] = "3ee1002a074ab6506a6129ace9d567f8519174f4ec46f8e3101c0547d77058e5"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/klauspost/compress/LICENSE;md5=f6eed50d75781660de81b193021f14a2 \
    file://src/github.com/klauspost/compress/s2/LICENSE;md5=2460814a2b25a7277556c2d89de915d1 \
    file://src/github.com/klauspost/compress/s2/cmd/internal/readahead/LICENSE;md5=42a7f8bb0a8aa77348e7e5817f10976a \
    file://src/github.com/klauspost/compress/zstd/internal/xxhash/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
"

GOSRC_INCLUDEGUARD += "github.com-klauspost-compress-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-snappy-sources.inc', '', 'github.com-golang-snappy-sources.inc', d)}
