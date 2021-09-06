SRC_URI += "https://proxy.golang.org/github.com/cespare/xxhash/v2/@v/v2.1.2.zip;srcoutput=github.com/cespare/xxhash/v2;srcinput=github.com/cespare/xxhash/v2@v2.1.2;downloadfilename=github-com-cespare-xxhash-v2-2.1.2.zip;name=github-com-cespare-xxhash-v2"
SRC_URI[github-com-cespare-xxhash-v2.sha256sum] = "ac641ac8330df61f677c87448fc679c47886087d2933a1e431556f423782ea38"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cespare/xxhash/v2/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
"

GOSRC_INCLUDEGUARD += "github.com-cespare-xxhash-v2-sources.inc"

