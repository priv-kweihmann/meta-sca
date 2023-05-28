SRC_URI += "https://proxy.golang.org/github.com/minio/c2goasm/@v/v0.0.0-20190812172519-36a3d3bbc4f3.zip;srcoutput=github.com/minio/c2goasm;srcinput=github.com/minio/c2goasm@v0.0.0-20190812172519-36a3d3bbc4f3;downloadfilename=github-com-minio-c2goasm-0.0.0-20190812172519-36a3d3bbc4f3.zip;name=github-com-minio-c2goasm"
SRC_URI[github-com-minio-c2goasm.sha256sum] = "04367ddf0fc5cd0f293e2c4f1acefb131b572539d88b5804d92efc905eb718b5"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/minio/c2goasm/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-minio-c2goasm-sources.inc"

