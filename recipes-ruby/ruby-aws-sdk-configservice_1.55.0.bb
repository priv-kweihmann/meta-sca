SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a61c6c00287be08cd917fc8f3daec9a5"
SRC_URI[sha256sum] = "4b6c7c7e1b0b93a37b16376d6851d7adf47cd87a61612e7a556dd08422a602c9"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
