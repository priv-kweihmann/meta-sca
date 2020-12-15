SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e1ff32ac91fb905a506124eb96b0a774"
SRC_URI[sha256sum] = "e7ddd8e5c4c62bcdc27f8a511f0ed7db3ce9c04ca9c64d8a75d5e354cfa714c8"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
