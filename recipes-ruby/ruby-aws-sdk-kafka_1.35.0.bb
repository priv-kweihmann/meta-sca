SUMMARY = "RubyGem: aws-sdk-kafka"
DESCRIPTION = "Official AWS Ruby gem for Managed Streaming for Kafka (Kafka)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4a92142517165a0e322f31c3fa4c5ee1"
SRC_URI[sha256sum] = "2690ebf4a167eea960b688025b0cb3449e2e522f70544abbc3d25084624f2a66"

GEM_NAME = "aws-sdk-kafka"

inherit rubygems
