SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4324b4a093c2da6bdb39f15b699de69e"
SRC_URI[sha256sum] = "8e4dac08eef0504109c6abc74026ed036c9040d19bf264d30a09be905c475347"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
