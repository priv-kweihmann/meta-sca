SRC_URI += "https://proxy.golang.org/github.com/go-zookeeper/zk/@v/v1.0.2.zip;srcoutput=github.com/go-zookeeper/zk;srcinput=github.com/go-zookeeper/zk@v1.0.2;downloadfilename=github-com-go-zookeeper-zk-1.0.2.zip;name=github-com-go-zookeeper-zk"
SRC_URI[github-com-go-zookeeper-zk.sha256sum] = "6f91aecf62ffb4d7468eb14372d1e43b8620eb341964b5001e85151b46caed4f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-zookeeper/zk/LICENSE;md5=0d3bff996e9a8f99d8ba45af7c9f6da7 \
"

GOSRC_INCLUDEGUARD += "github.com-go-zookeeper-zk-sources.inc"

