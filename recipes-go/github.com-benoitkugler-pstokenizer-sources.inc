SRC_URI += "https://proxy.golang.org/github.com/benoitkugler/pstokenizer/@v/v1.0.1.zip;srcoutput=github.com/benoitkugler/pstokenizer;srcinput=github.com/benoitkugler/pstokenizer@v1.0.1;downloadfilename=github-com-benoitkugler-pstokenizer-1.0.1.zip;name=github-com-benoitkugler-pstokenizer"
SRC_URI[github-com-benoitkugler-pstokenizer.sha256sum] = "6cfdcf021773b53b5e03860c157413aeb6e090958e5b3d721b648d73596d5c0f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/benoitkugler/pstokenizer/LICENSE;md5=df65e9e2a0877cce974ddfc6e3fdd6b4 \
"

GOSRC_INCLUDEGUARD += "github.com-benoitkugler-pstokenizer-sources.inc"

