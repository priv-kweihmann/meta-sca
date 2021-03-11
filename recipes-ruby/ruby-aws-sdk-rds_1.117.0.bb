SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ec9eb81d6fa613a9689442045bad9ab9"
SRC_URI[sha256sum] = "caf43604847cca09f9bf9c0948b47a6bbd8eb6035a7f758b6dbf2ea3267b9d43"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
