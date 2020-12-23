SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "861967dcae85ea521b75e940350e1227"
SRC_URI[sha256sum] = "eac7576e9e07a0d53b2fddc9590dc81324ae0c6f44aa552b90fd1dd1e8e070f4"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
