SUMMARY = "RubyGem: aws-sdk-route53resolver"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Resolver (Route53Resolver)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6adca51c8f58bcb276fa5fb1f1e80ac4"
SRC_URI[sha256sum] = "7438d69c2d8f54cb6eff2b74faf5b9c007cacca24e318b650756940d8815cbe3"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
