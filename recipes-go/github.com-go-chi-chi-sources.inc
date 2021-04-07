SRC_URI += "https://proxy.golang.org/github.com/go-chi/chi/@v/v4.1.2+incompatible.zip;srcoutput=github.com/go-chi/chi;srcinput=github.com/go-chi/chi@v4.1.2+incompatible;downloadfilename=github-com-go-chi-chi-4.1.2+incompatible.zip;name=github-com-go-chi-chi"
SRC_URI[github-com-go-chi-chi.sha256sum] = "b18ec574b5d476df20b181724fdb46180d277a4040dbbbd45e277cc4ce7d04ec"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-chi/chi/LICENSE;md5=eef59fdf1c5117072cbf52b79c6ea691 \
"

GOSRC_INCLUDEGUARD += "github.com-go-chi-chi-sources.inc"

