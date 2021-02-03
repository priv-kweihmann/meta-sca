SUMMARY = "RubyGem: aws-sdk-route53domains"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Domains"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "669bd6f81fb36ebb9b40595081478ed1"
SRC_URI[sha256sum] = "cf03598630b62cd7b6432f806df08e0279b3417f10c2f52b71d6c19af0196b4c"

GEM_NAME = "aws-sdk-route53domains"

inherit rubygems
