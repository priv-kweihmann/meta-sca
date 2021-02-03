SUMMARY = "RubyGem: aws-sdk-firehose"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis Firehose (Firehose)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1e49176375a9eb58c09f50b8b4302fac"
SRC_URI[sha256sum] = "177409cd5e0e702d4fbfccd3034fe533356e22c369b667bc96d3e6ebf02e274a"

GEM_NAME = "aws-sdk-firehose"

inherit rubygems
