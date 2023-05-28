SRC_URI += "https://proxy.golang.org/github.com/zeebo/xxh3/@v/v1.0.2.zip;srcoutput=github.com/zeebo/xxh3;srcinput=github.com/zeebo/xxh3@v1.0.2;downloadfilename=github-com-zeebo-xxh3-1.0.2.zip;name=github-com-zeebo-xxh3"
SRC_URI[github-com-zeebo-xxh3.sha256sum] = "190e5ef1f672e9321a1580bdd31c6440fde6044ca8168d2b489cf50cdc4f58a6"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/zeebo/xxh3/LICENSE;md5=acf3e468cbf92b877ec5cdff11749253 \
"

GOSRC_INCLUDEGUARD += "github.com-zeebo-xxh3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-klauspost-cpuid-v2-sources.inc', '', 'github.com-klauspost-cpuid-v2-sources.inc', d)}
