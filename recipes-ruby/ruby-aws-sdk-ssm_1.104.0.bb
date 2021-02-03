SUMMARY = "RubyGem: aws-sdk-ssm"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Systems Manager (SSM) (Amazon SSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "56e7c03ff778d184a871372689b6055e"
SRC_URI[sha256sum] = "395cc7c3fb14e06c69e475e66c27cccf7ef36b3d99954a0f44d5ac5da5eb70eb"

GEM_NAME = "aws-sdk-ssm"

inherit rubygems
