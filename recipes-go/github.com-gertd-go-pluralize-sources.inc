SRC_URI += "https://proxy.golang.org/github.com/gertd/go-pluralize/@v/v0.2.1.zip;srcoutput=github.com/gertd/go-pluralize;srcinput=github.com/gertd/go-pluralize@v0.2.1;downloadfilename=github-com-gertd-go-pluralize-0.2.1.zip;name=github-com-gertd-go-pluralize"
SRC_URI[github-com-gertd-go-pluralize.sha256sum] = "f0f07fb3d0afc13b0c2436daf8400ad5d303246cca519f1a14962bfc586944be"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gertd/go-pluralize/LICENSE;md5=7e0362bb72180462b3e08e0cca202fc9 \
"

GOSRC_INCLUDEGUARD += "github.com-gertd-go-pluralize-sources.inc"

