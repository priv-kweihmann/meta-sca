SRC_URI += "https://proxy.golang.org/github.com/go-toolsmith/astcast/@v/v1.0.0.zip;srcoutput=github.com/go-toolsmith/astcast;srcinput=github.com/go-toolsmith/astcast@v1.0.0;downloadfilename=github-com-go-toolsmith-astcast-1.0.0.zip;name=github-com-go-toolsmith-astcast"
SRC_URI[github-com-go-toolsmith-astcast.sha256sum] = "bdf8273518c3406527a67d01bde4feed4e303b262391a2672283414dee1f660a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-toolsmith/astcast/LICENSE;md5=eb5e5cdecfe2b39a637e7494505d6fa6 \
"

GOSRC_INCLUDEGUARD += "github.com-go-toolsmith-astcast-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-toolsmith-strparse-sources.inc', '', 'github.com-go-toolsmith-strparse-sources.inc', d)}
