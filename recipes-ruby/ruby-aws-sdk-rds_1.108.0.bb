SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a21f3546889039feb0026f1054485fc0"
SRC_URI[sha256sum] = "da993a54410bfa954d5ead1c4e5ebf386a45fd7bc189c19fda9024c4ffcbbce6"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
