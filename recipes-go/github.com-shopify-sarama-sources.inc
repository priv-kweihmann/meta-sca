SRC_URI += "git://github.com/Shopify/sarama;nobranch=1;protocol=https;srcinput=github.com/Shopify/sarama;srcoutput=github.com/Shopify/sarama;destsuffix=github.com/Shopify/sarama;name=github-com-shopify-sarama"
SRCREV_github-com-shopify-sarama = "40ab0cd38de3bd69f355bc4eba63d92657b3b1a7"
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
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-gofork-sources.inc', '', 'github.com-jcmturner-gofork-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-gokrb5-v8-sources.inc', '', 'github.com-jcmturner-gokrb5-v8-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-klauspost-compress-sources.inc', '', 'github.com-klauspost-compress-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pierrec-lz4-sources.inc', '', 'github.com-pierrec-lz4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rcrowley-go-metrics-sources.inc', '', 'github.com-rcrowley-go-metrics-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xdg-go-scram-sources.inc', '', 'github.com-xdg-go-scram-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
