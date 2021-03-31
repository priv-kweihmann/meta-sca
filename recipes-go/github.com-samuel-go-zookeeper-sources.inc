SRC_URI_append = " https://proxy.golang.org/github.com/samuel/go-zookeeper/@v/v0.0.0-20201211165307-7117e9ea2414.zip;srcoutput=github.com/samuel/go-zookeeper;srcinput=github.com/samuel/go-zookeeper@v0.0.0-20201211165307-7117e9ea2414;downloadfilename=github-com-samuel-go-zookeeper-0.0.0-20201211165307-7117e9ea2414.zip;name=github-com-samuel-go-zookeeper"
SRC_URI[github-com-samuel-go-zookeeper.sha256sum] = "dfb2050d8a255c57a131d01b3ab7c8d960a9860cd23a03f0208ee2b96f23c8f3"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/samuel/go-zookeeper/LICENSE;md5=0d3bff996e9a8f99d8ba45af7c9f6da7 \
"
