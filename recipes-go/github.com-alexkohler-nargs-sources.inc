SRC_URI += "https://proxy.golang.org/github.com/alexkohler/nargs/@v/v0.0.0-20200419150446-2df8ecd3c73a.zip;srcoutput=github.com/alexkohler/nargs;srcinput=github.com/alexkohler/nargs@v0.0.0-20200419150446-2df8ecd3c73a;downloadfilename=github-com-alexkohler-nargs-0.0.0-20200419150446-2df8ecd3c73a.zip;name=github-com-alexkohler-nargs"
SRC_URI[github-com-alexkohler-nargs.sha256sum] = "caad335519975a69088fc5ff5a63030e28c287ae11a8573b396b61cc54148a48"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alexkohler/nargs/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
"

GOSRC_INCLUDEGUARD += "github.com-alexkohler-nargs-sources.inc"

