SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/memberlist/@v/v0.2.3.zip;srcoutput=github.com/hashicorp/memberlist;srcinput=github.com/hashicorp/memberlist@v0.2.3;downloadfilename=github-com-hashicorp-memberlist-0.2.3.zip;name=github-com-hashicorp-memberlist"
SRC_URI[github-com-hashicorp-memberlist.sha256sum] = "f3d4d600da8e00087a6ba54eb3ab8a711d105bd8964907f2b5d4e96d959e814c"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/memberlist/LICENSE;md5=b278a92d2c1509760384428817710378 \
"
