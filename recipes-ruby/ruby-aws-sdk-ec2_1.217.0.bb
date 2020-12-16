SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "77ddef9c41d754a2887e26df096dea67"
SRC_URI[sha256sum] = "10ae579b97b920a13f2fc306b0ba0d1fd97f6780dfd16da2b3b3cc9a7793ce3f"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
