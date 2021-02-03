SUMMARY = "RubyGem: aws-sdk-ecr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Registry (Amazon ECR)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4d10e504a01c3321e5a23e9080d9a37e"
SRC_URI[sha256sum] = "1bf27b4bfbef2ad727013495f3a781e2d4b9ac1c14f58b852d547d7f5bd22836"

GEM_NAME = "aws-sdk-ecr"

inherit rubygems
