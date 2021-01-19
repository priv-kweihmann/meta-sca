SUMMARY = "RubyGem: aws-sdk-ecs"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Service (Amazon ECS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "0d543cc3c93c34d2d6a1efa3f7b778da"
SRC_URI[sha256sum] = "b7eecf50d5d7a0bee36c6cb442f5e038e219653d923b9743c91bc57c16dc8d6a"

GEM_NAME = "aws-sdk-ecs"

inherit rubygems
