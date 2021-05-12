SRC_URI += "https://github.com/Shopify/sarama/archive/refs/tags/v1.28.0.zip;srcoutput=github.com/Shopify/sarama;srcinput=sarama-1.28.0;downloadfilename=github-com-shopify-sarama-1.29.0.zip;name=github-com-shopify-sarama"
SRC_URI[github-com-shopify-sarama.sha256sum] = "aa4a55ce4c95c45e4913e5e39c976fdf1028855f4ed1f00f702682a9fe3d5c6b"
GOSRC_REMOVEDIRS += "github.com/Shopify/sarama/examples"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Shopify/sarama/LICENSE;md5=1fa4320041cdb56ed9a992c3ff1eac7c \
"

GOSRC_INCLUDEGUARD += "github.com-shopify-sarama-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-davecgh-go-spew-sources.inc', '', 'github.com-davecgh-go-spew-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-eapache-go-resiliency-sources.inc', '', 'github.com-eapache-go-resiliency-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-eapache-go-xerial-snappy-sources.inc', '', 'github.com-eapache-go-xerial-snappy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-eapache-queue-sources.inc', '', 'github.com-eapache-queue-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-gokrb5-v8-sources.inc', '', 'github.com-jcmturner-gokrb5-v8-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-klauspost-compress-sources.inc', '', 'github.com-klauspost-compress-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pierrec-lz4-sources.inc', '', 'github.com-pierrec-lz4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rcrowley-go-metrics-sources.inc', '', 'github.com-rcrowley-go-metrics-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-scram-sources.inc', '', 'github.com-xdg-scram-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
