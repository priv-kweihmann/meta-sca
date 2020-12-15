SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fdb22ace6ac4841784ddf656cf967307"
SRC_URI[sha256sum] = "ed690b1a3ab4ac5f0ef81d99ed182159a5df08e760a542bb5ff90302876ac9d2"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
