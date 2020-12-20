SUMMARY = "RubyGem: aws-sdk-sqs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Queue Service (Amazon SQS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2c7d8277198849dcb38515bd97a5c4c9"
SRC_URI[sha256sum] = "b7ae9cedcf21b78a637c39f54a58bfba45ad04fcba4aea01b05a9bea4a601b8d"

GEM_NAME = "aws-sdk-sqs"

inherit rubygems
