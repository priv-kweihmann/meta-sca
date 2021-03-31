SRC_URI_append = " https://proxy.golang.org/google.golang.org/grpc/@v/v1.36.1.zip;srcoutput=google.golang.org/grpc;srcinput=google.golang.org/grpc@v1.36.1;downloadfilename=google-golang-org-grpc-1.36.1.zip;name=google-golang-org-grpc"
SRC_URI[google-golang-org-grpc.sha256sum] = "1d23b0e633cc114966ab1e8eec18c5ac38cc55594a4215c4f801c914e84c5da5"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/google.golang.org/grpc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
