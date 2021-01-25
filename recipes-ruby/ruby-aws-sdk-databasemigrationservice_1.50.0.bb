SUMMARY = "RubyGem: aws-sdk-databasemigrationservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Database Migration Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d7d0a078e79e310f498937d805b21e83"
SRC_URI[sha256sum] = "f6be1f898c7d90c02c87999848dd08ddacadbc20c59d704eef02091c7e51a4ed"

GEM_NAME = "aws-sdk-databasemigrationservice"

inherit rubygems
