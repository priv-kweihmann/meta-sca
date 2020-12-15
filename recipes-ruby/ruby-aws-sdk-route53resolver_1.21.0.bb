SUMMARY = "RubyGem: aws-sdk-route53resolver"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Resolver (Route53Resolver)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a1dd914b27f34ae3b402724b4894cc00"
SRC_URI[sha256sum] = "75e34cf140bf8595f963cde209ab9f2ac811ccf2a18b0a4c72a0119f3b69c8b4"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
