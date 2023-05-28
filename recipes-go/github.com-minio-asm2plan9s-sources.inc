SRC_URI += "https://proxy.golang.org/github.com/minio/asm2plan9s/@v/v0.0.0-20200509001527-cdd76441f9d8.zip;srcoutput=github.com/minio/asm2plan9s;srcinput=github.com/minio/asm2plan9s@v0.0.0-20200509001527-cdd76441f9d8;downloadfilename=github-com-minio-asm2plan9s-0.0.0-20200509001527-cdd76441f9d8.zip;name=github-com-minio-asm2plan9s"
SRC_URI[github-com-minio-asm2plan9s.sha256sum] = "39a2e28284764fd5423247d7469875046d0c8c4c2773333abf1c544197e9d946"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/minio/asm2plan9s/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-minio-asm2plan9s-sources.inc"

