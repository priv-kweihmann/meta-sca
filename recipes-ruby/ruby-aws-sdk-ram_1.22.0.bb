SUMMARY = "RubyGem: aws-sdk-ram"
DESCRIPTION = "Official AWS Ruby gem for AWS Resource Access Manager (RAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1f6e6e63fc8bf03e53170576c2a6614a"
SRC_URI[sha256sum] = "4bfe82caed2c06a814f6ae2d65e0400a53ec67dd8631a0fd0f7daa9eede8c912"

GEM_NAME = "aws-sdk-ram"

inherit rubygems
