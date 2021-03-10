SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d1384ebf739211d5ae29be23b8d1ac32"
SRC_URI[sha256sum] = "13983babe93558003e82e18d4bd192201f1a85da2e20b852d245dd187b07f238"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
