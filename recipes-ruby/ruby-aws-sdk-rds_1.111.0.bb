SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9ab70c0a6c06380c23f167e10a93f9dc"
SRC_URI[sha256sum] = "17548454764ad1be3dfe6aba3a8025d4f603279a9533560435bb5cf92f5d2745"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
