SRC_URI_append = " https://github.com/Shopify/sarama/archive/refs/tags/v1.28.0.zip;srcoutput=github.com/Shopify/sarama;srcinput=sarama-1.28.0;downloadfilename=github-com-shopify-sarama-1.28.0.zip;name=github-com-shopify-sarama"
SRC_URI[github-com-shopify-sarama.sha256sum] = "aa4a55ce4c95c45e4913e5e39c976fdf1028855f4ed1f00f702682a9fe3d5c6b"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/Shopify/sarama/LICENSE;md5=1fa4320041cdb56ed9a992c3ff1eac7c \
"
