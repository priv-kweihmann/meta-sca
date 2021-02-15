SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a7f875939553eb26219418597fd62bfc"
SRC_URI[sha256sum] = "12f842241a8bc2a09f292c94b673e3c7265ddabe30736b931a459d6cccc2ba0b"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
