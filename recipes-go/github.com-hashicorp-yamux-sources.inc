SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/yamux/@v/v0.0.0-20210316155119-a95892c5f864.zip;srcoutput=github.com/hashicorp/yamux;srcinput=github.com/hashicorp/yamux@v0.0.0-20210316155119-a95892c5f864;downloadfilename=github-com-hashicorp-yamux-0.0.0-20210316155119-a95892c5f864.zip;name=github-com-hashicorp-yamux"
SRC_URI[github-com-hashicorp-yamux.sha256sum] = "29276123fd52a3f103aba4b91084c91ca52673a4438ce88e41b105af17be5d82"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/yamux/LICENSE;md5=2dd1a9ecf92cd5617f128808f9b85b44 \
"
