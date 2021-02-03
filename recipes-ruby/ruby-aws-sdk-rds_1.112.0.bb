SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "52a03e94e109c134c63e160ca0375d1d"
SRC_URI[sha256sum] = "b34bdebc80b252ecb165543328f7a5583dbae2ddd7e410c5de23684ffe99d5ca"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
