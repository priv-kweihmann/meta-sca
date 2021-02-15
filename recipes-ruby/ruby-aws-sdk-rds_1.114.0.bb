SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d91feb12ea0da5082b05ed8ea5e22b66"
SRC_URI[sha256sum] = "9b9f3d5b374826508d95cdffa84dd029a8e3c794fba1855cbe119acfae8faf01"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
