SRC_URI += "https://proxy.golang.org/github.com/go-toolsmith/typep/@v/v1.0.2.zip;srcoutput=github.com/go-toolsmith/typep;srcinput=github.com/go-toolsmith/typep@v1.0.2;downloadfilename=github-com-go-toolsmith-typep-1.0.2.zip;name=github-com-go-toolsmith-typep"
SRC_URI[github-com-go-toolsmith-typep.sha256sum] = "f1a06ea4ae9b2dbf40e985f625f1c61d810255907c07d398e21330b3107b7b57"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-toolsmith/typep/LICENSE;md5=eb5e5cdecfe2b39a637e7494505d6fa6 \
"

GOSRC_INCLUDEGUARD += "github.com-go-toolsmith-typep-sources.inc"

