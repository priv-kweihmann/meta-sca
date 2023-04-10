SRC_URI += "https://proxy.golang.org/github.com/rogpeppe/go-internal/@v/v1.10.0.zip;srcoutput=github.com/rogpeppe/go-internal;srcinput=github.com/rogpeppe/go-internal@v1.10.0;downloadfilename=github-com-rogpeppe-go-internal-1.10.0.zip;name=github-com-rogpeppe-go-internal"
SRC_URI[github-com-rogpeppe-go-internal.sha256sum] = "87774aa95156e10f1ae865004bd8f240bbe95f18160e62c12fdfa2ece57f7456"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rogpeppe/go-internal/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"

GOSRC_INCLUDEGUARD += "github.com-rogpeppe-go-internal-sources.inc"

