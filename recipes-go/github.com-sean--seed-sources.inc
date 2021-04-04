SRC_URI += "https://proxy.golang.org/github.com/sean-/seed/@v/v0.0.0-20170313163322-e2103e2c3529.zip;srcoutput=github.com/sean-/seed;srcinput=github.com/sean-/seed@v0.0.0-20170313163322-e2103e2c3529;downloadfilename=github-com-sean--seed-0.0.0-20170313163322-e2103e2c3529.zip;name=github-com-sean--seed"
SRC_URI[github-com-sean--seed.sha256sum] = "0bc8e6e0a07e554674b0bb92ef4eb7de1650056b50878eed8d5d631aec9b6362"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sean-/seed/LICENSE;md5=ae6a5709472e0833798453b9fa793364 \
"

GOSRC_INCLUDEGUARD += "github.com-sean--seed-sources.inc"

