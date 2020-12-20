SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ab7029a7406c584d7b2fc8bf1f425f4b"
SRC_URI[sha256sum] = "badd5393471aec333b0e032084d94c27e839eedce4342b21fd3f4ca0af09c844"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
