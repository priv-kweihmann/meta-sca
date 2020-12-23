SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8becd3ca4a554d7cd9fed888235dd490"
SRC_URI[sha256sum] = "0327eb6c878696492d2b56f3406e6b5c15de927f71e1179bfff77b0a9d3406fe"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
