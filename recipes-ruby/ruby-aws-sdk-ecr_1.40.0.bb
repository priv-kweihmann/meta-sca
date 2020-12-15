SUMMARY = "RubyGem: aws-sdk-ecr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Registry (Amazon ECR)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "aad9310a51b303253f962813c8d14363"
SRC_URI[sha256sum] = "8f4ffb94b50f659dee66a198d2b56df1455a6379abe564d011569d22af7ab795"

GEM_NAME = "aws-sdk-ecr"

inherit rubygems
