SUMMARY = "RubyGem: aws-sdk-cloudwatchlogs"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Logs"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a5588810c9503e80d0121d4e1a2d1508"
SRC_URI[sha256sum] = "569584679bf9a8ba38db5d83c7caca032b7dea02d9dfa0fdd36acd1be02c5abd"

GEM_NAME = "aws-sdk-cloudwatchlogs"

inherit rubygems
