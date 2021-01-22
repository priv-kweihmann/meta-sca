SUMMARY = "RubyGem: aws-sdk-kafka"
DESCRIPTION = "Official AWS Ruby gem for Managed Streaming for Kafka (Kafka)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c63f7b1c86c773385c0c356d70b6b59c"
SRC_URI[sha256sum] = "505502d45686e183f850fba4728c3086ce12e60189e8bcf3a7d1108bfbb1f441"

GEM_NAME = "aws-sdk-kafka"

inherit rubygems
