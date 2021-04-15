SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4afccb76439c4e2851b9de6fb0a42a24"
SRC_URI[sha256sum] = "f56f210d9c34c515f889eaafe3f22e16f1378eb3fd749ebb818efdd553f7592a"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
