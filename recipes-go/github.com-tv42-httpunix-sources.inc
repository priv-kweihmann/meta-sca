SRC_URI += "https://proxy.golang.org/github.com/tv42/httpunix/@v/v0.0.0-20191220191345-2ba4b9c3382c.zip;srcoutput=github.com/tv42/httpunix;srcinput=github.com/tv42/httpunix@v0.0.0-20191220191345-2ba4b9c3382c;downloadfilename=github-com-tv42-httpunix-0.0.0-20191220191345-2ba4b9c3382c.zip;name=github-com-tv42-httpunix"
SRC_URI[github-com-tv42-httpunix.sha256sum] = "3835d37bfd63336db8f0b0971368e0e9a03d70a446b32e93cbd30e99ba6e9d27"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/tv42/httpunix/LICENSE;md5=3298cafd4f826018fff7e28e43da25ee \
"

GOSRC_INCLUDEGUARD += "github.com-tv42-httpunix-sources.inc"

