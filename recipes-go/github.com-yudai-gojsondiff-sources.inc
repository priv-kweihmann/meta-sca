SRC_URI_append = " https://proxy.golang.org/github.com/yudai/gojsondiff/@v/v1.0.0.zip;srcoutput=github.com/yudai/gojsondiff;srcinput=github.com/yudai/gojsondiff@v1.0.0;downloadfilename=github-com-yudai-gojsondiff-1.0.0.zip;name=github-com-yudai-gojsondiff"
SRC_URI[github-com-yudai-gojsondiff.sha256sum] = "90c457b595a661a25760d9f10cfda3fec27f7213c0e7026a5b97b30168e8f2d1"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/yudai/gojsondiff/LICENSE;md5=a828e909ffdf323a651b97c768b42f8c \
"
