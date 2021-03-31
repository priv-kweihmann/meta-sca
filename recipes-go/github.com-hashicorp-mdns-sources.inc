SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/mdns/@v/v1.0.3.zip;srcoutput=github.com/hashicorp/mdns;srcinput=github.com/hashicorp/mdns@v1.0.3;downloadfilename=github-com-hashicorp-mdns-1.0.3.zip;name=github-com-hashicorp-mdns"
SRC_URI[github-com-hashicorp-mdns.sha256sum] = "932a18b9cf8d29b9a4b9aca614751f4b65c81b8dcfc9c6159067a25d93e1d236"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/mdns/LICENSE;md5=cb04212e101fbbd028f325e04ad45778 \
"
