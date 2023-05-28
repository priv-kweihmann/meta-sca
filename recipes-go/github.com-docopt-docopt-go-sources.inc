SRC_URI += "https://proxy.golang.org/github.com/docopt/docopt-go/@v/v0.0.0-20180111231733-ee0de3bc6815.zip;srcoutput=github.com/docopt/docopt-go;srcinput=github.com/docopt/docopt-go@v0.0.0-20180111231733-ee0de3bc6815;downloadfilename=github-com-docopt-docopt-go-0.0.0-20180111231733-ee0de3bc6815.zip;name=github-com-docopt-docopt-go"
SRC_URI[github-com-docopt-docopt-go.sha256sum] = "00aad861d150c62598ca4fb01cfbe15c2eefb5186df7e5d4a59286dcf09556c8"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/docopt/docopt-go/LICENSE;md5=d23bb93e1219e0cfe34c0417b3d2a96a \
"

GOSRC_INCLUDEGUARD += "github.com-docopt-docopt-go-sources.inc"

