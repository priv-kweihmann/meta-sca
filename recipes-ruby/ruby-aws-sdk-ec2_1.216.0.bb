SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a4c3f360c8c1725ba22ac56c1fb20eb0"
SRC_URI[sha256sum] = "895f7f9b1e5ecd92e2cb6e9ecf644ce9fc45cf6f4e60a3045ac6cf41b78e9ece"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
