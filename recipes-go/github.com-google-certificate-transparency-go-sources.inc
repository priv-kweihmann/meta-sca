SRC_URI_append = " https://proxy.golang.org/github.com/google/certificate-transparency-go/@v/v1.1.1.zip;srcoutput=github.com/google/certificate-transparency-go;srcinput=github.com/google/certificate-transparency-go@v1.1.1;downloadfilename=github-com-google-certificate-transparency-go-1.1.1.zip;name=github-com-google-certificate-transparency-go"
SRC_URI[github-com-google-certificate-transparency-go.sha256sum] = "43abc25efa5e981a6b6a15f04a11c03bc925359c67cad5f4227733fbe51ae491"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/google/certificate-transparency-go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/google/certificate-transparency-go/third_party/prometheus/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
