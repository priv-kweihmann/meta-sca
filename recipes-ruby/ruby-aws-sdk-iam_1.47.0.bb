SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "cef345e34dd379a34ca07aa7d83ac01d"
SRC_URI[sha256sum] = "81095e639937024c54c1a3a405d54d4760c6acccf06d1c059d4ac7d922162598"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
