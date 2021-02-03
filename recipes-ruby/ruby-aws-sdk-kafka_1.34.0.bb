SUMMARY = "RubyGem: aws-sdk-kafka"
DESCRIPTION = "Official AWS Ruby gem for Managed Streaming for Kafka (Kafka)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4700d866c3a6cfcb73f50cb64434cf11"
SRC_URI[sha256sum] = "9e081ba0b8b22a5972fcac09baeb98281ba2cba2d849b03e48bcc345940f4fa0"

GEM_NAME = "aws-sdk-kafka"

inherit rubygems
