SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/go-sockaddr/@v/v1.0.2.zip;srcoutput=github.com/hashicorp/go-sockaddr;srcinput=github.com/hashicorp/go-sockaddr@v1.0.2;downloadfilename=github-com-hashicorp-go-sockaddr-1.0.2.zip;name=github-com-hashicorp-go-sockaddr"
SRC_URI[github-com-hashicorp-go-sockaddr.sha256sum] = "50c1b60863b0cd31d03b26d3975f76cab55466666c067cd1823481a61f19af33"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/go-sockaddr/LICENSE;md5=9741c346eef56131163e13b9db1241b3 \
"
