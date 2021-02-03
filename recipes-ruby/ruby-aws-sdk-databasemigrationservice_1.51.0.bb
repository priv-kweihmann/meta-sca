SUMMARY = "RubyGem: aws-sdk-databasemigrationservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Database Migration Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9762b1046a760147047d2929ebbbe7a3"
SRC_URI[sha256sum] = "8144b97fc81ca474d7aa3c2212fbd79410578baff11eaa4f6ab3350116be5f53"

GEM_NAME = "aws-sdk-databasemigrationservice"

inherit rubygems
