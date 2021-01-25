SUMMARY = "RubyGem: aws-sdk-secretsmanager"
DESCRIPTION = "Official AWS Ruby gem for AWS Secrets Manager"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "0f3712b12842142d7fadc52ddcdc2c86"
SRC_URI[sha256sum] = "836b1ca3ecc699217cbc48f898eaf8539fa6010d203eee2ac9829cab768b65df"

GEM_NAME = "aws-sdk-secretsmanager"

inherit rubygems
