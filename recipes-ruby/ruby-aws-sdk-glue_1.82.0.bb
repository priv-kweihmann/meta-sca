SUMMARY = "RubyGem: aws-sdk-glue"
DESCRIPTION = "Official AWS Ruby gem for AWS Glue"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d1a62c0fee97d38bcaa429b040add21e"
SRC_URI[sha256sum] = "ad72dc3fe9d71cb21e9b666a66718e84281efe0565795f6cc6f55b178e9ad008"

GEM_NAME = "aws-sdk-glue"

inherit rubygems
