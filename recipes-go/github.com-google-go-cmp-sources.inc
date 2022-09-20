SRC_URI += "https://proxy.golang.org/github.com/google/go-cmp/@v/v0.5.9.zip;srcoutput=github.com/google/go-cmp;srcinput=github.com/google/go-cmp@v0.5.9;downloadfilename=github-com-google-go-cmp-0.5.9.zip;name=github-com-google-go-cmp"
SRC_URI[github-com-google-go-cmp.sha256sum] = "32450874ac756ef5d47f6b819305105304b9819045a16e3f105289b7cf252c51"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/go-cmp/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
"

GOSRC_INCLUDEGUARD += "github.com-google-go-cmp-sources.inc"

