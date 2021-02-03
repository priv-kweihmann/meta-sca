SUMMARY = "RubyGem: aws-sdk-ecs"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Service (Amazon ECS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "97062e411253b09d2b7e6e2d50ae32c6"
SRC_URI[sha256sum] = "c07150ed83db01936792dcbb52896899d6f5214820fd0ded240c96da4e8d3462"

GEM_NAME = "aws-sdk-ecs"

inherit rubygems
