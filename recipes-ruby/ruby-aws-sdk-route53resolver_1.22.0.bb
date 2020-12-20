SUMMARY = "RubyGem: aws-sdk-route53resolver"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Resolver (Route53Resolver)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2ce47a8501fe263eed96aa77e1090b09"
SRC_URI[sha256sum] = "37f5cd30d50e1318ca62a17efb9515929e04d99e9a2c0520d20ae50d0415920f"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
