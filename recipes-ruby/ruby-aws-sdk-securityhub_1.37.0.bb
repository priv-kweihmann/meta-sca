SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e678fe4241c6d08e039d4cd9c50d5550"
SRC_URI[sha256sum] = "1190b5419a2ad479e76b02bfa945e54f3703789c194c7f3ef4be4a03f5621826"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
