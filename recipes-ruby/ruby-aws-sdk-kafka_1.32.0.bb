SUMMARY = "RubyGem: aws-sdk-kafka"
DESCRIPTION = "Official AWS Ruby gem for Managed Streaming for Kafka (Kafka)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b89cd4ad1ce640983dbf4e356fc62d9b"
SRC_URI[sha256sum] = "84b90b8ef1137b5a4947238edf6d23da3147de56c17acc93030a82fff33489f6"

GEM_NAME = "aws-sdk-kafka"

inherit rubygems
