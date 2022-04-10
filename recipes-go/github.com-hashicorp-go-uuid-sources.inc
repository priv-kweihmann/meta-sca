SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-uuid/@v/v1.0.3.zip;srcoutput=github.com/hashicorp/go-uuid;srcinput=github.com/hashicorp/go-uuid@v1.0.3;downloadfilename=github-com-hashicorp-go-uuid-1.0.3.zip;name=github-com-hashicorp-go-uuid"
SRC_URI[github-com-hashicorp-go-uuid.sha256sum] = "5e9dc2bb3785d69a65d287a4b3fa7e9f583a127e41c6a2fd095ac862fed71dad"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-uuid/LICENSE;md5=1694f6ca1fdc81a15c1fd408542d47e6 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-uuid-sources.inc"

