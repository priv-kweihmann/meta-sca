SRC_URI_append = " https://proxy.golang.org/github.com/google/trillian/@v/v1.3.13.zip;srcoutput=github.com/google/trillian;srcinput=github.com/google/trillian@v1.3.13;downloadfilename=github-com-google-trillian-1.3.13.zip;name=github-com-google-trillian"
SRC_URI[github-com-google-trillian.sha256sum] = "7590c664eab4cda1161bf88b0e6cec04657370d793793a48bfce96b421563d1a"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/google/trillian/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
