SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7327cdb979e05f6ffe00dfa737e4ff58"
SRC_URI[sha256sum] = "30ae9dad2a0ed2967c7e863da7f1158610351e0b1a59de31f365834fe7c3c181"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
