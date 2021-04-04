SRC_URI += "https://proxy.golang.org/github.com/go-chi/chi/@v/v1.5.4.zip;srcoutput=github.com/go-chi/chi;srcinput=github.com/go-chi/chi@v1.5.4;downloadfilename=github-com-go-chi-chi-1.5.4.zip;name=github-com-go-chi-chi"
SRC_URI[github-com-go-chi-chi.sha256sum] = "e3f9fecb9fcf42e7b198167c43ec3ecfd31fc588ec0f9daf28a4a01f821477a5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-chi/chi/LICENSE;md5=eef59fdf1c5117072cbf52b79c6ea691 \
"

GOSRC_INCLUDEGUARD += "github.com-go-chi-chi-sources.inc"

